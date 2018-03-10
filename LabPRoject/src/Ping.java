import java.io.*;

public class Ping {

		public String pingSite() throws IOException {
			String test = "ping "+"www.google.com";
			
			Process sysProcess = Runtime.getRuntime().exec(test);
			
			BufferedReader pingreader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
			
			String line;
			
			while(( line = pingreader.readLine()) !=null){
			
			System.out.println(line);
			}
			return line;
		}
	
	
	/* public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String test = "ping "+"www.google.com";
		
		Process sysProcess = Runtime.getRuntime().exec(test);
		
		BufferedReader pingreader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
		
		String line;
		
		while(( line = pingreader.readLine()) !=null){
		
		System.out.println(line);
		}
		
	}*/

}