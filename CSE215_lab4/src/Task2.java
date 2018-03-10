import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters for mejor and year");
		String major =input.next();
		char one = major.charAt(0);
		char two= major.charAt(1);
		//int year=input.nextInt();
		char b =(char) (one-(char)32);
		//System.out.println(b);
	
		if(b == 'M'&& two =='1'){
			System.out.println("Mathematics Freshman");
		}
		else if (b == 'M'&& two == '2'){
			System.out.println("Mathematics Sophomore");
		}
		else if (b == 'M'&& two == '3'){
			System.out.println("Mathematics Junior");
		}
		else if (b == 'M'&& two == '4'){
			System.out.println("Mathematics Senior");
		}
		else if(b == 'C'&& two =='1'){
			System.out.println("Computer Science Freshman");
		}
		else if (b == 'C'&& two == '2'){
			System.out.println("Computer Science Sophomore");
		}
		else if (b == 'C'&& two == '3'){
			System.out.println("Computer Science Junior");
		}
		else if (b == 'C'&& two == '4'){
			System.out.println("Computer Science Senior");
		}
		else if(b == 'T'&& two =='1'){
			System.out.println("Information Tecnologhy Freshman");
		}
		else if (b == 'T'&& two == '2'){
			System.out.println("Information Tecnologhy Sophomore");
		}
		else if (b == 'T'&& two == '3'){
			System.out.println("Information Tecnologhy Junior");
		}
		else if (b == 'T'&& two == '4'){
			System.out.println("Information Tecnologhy Senior");
		}
		else {
			System.err.println("Invaild input");
		}
		
		
		
		
		
		
		
		
	}

}
