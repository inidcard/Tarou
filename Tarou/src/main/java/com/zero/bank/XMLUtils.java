package com.zero.bank;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * 通过JDOM解析XML文件 将字符串格式的XML文件转换为XML的document
 * 
 */

// 将String转换成XML
public class XMLUtils {

    public static Document str2XML(String string) throws Exception {

        SAXBuilder buider = new SAXBuilder();

        Document document = buider.build(new StringReader(string));

        return document;

    }
    
    //将XML转换成String输出
    public static String xml2Str(String file) throws Exception {

        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build(new FileInputStream(new File(file)));

        Format format = Format.getCompactFormat();
        format.setEncoding("UTF-8");// 设置xml文件的字符为UTF-8，解决中文问题
        XMLOutputter xmlout = new XMLOutputter();
        
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        xmlout.output(document, bo);
        return bo.toString().trim();
        
    }

    // 将XML以键值对的形式输出,对于有两层以上的XML文件
    public static Map<String, String> paraseXML(String file) throws Exception {

        Map<String, String> map = new HashMap<String, String>();

        SAXBuilder builder = new SAXBuilder();
        Document document = builder.build(new File(file));

        Element root = document.getRootElement();

        List<Element> list = root.getChildren();
        for (Iterator<Element> iterator = list.iterator(); iterator.hasNext();) {

            Element firstChild = iterator.next();
            List<Element> secondElements = firstChild.getChildren();

            for (Iterator<Element> iterator2 = secondElements.iterator(); iterator2
                    .hasNext();) {

                Element secondElement = iterator2.next();
                map.put(secondElement.getName(), secondElement.getText());
            }

        }

        return map;
    }
    
    
    public static void main(String[] args) throws Exception {

        String str = "<students><Student><name>zhangsan</name><age>18</age><name>lisi</name><age>28</age></Student></students>";
        Document document = str2XML(str);
        Element root = document.getRootElement();
        System.out.println(root.getName());
        System.out.println(root.getChildText("name"));

        XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat()
                .setIndent("     "));
        FileOutputStream fos = new FileOutputStream(new File(
                "date\\string2xml.xml"));
        outputter.output(document, fos);
        fos.close();
        
        String xmlContent = xml2Str("date\\string2xml.xml");
        System.out.println("XML的内容为： "+ "\n" + xmlContent);
        
        Map<String, String> xmlMap = new HashMap<String, String>();
        xmlMap = paraseXML("date\\string2xml.xml");
        Set<String> keysSet = xmlMap.keySet();
        for(String key: keysSet){
            
            String value = xmlMap.get(key);
            System.out.println(key + " = " + value);
        }
        

    }

}