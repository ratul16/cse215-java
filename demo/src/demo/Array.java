package demo;

public class Array {

	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++)
			if (min>arr[i]) {
				min = arr[i];
			System.out.println(min);
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[5];

		a[0] = 20;
		a[1] = 70;
		a[2] = 40;
		a[3] = 50;
		a[4] = 10;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
