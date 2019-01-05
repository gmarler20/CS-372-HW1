import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double pounds;
		double inches;
		double kilograms;
		double meters;
		double BMI;
		
		System.out.println("Enter your weight in pounds");
		pounds = scnr.nextDouble();
		kilograms = pounds * .453592;
		
		System.out.println("Enter your height in inches");
		inches = scnr.nextDouble();
		meters = inches * .0254;
		
		BMI = kilograms / (Math.pow(meters, 2));
		
		System.out.println("Your BMI is " + BMI);
		
		
	}

}
