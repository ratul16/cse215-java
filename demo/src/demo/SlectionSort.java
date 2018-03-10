package demo;

public class SlectionSort {

	public static void main(String[] args) {
		int min, minindex;
		int num[] = { 3, 2, 1, 4, 5 };

		// getting num and index of array
		for (int i = 0; i < num.length - 1; i++) {
			min = num[i];
			minindex = i;

			// getting 1st num and index
			for (int j = i + 1; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
					minindex = j;

					if (minindex != 1) {
						num[minindex] = num[i];
						num[i] = min;
					}
				}
			}
		}
		for (int k = 0; k < num.length; k++) {
			System.out.println("The sorted array is :" + num[k]);
		}
	}
}
