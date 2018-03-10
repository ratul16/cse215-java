import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter your text:");
		String text=input.nextLine();
		
		System.out.println("Your text length is:"+text.length());
		
		for(int i =0 ; i<text.length();i++){
			if(i % 2 == 0){
				System.out.println(text.charAt(i));
			}
		}
		

	}

}
