import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class XMLParserExample {

    public static void main(String[] args) {
        try {
            // Step 1: Create a SAXParserFactory and configure it
            SAXParserFactory factory = SAXParserFactory.newInstance();

            // Step 2: Create a SAXParser
            SAXParser saxParser = factory.newSAXParser();

            // Step 3: Parse the XML file using a handler
            File xmlFile = new File("note.xml");
            saxParser.parse(xmlFile, new MyHandler());

            System.out.println("XML document is well-formed.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error parsing XML: " + e.getMessage());
        }
    }

    // Custom SAX handler to handle XML events
    private static class MyHandler extends DefaultHandler {

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            System.out.println("Start Element: " + qName);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            System.out.println("End Element: " + qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String content = new String(ch, start, length).trim();
            if (!content.isEmpty()) {
                System.out.println("Text: " + content);
            }
        }
    }
}
