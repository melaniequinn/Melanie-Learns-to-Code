package unit2;
import java.util.*;

public class ComputeBMI {
	
	public static void main(String[] args) {
		
		double lbs;
		double inches;
		double kgs;
		double meters;

		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your weight in pounds (lbs): ");
		lbs = input.nextDouble();
		kgs = 0.45359237 * lbs; 
		System.out.println("Your weight in Kgs is " + kgs + "Kgs" );
		System.out.print("Enter your height in inches: ");
		inches = input.nextDouble();
		meters = inches * 0.0254;
		System.out.println("Your height in meters is " + meters + " meters");
		System.out.println("Your BMI is " + kgs / (meters * meters));
		
		double bmi = kgs / (meters * meters);
		
		System.out.println("BMI is " + bmi);
		
		if (bmi < 18.5) 
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else 
			System.out.println("Obese");
			
	
	}

}
