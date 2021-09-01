package readingATextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadATextFile {

	public static void main(String[] args) {

		
		doesFileExist("TF_Dictionary.txt");

	}
	public static void doesFileExist(String path) {
		try {
			// Opening the file
			File file = new File(path);
			// Reading the file
			Scanner scanLine = new Scanner(file);
			// to read a line of our text
			System.out.println("hey! this file exist");
			while(scanLine.hasNext()){ 
			String lines = scanLine.nextLine();
			String[] wordAndMeanings = lines.split("-");
			for (int i =0; i< wordAndMeanings.length;i++) {
				
				
				System.out.println(wordAndMeanings[i]);
			}
			
			} 
		} catch (FileNotFoundException e) {
			System.out.println("file not found please check the file path");
		}
		
	}

}
