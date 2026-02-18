package jsonFiles;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromSimpleJSON {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser json = new JSONParser();
        
        try (FileReader reader = new FileReader(".\\jsonfiles\\emp.json")) {
            
            Object obj = json.parse(reader); // convert json file --> Java Object
            JSONObject empjsonobj = (JSONObject) obj; // cast java Object to JSON object

            // Read simple string fields
            String fname = (String) empjsonobj.get("firstname");
            String lname = (String) empjsonobj.get("lastname");

            System.out.println("Firstname: " + fname);
            System.out.println("Lastname: " + lname);

            // Read Address array
            JSONArray addressArray = (JSONArray) empjsonobj.get("address");

            // Loop through each address in the array
            for (int i = 0; i < addressArray.size(); i++) {
                
                JSONObject address = (JSONObject) addressArray.get(i);
                String street = (String) address.get("Street");
                String city = (String) address.get("city");
                String state = (String) address.get("state");

                System.out.println(street + "\t" + city + "\t" + state);
            }
            
        } catch (IOException | ParseException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}