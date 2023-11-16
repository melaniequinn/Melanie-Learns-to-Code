package unit4;
import java.util.*;
public class MathQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("What is " + number1 + " + " + number2 + "? ");
	
		int answer = input.nextInt();
	
		boolean isAnswerCorrect = (number1 + number2 == answer);
	
		if (isAnswerCorrect) {
			System.out.println("Your answer is correct!");
		}	else {
			System.out.println("Your answer is incorrect.");
		}
		int number3 = (int) (Math.random() * 10);
		int number4 = (int) (Math.random() * 10);

		System.out.println("What is " + number3 + " - " + number4 + "? "); 
	
		int answer2 = input.nextInt();
		boolean b2 = (number3 - number4 == answer2);
		
		if (number3 < number4) { //this makes the bigger value lead the subtraction
			int temp = number3;  //if 2nd # bigger, it makes switches them around borrowing int to hold and shuffle 
			number3 = number4;	 
			number4 = temp;  //now, the student wont be asked q w neg result eg 4-8
		}
		
		if (b2) {
			System.out.println("Your answer is correct!");
		}	else {
			System.out.println("Your answer is incorrect.");
			System.out.println(number3 + " - " + number4 + " = " + (number3 - number4));
		}
	
		System.out.println("Thanks for playing!");
		
		
		
		
	}

}
