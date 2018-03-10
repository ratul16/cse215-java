import java.util.Scanner;


public class task9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double BMI , weight1,weightf , height1 , heightf ;
		System.out.println("Enter the value of weight in pound : ");
		weight1 = input.nextDouble();
		
		System.out.println("Enter the value of height in inches : ");
		height1 = input.nextDouble();
		
		weightf = weight1 * 0.45359237;
		heightf = height1 * 0.0254;
		
		BMI = weightf / (heightf*heightf);
		
		System.out.println("The value of BMI is : " + BMI);

	}

}
