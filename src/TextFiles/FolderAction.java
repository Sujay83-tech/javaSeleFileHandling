package TextFiles;

import java.io.File;

public class FolderAction {

	//create folder
	public static void createfolder(String Folderpath)
	{
		File folder = new File(Folderpath);
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("Folder Created:" +Folderpath);
		}
		
	}
	
	//check folder
	public static boolean checkfolder(String Folderpath)
	{
		File folder = new File(Folderpath);
		return folder.exists();
		
		
	}
	
	//Rename folder 
	public static void renameFolder(String oldPath, String newPath)
	{
		//create object
		File oldfolder = new File(oldPath);
		File newfolder = new File(newPath);
		
		/*
		 * Here we are checking in the old folder exists or not then renaming the old
		 * folder to new and placing it to new path or same basically renaming the folder
		 * `
		 */		
		if(oldfolder.exists())
		{
			oldfolder.renameTo(newfolder);
			System.out.println("Renamed folder "+ newPath);
		
		}
	}
	
	//Delete Folder
	public static void deleteFolder(String Folderpath)
	{
		File folder = new File(Folderpath);
		if(folder.exists())
		{
			// to get each write for each create variable file
		
			for(File file:folder.listFiles())
			{
				file.delete();
			}
			folder.delete();
			System.out.println("folder deleted "+ Folderpath);
		}
	}
	
	
	public static void main(String[] args) {
		
		//Existing folder
		String Folderpath="F:\\myfilesAuto";
		createfolder(Folderpath);
		boolean folderexist=checkfolder(Folderpath);
		System.out.println("Folder exist"+ folderexist);
		
		
		//new Folder
		String newFolderpath="F:\\myfilesRenamed";
		renameFolder(Folderpath,newFolderpath);
		  deleteFolder(newFolderpath);
		 
	}

}
