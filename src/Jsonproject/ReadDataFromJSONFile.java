package Jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {

    public static void main(String[] args) {
        
        JSONParser jsonparser = new JSONParser();
        
        try (FileReader reader = new FileReader("./jsonfiles/employee.json")) {
            
            Object obj = jsonparser.parse(reader);
            JSONObject empjson = (JSONObject) obj;
            
            // Read simple fields
            String fname = (String) empjson.get("firstname");
            String lname = (String) empjson.get("lastname");
            
            System.out.println("First name: " + fname);
            System.out.println("Last name: " + lname);
            System.out.println(); // Blank line for readability
            
            // Read Address array
            JSONArray array = (JSONArray) empjson.get("Address");
            
            for (int i = 0; i < array.size(); i++) {
                JSONObject address = (JSONObject) array.get(i);
                
                String street = (String) address.get("street");
                String city = (String) address.get("city");
                long postal = (long) address.get("postal");
                
                System.out.println("Address " + i + " is:");
                System.out.println("  Street: " + street);
                System.out.println("  City: " + city);
                System.out.println("  Postal: " + postal);
                System.out.println(); // Blank line between addresses
            }
            
        } catch (IOException | ParseException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}