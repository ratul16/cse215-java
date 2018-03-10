import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class wirteFile extends Ping {
	
	public void wrintingFile() throws IOException {
		 try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\RaTuL\\Desktop\\Project\\ping.txt "));
			bw.write(pingSite());
			bw.close();
		} catch (IOException e) {
			System.err.println("error");
		}
		
		File file = new File("cse.txt");
		
		PrintStream write =new PrintStream(new File("C:\\Users\\RaTuL\\Desktop\\Project\\ping.txt "));
		System.setOut(write);
		
		
	}
	
}

