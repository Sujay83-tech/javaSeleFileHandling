package PropertyFiles;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFiles {
    
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        
        properties.setProperty("name", "Sujay");
        properties.setProperty("gmail", "abc@gmail.com");
        properties.setProperty("age", "23");
        
        String filepath = System.getProperty("user.dir") + "\\data\\example.properties";
        
		/*
		 * Problem: FileOutputStream File (capitalized like a class) Fix:
		 * FileOutputStream file (lowercase) Explanation: Java convention is to use
		 * camelCase for variable names. Class names are PascalCase, variable names
		 * start lowercase.
		 */
        FileOutputStream file = new FileOutputStream(filepath);
        
        properties.store(file, "sample data for properties file");
        
        file.close();
        System.out.println("properties have been created " + filepath);
    } 
}