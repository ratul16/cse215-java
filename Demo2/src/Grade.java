
	import java.util.Scanner;

	public class Grade {
		
		private String StudentID ;
		private double percentage = 0;
		int NumofInput = 0 ;
		
		public int getNumofInput() {
			return NumofInput;
		}

		public void setNumofInput(int numofInput) {
			NumofInput = numofInput;
		}


		public static void main() {
			double [] list =new double [5];
			Scanner input =new Scanner(System.in);
			System.out.println("input");
			for (int i = 0; i < list.length; i++) {
				list[i] = i;
				}
			
		}
		
	}


