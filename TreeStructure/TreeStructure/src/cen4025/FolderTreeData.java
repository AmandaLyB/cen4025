package cen4025;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;


public class FolderTreeData {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the root path: ");
		String filePath = scan.nextLine();
		Path currPath = Paths.get(filePath);

		listDir(currPath, 0);
	}
	
	public static void listDir(Path path, int depth) throws Exception {
		
		BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
		int count = 0;
		
		if(attr.isDirectory()) {
			DirectoryStream<Path> paths = Files.newDirectoryStream(path);
			
			System.out.println(spacesForDepth(depth) + " > " + path.getFileName() + ": ");
			
			for(Path p : paths) {	
				listDir(p, depth + 1);
				count++;
			} 
			
		} else {
			System.out.println(spacesForDepth(depth) + " --- " + path.getFileName() + " - " 
					+ attr.size() + " bytes");			
		}
	}	
	
	
	public static String spacesForDepth(int depth) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < depth; i++) {
			builder.append("    ");
		}
		return builder.toString();
	}
}
