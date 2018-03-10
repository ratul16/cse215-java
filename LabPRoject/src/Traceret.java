import java.io.*;

public class Traceret {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String test = "tracert -d " ;
		Process sysProcess = Runtime.getRuntime().exec(test);
		
		BufferedReader stmreader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
		
		String line;
		
		while((line = stmreader.readLine()) !=null){
		
		System.out.println(line.toString());
		}
		
	}

}