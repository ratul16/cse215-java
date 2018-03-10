import java.util.Scanner;


public class Task5 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user,com;
		
		com = (int) (Math.random()*10) % 3;
		//System.out.println(com);
		
		System.out.println("Enter (0)scissor-----(1)rock----- 2)paper");
		user = input.nextInt();
		
		if(com==user && user==1 || user==0 || user==2){
			System.out.println("Draw");
		}
		else if (com!=user && user==0 && com==1){
			System.out.println("u lose");
		}
		else if (com!=user && user==0 && com==2){
			System.out.println("u win");
		}
		else if (com!=user && user==1 && com==0){
			System.out.println("u win");
		}
		else if (com!=user && user==1 && com==2){
			System.out.println("u lose");
		}
		else if (com!=user && user==2 && com==0){
			System.out.println("u lose");
		}
		else if (com!=user && user==2 && com==1){
			System.out.println("u win");
		}

	}

}
