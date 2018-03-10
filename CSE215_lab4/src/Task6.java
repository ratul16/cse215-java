import java.util.Scanner;

public class Task6 {

	public static int sumDigits(long n) {
		int sum = 0;
		while (n != 0) {
			int num = (int) (n % 10);
			n = n / 10;
			sum += num;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your numbers :");

		long numu = input.nextLong();
		int result = sumDigits(numu);

		System.out.println("The sum of the numbers are :" + result);

	}

}
