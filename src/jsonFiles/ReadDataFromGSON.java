package jsonFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class ReadDataFromGSON {

	public static void main(String[] args) throws FileNotFoundException {
	
		FileReader reader = new FileReader(".\\jsonfiles\\emp.json");
		
		Gson gson = new Gson();
		Person person = gson.fromJson(reader, Person.class);
		
		//access data
		
		System.out.println("Firstname :"+person.getFirstname());
		System.out.println("Lastname :"+person.getLastname());
							
	 //vartype		//variable//will return multiple add
		for(Address address:person.getAddress())
		{
			System.out.println("Street : "+address.getStreet());
			System.out.println("City : "+address.getCity());
			System.out.println("State : "+address.getState());

		}

	}

}
