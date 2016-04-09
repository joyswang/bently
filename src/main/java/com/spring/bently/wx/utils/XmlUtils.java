package com.spring.bently.wx.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wgq on 16-4-4.
 */
public class XmlUtils {

    //微信xml-to-map
    public static Map<String,String> xmlToMap(InputStream inputStream) {
        SAXReader reader = new SAXReader() ;
        reader.setEncoding("UTF-8");
        Map<String,String> map = new HashMap<String,String>() ;
        try {
            Document document = reader.read(inputStream) ;
            Element root = document.getRootElement() ;
            for(Iterator it = root.elementIterator();it.hasNext();) {
                Element element = (Element) it.next() ;
                map.put(element.getName().toLowerCase(),element.getText().toLowerCase()) ;
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return map ;
    }

    public static void mapToXml(Map map) {


    }
}
