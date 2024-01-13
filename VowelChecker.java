import java.util.*;

public class VowelChecker {
//instructions: Scanner input - ask for vowel - define vowel, multi-way if, output with users success. 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = input.nextLine();
		
		char ch = Character.toUpperCase(letter.charAt(0));
		
		if (ch == 'A') 
			System.out.println(letter + " is a vowel.");
		else if (ch == 'E')
			System.out.println(letter + " is a vowel.");
		else if (ch == 'I')
			System.out.println(letter + " is a vowel.");
		else if (ch == 'O')
			System.out.println(letter + " is a vowel.");
		else if (ch == 'U')
			System.out.println(letter + " is a vowel.");
		else if (ch == 'Y')
			System.out.println(letter + " is sometimes a vowel.");
		else if (Character.isDigit(ch))
			System.out.println("Invalid entry. Please enter a letter.");
		else
			System.out.println(letter + " is not a vowel.");
	}

}