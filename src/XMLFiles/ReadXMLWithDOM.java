package XMLFiles;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class ReadXMLWithDOM {
    public static void main(String[] args) {
        try {
            // Create DocumentBuilder
            File xmlFile = new File("employees.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(".\\data\\employees.xml");
            
            // Normalize the XML structure
            document.getDocumentElement().normalize();
            
            // Get root element
            Element root = document.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());
            
            // Get company name
            String companyName = document.getElementsByTagName("name").item(0).getTextContent();
            System.out.println("Company: " + companyName);
            
            // Get all employees
            NodeList employeeList = document.getElementsByTagName("employee");
            System.out.println("\nTotal Employees: " + employeeList.getLength());
            
            // Loop through employees
            for (int i = 0; i < employeeList.getLength(); i++) {
                Node employeeNode = employeeList.item(i);
                
                if (employeeNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element employee = (Element) employeeNode;
                    
                    String id = employee.getAttribute("id");
                    String firstName = employee.getElementsByTagName("firstName").item(0).getTextContent();
                    String lastName = employee.getElementsByTagName("lastName").item(0).getTextContent();
                    String department = employee.getElementsByTagName("department").item(0).getTextContent();
                    String position = employee.getElementsByTagName("position").item(0).getTextContent();
                    String salary = employee.getElementsByTagName("salary").item(0).getTextContent();
                    
                    System.out.println("\n--- Employee " + (i + 1) + " ---");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + firstName + " " + lastName);
                    System.out.println("Department: " + department);
                    System.out.println("Position: " + position);
                    System.out.println("Salary: $" + salary);
                    
                    // Get skills
                    NodeList skills = employee.getElementsByTagName("skill");
                    System.out.println("Skills:");
                    for (int j = 0; j < skills.getLength(); j++) {
                        Element skill = (Element) skills.item(j);
                        String skillName = skill.getTextContent();
                        String level = skill.getAttribute("level");
                        System.out.println("  - " + skillName + " (" + level + ")");
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}