package main.java.http;

import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;

/**
 * Created by Emma on 2018/8/8.
 */
public class CreateXml {
    public static void main(String[] args) {
        try{

            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            org.w3c.dom.Document document=documentBuilder.newDocument();
            Element root=document.createElement("Languages");
            root.setAttribute("cat","it");

            Element lan1=document.createElement("lan");
            lan1.setAttribute("id","1");
            Element name1=document.createElement("name");
            name1.setTextContent("Java");
            Element ide1=document.createElement("ide");
            ide1.setTextContent("Eclipse");
            lan1.appendChild(name1);
            lan1.appendChild(ide1);


            Element lan2=document.createElement("lan");
            lan2.setAttribute("id","2");
            Element name2=document.createElement("name");
            name2.setTextContent("Swift");
            Element ide2=document.createElement("ide");
            ide2.setTextContent("Xcode");
            lan2.appendChild(name2);
            lan2.appendChild(ide2);


            root.appendChild(lan1);
            root.appendChild(lan2);
            document.appendChild(root);

            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            StringWriter writer=new StringWriter();
            transformer.transform(new DOMSource(document),new StreamResult(writer));
            System.out.println(writer.toString());

            transformer.transform(new DOMSource(document),new StreamResult(new File("myfile.xml")));
        }
        catch(ParserConfigurationException e){
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }


    }



}
