import java.util.*;

public class EnergyCalculatorForHeatingWater {

	public static void main(String[] args) {

		
		double mass;
		double initalTemp;
		double finalTemp;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("To calculate the energry in joules needed to heat water, enter the amount of water in kilograms: ");
		mass = input.nextDouble();
		System.out.print("Next, enter the starting temperature in degrees Celcius: ");
		initalTemp = input.nextDouble();
		System.out.print("What is your goal temperature? ");
		finalTemp = input.nextDouble ();
		
		System.out.println("The water wieghs " + mass + "KGs");
		System.out.println("The initial temperature is " + initalTemp + "*C");
		System.out.println("The final (or goal) temperature is " + finalTemp + "*C");
		
		double qEnergy = mass * (finalTemp - initalTemp) * 4184;
		System.out.println("This will require " + qEnergy + " joules of energy.");
	}

}