package demo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {

	public static void main(String[] args) throws IOException {

		if (args.length != 4) {
			System.err.println("Usage:java replacetext sourceFile cse200 oldStr newStr");
		}

		File cse = new File(args[0]);
		if (cse.exists()) {
			System.err.println("Source" + args[0] + "doesnt exists");
			System.exit(2);
		}

		File cse200 = new File(args[1]);
		if (cse200.exists()) {
			System.err.println("Target file" + args[1] + "doesnt exists");
			System.exit(3);
		}

		Scanner input = new Scanner(cse);
		PrintWriter ouptut = new PrintWriter(cse);

		while (input.hasNextLine()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[2], args[3]);
			ouptut.println(s2);
		}

	}

}
