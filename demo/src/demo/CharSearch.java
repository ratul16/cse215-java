package demo;

import java.util.Scanner;

public class CharSearch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int flag =0;
		char word []={'r','a','t','u','l'};
		System.out.println("Enter your letter: ");
		char user=input.next().charAt(0);
		
		for(int i =0;i<word.length;i++){
			if(user==word[i]){
				 flag=1;break;//System.out.println("found it");break;
			}
	
		}
		//System.err.println("Not found");
		if(flag==1){
			System.out.println("found");
		}
		else{
			System.err.println("not found");
		}

	

}
}
