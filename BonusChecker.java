import java.util.*;
class BonusChecker {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
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
}
}
