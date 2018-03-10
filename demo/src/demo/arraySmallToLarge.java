package demo;

public class arraySmallToLarge {

	public static void main(String[] args) {
		System.out.println("Sum of array:");
		int array[] = { 1, 2, 3, 4, 19, 6, 7, 8, 9,10};
		int max = array[0];
		for (int count = 1; count < array.length; count++) {
			if(array[count]<max){
				max=array[count];
			}

		}
		System.out.println("ans:" + max);
	}

}
