package cen4025;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;


// uses recursion to print tree data structure
// of a root folder and all sub-folders and files.
// insert root folder to begin.
public class FolderTreeData {

	public static int totalFile = 0;
	public static int totalFolder = 0;
	public static int totalSize = 0;
	
	public static void main(String[] args) throws Exception {

		// takes in root folder and calls listDir()
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the root path: ");
		String filePath = scan.nextLine();
		//String filePath = "D:\\Valencia\\CEN 4025C-25739 Soft II\\TreeFolder";
		Path currPath = Paths.get(filePath);

		listDir(currPath, 0);

		System.out.println("\nTotal number of files: " + totalFile);
		System.out.println("Total number of folders: " + totalFolder);
		System.out.println("Total size in bytes: " + totalSize);
	}

// reads path of root directory
//	cycles through entire root directory using recursion
//	calculates total number of files and folders
//	prints each file with size in bytes and adds to total size of root folder
	
	public static void listDir(Path path, int depth) throws Exception {
		
		BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
		
		// prints: folders, total folders
		if(attr.isDirectory()) {
			DirectoryStream<Path> paths = Files.newDirectoryStream(path);
			totalFolder++;
			System.out.println(spacesForDepth(depth) + " > " + path.getFileName() + ": ");
			
			// recursively cycles through entire path
			for(Path p : paths) {	
				listDir(p, depth + 1);
				
			} 			
		//	prints: files, size, total files, total size
		} else {
			System.out.println(spacesForDepth(depth) + " --- " + path.getFileName() + " - " 
					+ attr.size() + " bytes");	
			totalFile++;
			totalSize += attr.size();
		}
	}	
	
//	appends correct indentation to print statements
	public static String spacesForDepth(int depth) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < depth; i++) {
			builder.append("    ");
		}
		return builder.toString();
	}
}
