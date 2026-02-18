package CSVFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileReader {

	public static void main(String[] args) throws IOException {
		
		//Approach1: using Scanner Class
	/*	
		File file = new File (System.getProperty("user.dir")+"\\data\\CSVfilehandling.csv");
		
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter(" , ");
		
		while(sc.hasNext())
		{
			System.out.println(sc.next()+"\t");
		}
		
		sc.close();
	}*/
		
		// Approach 2: BufferedReader (fixed)
        String csvFileName = System.getProperty("user.dir") + "\\data\\CSVfilehandling.csv";  // Fixed path
        BufferedReader bfrreader = new BufferedReader(new FileReader(csvFileName));
        
        String line;
        while((line = bfrreader.readLine()) != null) {  // Removed semicolon
            String[] data = line.split(",");  // Fixed delimiter and variable name
            for(String value : data) {
                System.out.print(value + "\t");  // Fixed print
            }
            System.out.println();  // New line after row
        }
        bfrreader.close();
	
	}
}
