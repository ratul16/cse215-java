

public class Table_with_array {
	
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int col=0;col<x[row].length;col++){
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int [][] matrix1 ={{11,12,13},{14,15,16},{17,18,19}};
		
		System.out.println("The 1st matrix is :");
		display(matrix);
		
		System.out.println("The 2st matrix is :");
		display(matrix1);
	}

}
