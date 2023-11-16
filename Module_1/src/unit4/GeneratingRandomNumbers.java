package unit4;
import java.util.*;

public class GeneratingRandomNumbers {

		public static void main(String[] args) {
			double rnum1 = Math.random();
			int rnum2 = (int) (rnum1 * 10);
			
			System.out.println(rnum1 + " is the random number");
			System.out.println("multiplied by 10 as an interger yeilds a single digit whole number, which is " + rnum2);
			
			int rnum3 = (int) (rnum1 * 100);
			System.out.println("to get a random 2 digit number, multiply by 100. The result is " + rnum3 + ".");
			
			int rnum5 = (int) (rnum1 * 90) + 10; //Add number you want it to start at a the end
			System.out.println("Adding 10 to the end makes it start at 10. Here is another random number: (" + rnum5 + "). It will never be less than 10.");
			
			System.out.println("Here is another number.");
			int rnum6 = (int) (Math.random() * 50) + 50;
			System.out.println(rnum6);
			System.out.println("This number is ");
		}
}
