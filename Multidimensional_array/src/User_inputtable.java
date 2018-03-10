import java.util.Scanner;

public class User_inputtable {
	public static void display(int a[][]) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of row and column: ");

		int i = input.nextInt();
		int[][] mat = new int[i][i];

		System.out.println("enter row and col :");
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[row].length; col++) {
				mat[row][col] = input.nextInt();
			}
		}
		System.out.println("The matrix is : ");
		display(mat);

	}
}
