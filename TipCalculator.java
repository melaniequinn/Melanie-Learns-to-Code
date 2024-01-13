import java.util.*;

public class TipCalculator {
	// A program that reads the subtotal and the gratuity rate, and calculates the tip and final total

	public static void main(String[] args) {
		
		double subtotal;
		double tipPercent;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter subtotal (the total before gratuity): ");
		subtotal = input.nextDouble();
		
		System.out.println("Enter what percent of tip you would like to calculate: ");
		tipPercent = input.nextDouble();
		
		double dollarTip = tipPercent / 100 * subtotal;
		double total = subtotal + dollarTip;
		
		System.out.println( tipPercent + "% of " + subtotal + " is $" + dollarTip + "... your final total is $" + total + ".");
		

	}

}
