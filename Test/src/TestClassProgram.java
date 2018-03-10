import java.io.IOException;

public class TestClassProgram {

	public static void main(String[] args)  {
		
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
