package demo;

import java.util.*;

public class AnalyzingNumWithArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many number do you want to enter :");
		int x = input.nextInt();
		int[] num = new int[x];

		int sum = 0;
		System.out.println("Enter your number : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
			sum += num[i];
		}
		System.out.println("sum is :" + sum);

		double avg = sum / x;
		int count = 0;
		for (int i = 0; i < x; i++) {
			if (num[i] > avg)
				count++;
		}
		System.out.println("the avg is :" + avg);
		System.out.println("greater thn avg num is :" + count);

	}

}
