package com.spring.wx.utils.httptool;


import com.spring.wx.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;


/**
 * Created by wgq on 16-4-2.
 */
public class CustomHttpsConnection {

    private static Logger log = LoggerFactory.getLogger(CustomHttpsConnection.class) ;

    private String urlCustom ;

    private int timeout = 5000 ;

    private String requestMethod = "GET" ;

    private String contentType = "application/x-www-form-urlencoded" ;

    public String httpsClient(String requsetMessage){
        log.info("https请求开始~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        HttpsURLConnection conn = this.getHttpsUrlConnection() ;

        try{
            if(!StringUtils.isEmpty(requsetMessage)) {
                conn.setDoOutput(true);
                conn.setRequestProperty("Content-Length", String.valueOf(requsetMessage.length()));
            }

            if("GET".equalsIgnoreCase(this.requestMethod)) {
                conn.connect();
            }

            if(!StringUtils.isEmpty(requsetMessage)) {
                postMsg(requsetMessage, conn.getOutputStream()) ;
            }

            if(conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                log.debug("请求出错,错误代码：" + conn.getResponseCode());
                return null ;
            }

            String responseMsg = inputStreamToString(conn.getInputStream()) ;
            log.info("url = " + urlCustom + "requestMethod = " + requestMethod);
            log.info("responseMsg = " + responseMsg);
            log.info("https请求结束~~~~~~~~~~~~~~~~~~~~~~~~~~");
            return responseMsg ;
        }catch (IOException e) {
            //e.printStackTrace();
            log.warn("https请求出现错误：" + e.getMessage());
        }finally {

        }

        return null ;
    }

    private HttpsURLConnection getHttpsUrlConnection() {
        try {
            URL url = new URL(urlCustom) ;
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setConnectTimeout(timeout);
            conn.setRequestMethod(requestMethod);
            conn.setRequestProperty("Accept-Charset", "utf-8");
            if("POST".equals(requestMethod)) {
                conn.setDoOutput(true);     //post请求需要打开

            }
            conn.setSSLSocketFactory(this.createSSLSocketFactory());
            conn.setRequestProperty("Content-Type", contentType);

            return conn ;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            log.warn("获取HttpsUrlConnection对象出错：" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            log.warn("获取HttpsUrlConnection对象出错：" + e.getMessage());
        }
        return null ;
    }

    private SSLSocketFactory createSSLSocketFactory() {
        TrustManager[] tm = { new MyTrustManager() };
        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }

        SSLSocketFactory ssf = sslContext.getSocketFactory();

        return ssf ;
    }

    //post发送String消息
    private void postMsg(String requsetMessage,OutputStream outputStream) {

        try {
            outputStream.write(requsetMessage.getBytes("UTF-8"));
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //get和post返回的流转换成String
    private String inputStreamToString(InputStream inputStream) {

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream) ;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader) ;
        StringBuilder sb = new StringBuilder() ;
        String readLine ;
        try {
            while((readLine = bufferedReader.readLine()) != null) {
                sb.append(readLine) ;
            }

            return sb.toString() ;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return null ;
    }

    private CustomHttpsConnection() {}

    public CustomHttpsConnection(String urlCustom) {
        this(urlCustom,0,"","") ;
    }

    public CustomHttpsConnection(String urlCustom,String requestMethod) {
        this(urlCustom,0,requestMethod,"") ;
    }

    public CustomHttpsConnection(String urlCustom, int timeout, String requestMethod, String contentType) {
        this.urlCustom = urlCustom ;
        if(timeout != 0) {
            this.timeout = timeout;
        }
        if(!StringUtils.isEmpty(requestMethod)) {
            this.requestMethod = requestMethod;
        }
        if(!StringUtils.isEmpty(contentType)) {
            this.contentType = contentType;
        }
    }

    public String getUrlCustom() {
        return urlCustom;
    }

    public void setUrlCustom(String urlCustom) {
        this.urlCustom = urlCustom;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "CustomHttpsConnection{" +
                "urlCustom='" + urlCustom + '\'' +
                ", timeout=" + timeout +
                ", requestMethod='" + requestMethod + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomHttpsConnection that = (CustomHttpsConnection) o;

        if (requestMethod != null ? !requestMethod.equals(that.requestMethod) : that.requestMethod != null)
            return false;
        if (urlCustom != null ? !urlCustom.equals(that.urlCustom) : that.urlCustom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlCustom != null ? urlCustom.hashCode() : 0;
        result = 31 * result + (requestMethod != null ? requestMethod.hashCode() : 0);
        return result;
    }
}
