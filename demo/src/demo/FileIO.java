package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args)throws IOException {
		File file = new File("cse.txt");

	
			PrintWriter output = new PrintWriter(file);
			output.print("my name is rule");
			output.println("\nSabit ghumay kalk sure pass ");

			output.close();


		/*
		 * 
		 */

	}

}
