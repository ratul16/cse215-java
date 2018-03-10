import java.util.Scanner;

public class Prac1 {

	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x.length; col++) {
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of row and column");

		int i = input.nextInt();
		int[][] mat = new int[i][i];

		System.out.println("enter row and col :");
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				mat[row][col] = input.nextInt();
			}
		}
		System.out.println("The matrix is :");
		display(mat);

	}
}
