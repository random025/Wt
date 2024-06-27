import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class Parsing_DOm1 {

  public static void main(String args[]) {
    try {
      System.out.println("enter the file name");
      BufferedReader input = new BufferedReader(
        new InputStreamReader(System.in)
      );
      String file_name = input.readLine();
      File fp = new File(file_name);
      if (fp.exists()) {
        DocumentBuilderFactory factory_obj = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory_obj.newDocumentBuilder();
        InputSource ip_src = new InputSource(file_name);
        Document doc = builder.parse(ip_src);
        NodeList temp_list = doc.getElementsByTagName("*");
        System.out.println("\nfollowing are the elements in " + file_name);
        for (int i = 0; i < temp_list.getLength(); i++) {
          Element E = (Element) temp_list.item(i);

          System.out.println("\t" + E.getNodeName());
        }
      } else {
        System.out.println("file not found");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
// output
// enter the file name
// student.xml
// following are the elements in student.xml
//         class
//         student
//         firstname
//         lastname
//         nickname
//         marks
//         student
//         firstname
//         lastname
//         nickname
//         marks
//         student
//         firstname
//         lastname
//         nickname
//         marks
