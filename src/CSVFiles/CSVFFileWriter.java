package CSVFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFFileWriter {

	public static void main(String[] args) throws IOException {

		String CSVFileName = System.getProperty("user.dir")+"\\data\\CSVfilehandling.csv";
	
		
		FileWriter writer = new FileWriter(CSVFileName);
		
		writer.append("Name,Age,Email \n");
		writer.append("Sujay,23,sujay@gmail.com \n");
		writer.append("Amon,23,amon@gmail.com \n");
		writer.append("prakash,27,prakash@gmail.com \n");
		
		writer.close();
		
		System.out.println("CSV file Created"+CSVFileName);
		
	
	}

}
