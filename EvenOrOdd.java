
import java.util.*;

class EvenOrOdd {

	public static void main(String[] args) {
		// Part One - if Y is a positive value, X=1
		Scanner input = new Scanner(System.in);
		/*
		
		System.out.println("Please enter a value for y: ");
		double y;
		double x;

		y = input.nextDouble();
		if (y > 0) {
			x = 1;

		} else {
			x = 0;
		}
		System.out.println("x = " + x);
		System.out.println("If the value of x was 1, you entered a positive value.");
		*/
		/*// Boolean Data Type - Use Boolean to store
		int x = 1;
		System.out.println((x > 0)); // true
		System.out.println((x < 0)); // false
		System.out.println((x != 0)); // true
		System.out.println((x >= 0)); // true
		System.out.println((x != 1)); // false
		 */
		// Part Two, Adding 3% bonus if score is 90 or higher
		// Two Way If Statements Part 1 - Add 1% if score is not 90% or higher
		System.out.println("......");

		double score = 0;
		double pay;

		System.out.println("What is your base pay?");
		pay = input.nextDouble();
		System.out.println("What is your score?");
		score = input.nextDouble();
		if (score >= 90) {
			pay = pay * 1.03;
			System.out.println(
					"Congratulations on  score of 90 or higher! You have earned a 3% bonus, your new pay is $" + pay);
		} else {
			pay = pay * 1.01;
			System.out.println("You have qualified for a 1% bonus. Your pay is $" + pay + ".");
			System.out.println("With a score over 90, you would have earned another $" + (pay * 0.02) + ".");
		}

		// Even or Odd
		double number;
		double number2;
		double number3;
		double number4;

		System.out.println("Question 5.a)...");
		System.out.println("Enter a number.");
		number = input.nextDouble();
		System.out.println("The following is the output for the indicated problem: ");

		if (number % 2 == 0)
			System.out.println(number + " is even.");
		else
			System.out.println(number + " is odd.");

		System.out.println("Enter another number.");
		number = input.nextDouble();
		System.out.println("The following is the output for the indicated problem: ");

		if (number % 2 == 0)
			System.out.println(number + " is even.");
		else
			System.out.println(number + " is odd.");

		System.out.println("Question 5.b)...");
		System.out.println("Enter a number.");
		number3 = input.nextDouble();
		System.out.println("The following is the output for the indicated problem: ");
		if (number3 % 2 == 0)
			System.out.println(number3 + " is even.");
		else
			System.out.println(number3 + " is odd.");

		System.out.println("Enter another number.");
		number3 = input.nextDouble();
		System.out.println("The following is the output for the indicated problem: ");
		if (number3 % 2 == 0)
			System.out.println(number3 + " is even.");
		else
			System.out.println(number3 + " is odd.");

	}

}