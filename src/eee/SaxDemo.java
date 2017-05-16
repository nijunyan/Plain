package eee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;



interface XmlDocument {
    public void parserXml(String fileName);
}



public class SaxDemo implements XmlDocument {

    public void parserXml(String fileName) {
        SAXParserFactory saxfac = SAXParserFactory.newInstance();

        try {
            SAXParser saxparser = saxfac.newSAXParser();
            InputStream is = new FileInputStream(fileName);
            saxparser.parse(is, new MySAXHandler());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
    	new SaxDemo().parserXml("theFile.xml");
    }
}

class MySAXHandler extends DefaultHandler {
    boolean hasAttribute = false;
    Attributes attributes = null;

    public void startDocument() throws SAXException {
        // System.out.println("文档开始打印了");
    }

    public void endDocument() throws SAXException {
        // System.out.println("文档打印结束了");
    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        /*if (qName.equals("users")) {
            return;
        }
        if (qName.equals("user")) {
            return;
        }*/
    	System.out.println(qName);
        if (attributes.getLength() > 0) {
            this.attributes = attributes;
            this.hasAttribute = true; 
        }
        
       if (hasAttribute && (attributes != null)) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println(i + " " + attributes.getQName(i) + ":"
                        + attributes.getValue(i));
                
            }
        }
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {
    	
    	//System.out.println("<>");
        if (hasAttribute && (attributes != null)) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(i + " " + attributes.getQName(i) + ":"
                        + attributes.getValue(i));
            }
        }
    	System.out.println(qName);
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
    	String s = new String(ch, start, length);
    	s = s.replaceAll(" ", "").replaceAll("\n", "");
    	//System.out.println(s+"okokok");
    	if ( !s.equals("") )
    		System.out.println(new String(s));
    		//System.out.println(new String(ch, start, length));
    }
}