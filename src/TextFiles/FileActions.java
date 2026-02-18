package TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {
	
	//creating a file
	public static void createFile(String filepath)
	{
		
		File myobj = new File(filepath);
		try {
		if(myobj.createNewFile())
		{
			System.out.println("File created:" + myobj.getName());
			
		}
		else
		{
			System.out.println("File exists");
		}
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

	
	//Writing a file
	public static void myWrite(String filepath)
	{
		try {
			FileWriter wright = new FileWriter(filepath);
			wright.write("welcome to file handling...");
			wright.close();
			System.out.println("Written sucesfully....");
			} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Read a file
	public static void readfile(String filepath)
	{
		try {
		File myobj = new File(filepath);
			Scanner myReader = new Scanner(myobj);
			while(myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Rename a file
	public static void renamefile(String oldfilepath, String newfilepath)
	{
		File oldfile = new File(oldfilepath);
		File newfile = new File(newfilepath);
		if(oldfile.renameTo(newfile))
		{
			System.out.println("File is renamed");
		}
		else
		{
			System.out.println("Duplicate file unable to rename");
		}
		System.out.println(newfile);
	}
		
	//Delete a file
	public static void deletefile(String filepath)
	{
		File myobj = new File(filepath);
		if(myobj.delete())
		{
			System.out.println("Deleted file ."+myobj.getName());
		}else
		{
			System.out.println("failed to delete file");
		}
	}
	
	public static void main(String[] args) {
	   
	    String filepath = "F:\\myfilesRename"
	    		+ ".txt";  // ✅ Add .txt
	    
	    createFile(filepath);
	    myWrite(filepath);  // Also fix spelling here
	    readfile(filepath);
	    
	    String filepathNew = "F:\\myfilesRenamed12.txt";
	    renamefile(filepath, filepathNew);
	    deletefile(filepathNew);
	    
	    
	    
	    
	    
	    
	}

}
