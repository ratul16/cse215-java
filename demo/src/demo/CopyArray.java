package demo;

import java.util.*;

public class CopyArray {

	public static void main(String[] args) {
		//int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		Scanner input = new Scanner(System.in);
		System.out.println("How many number do you wanna enter:");
		int len=input.nextInt();
		
		int [] array=new int[len];
		
		
		
		for(int count=0;count<len;count++){
			System.out.println("Enter number"+(count+1));
			array [count]=input.nextInt();
						}
		int [] array1=new int [array.length];
		
		for(int i =0 ;i<array1.length;i++){
			array1[i]=array[i];
		System.out.println("array is :"+ array1[i]);
		}
	}

}
