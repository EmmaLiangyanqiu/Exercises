package http;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import java.util.List;

import static jdk.nashorn.internal.parser.TokenType.XML;

/**
 * Created by Emma on 2018/8/8.
 */
public class XmlTransJson {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("myfile.xml"));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(writer));
            String xml = writer.toString();





            Element root = document.getDocumentElement();




            System.out.println(root.getLastChild().getNodeName());
            JSONObject object = new JSONObject();
//            object.put(root.getTagName(),iterateElement(root));






        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* 第一种方法，使用JSON-JAVA提供的方法 */
        //将xml转为json
    }



  /*  public static JSONObject iterateElement(Element element){
        List node=(List) element.getChildNodes();
        Element et=null;
        JSONObject obj=new JSONObject();
        List list=null;
        for (int i = 0; i <node.size() ; i++) {
            et=(Element) node.get(i);
            if (et.getTextContent().trim().equals("")){
                if(et.getChildNodes().getLength())

            }else{                                         //表示没有子节点有值
                if (obj.containsKey(et.getTagName())){
                    list=(List) obj.get(et.getTagName());
                }
                list.add(et.getTextContent().trim());
                obj.put(et.getTagName(),list);
            }

        }
        return obj;
    }*/

}
