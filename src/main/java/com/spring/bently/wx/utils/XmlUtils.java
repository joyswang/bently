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
    public static Map xmlToMap(InputStream inputStream) {
        SAXReader reader = new SAXReader() ;
        reader.setEncoding("UTF-8");
        Map map = new HashMap() ;
        try {
            Document document = reader.read(inputStream) ;
            Element root = document.getRootElement() ;
            for(Iterator it = root.elementIterator();it.hasNext();) {
                Element element = (Element) it.next() ;
                map.put(element.getName(),element.getText()) ;
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return map ;
    }

    public static void mapToXml(Map map) {


    }
}
