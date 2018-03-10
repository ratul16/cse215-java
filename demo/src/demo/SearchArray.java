package demo;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num[] = { 1, 23, 53, 43, 6, 5, 12, 98, 556, 34 };
		int flag=0;
		
		System.out.println("Enter your Number:");
		int user = input.nextInt();

		for (int i = 0; i < num.length; i++) {
			if (user == num[i]) {
				//System.out.println("Found it");break;
				flag = 1;break;
			}

		}
		if (flag==1){
			System.out.println("Found");
		}
		else {
			System.err.println("Not found");
		}
		

	}

}
