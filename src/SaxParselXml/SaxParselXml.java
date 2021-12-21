package SaxParselXml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxParselXml {
    public static void main(String[] args) {
        final String fileName = "D:\\Users\\shchehlyuk-b-p\\Desktop\\JAVA\\HomeTraining\\src\\SaxParselXml\\file";
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
// cтворюємо анонімний клас
            DefaultHandler handler = new DefaultHandler() {
                boolean name = false;

                // метод визивається, коли зчитувач натикається на початок тегу
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("home")) {
                        name = true;
                    }
                }

                // метод, щоб зчитати текст між тегами
                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (name) {
                        System.out.println("home:" + new String(ch, start, length));
                        name = false;
                    }
                }
            };
            saxParser.parse(fileName, handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
