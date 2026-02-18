package jsonFiles;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadDataFromJSON {

	public static void main(String[] args) {
		
		ObjectMapper objectmapper = new ObjectMapper();
		
		File file = new File(".\\jsonfiles\\emp.json");
		
		//Read JSON data from the file
		
		Person person=objectmapper.readValue(file,Person.class);
		
	//Access Data
		System.out.println("Fristname :"+person.getFirstname());
		System.out.println("Lastname :"+person.getLastname());
		
		System.out.println("Address...");
		for(Address address:person.getAddress())
		{
			System.out.println("Street:"+address.getStreet());
			System.out.println("City:"+address.getCity());
			System.out.println("State:"+address.getState());

		}
	}

}
