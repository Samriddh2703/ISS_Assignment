package ISSTask1;

//Point 10: XML
import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlExample {
    public static void main(String[] args) {
        try {
            // Creating a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Creating a new XML document
            Document document = builder.newDocument();

            // Creating root element
            Element rootElement = document.createElement("employees");
            document.appendChild(rootElement);

            // Creating employee elements
            for (int i = 1; i <= 3; i++) {
                Element employeeElement = document.createElement("employee");
                rootElement.appendChild(employeeElement);

                // Adding attributes to employee elements
                employeeElement.setAttribute("id", String.valueOf(i));

                // Adding child elements to employee elements
                Element nameElement = document.createElement("name");
                nameElement.appendChild(document.createTextNode("Employee " + i));
                employeeElement.appendChild(nameElement);
            }

            // Writing the XML document to a file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Specify the file path
            File file = new File(System.getProperty("user.dir") + File.separator + "employees.xml");
            StreamResult result = new StreamResult(file);
            transformer.transform(new DOMSource(document), result);

            System.out.println("XML document created successfully. File saved at: " + file.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

