import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readData extends Ping {

	public void readingdata() {
		
		//Scanner scanner =new Scanner(System.in);
		String line;
		BufferedReader br = null;
		
		System.err.println("enter file name");
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\RaTuL\\Desktop\\Project\\abc.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("The file wasnt found");
			System.exit(0);
		}
		
		
		try {
			while(( line = br.readLine()) !=null){
			
			System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error");
		}finally {
			System.exit(0);
		}
		
	}
	
}
