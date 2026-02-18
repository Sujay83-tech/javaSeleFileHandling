package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFiles {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		
		String filepath=System.getProperty("user.dir")
				+"\\data\\example.properties";
		
		 FileInputStream file = new FileInputStream(filepath);
		 
		 properties.load(file);
		 file.close();
		 
		 //Read data from properties files
		 
		String age= properties.getProperty("age");
		String email= properties.getProperty("email");
		String name= properties.getProperty("name");
		System.out.println(age);
		
		//Capture all the properties
		Set<String> keys = properties.stringPropertyNames();  //method1
		System.out.println(keys);
		
		//capture all the properties 
		Set<Object> allkeys=properties.keySet();
		System.out.println(allkeys);
		
		//capture all the values
		Collection<Object> values=properties.values();
		System.out.println(values);
		
		//read all the properties and values
		for(String key:properties.stringPropertyNames())
		{
			System.out.println(key+"   "+properties.getProperty(key));
		}
		
		
	}

}
