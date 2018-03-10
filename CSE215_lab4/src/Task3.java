import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your SSN number: ");
		String snum=input.nextLine();
		char a=snum.charAt(3);
		char b=snum.charAt(6);
		char c=snum.charAt(0);
		
		if(a =='-' && b=='-'){
		//	System.out.println(snum+" is a vaild SSN");
			for(int i =0 ;i<=10;i++){
				//if(a =='-' && b=='-')
				if (i == 3 || i ==6) continue;
				if (snum.charAt(i)>='0'&&snum.charAt(i)<='9'){		
				}
			}
			System.out.println(snum+" is a vaild SSN");
		}
		else{
			System.err.println(snum + " is a invaild SSN");

		}
		
		
		
		
		
		

	}

}
