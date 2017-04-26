package net.ukr.dreamsicle.Lesson2XMLandJSON;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by Yura on 18.04.2017.
 */
public class MyClassTask3 extends DefaultHandler {

    private boolean bAuthor;

    @Override
    public void startDocument() {
        System.out.println("Document started...");
    }

    @Override
    public void endDocument() {
        System.out.println("Document ends...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) {
        System.out.println("Element: " + localName);
        bAuthor = localName.equals("author");
    }

    @Override
    public void characters (char ch[], int start, int length) {
        if (bAuthor) {
            System.out.println("Author value: " + new String(ch, start, length));
            bAuthor = false;
        }
    }

    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();

        XMLReader xmlReader = saxParser.getXMLReader();
        xmlReader.setContentHandler((ContentHandler) new MyClassTask3());
        xmlReader.parse("file:///c:/1.xml");
    }
}
