package practice;
import java.util.*;

//Strings are wrapped in " "
//Char are wrapped in ' '

public class StringType {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//welcome
		System.out.println("Welcome to Java: Strings \nToday, you pick the string! Enter a line of text.");
		String message = input.nextLine(); 
		System.out.println("\nOur string is '" + message + "'.");
		//define message length
		int slength = message.length();
		System.out.println("The length of the string is " + slength + ".");
		int a = (slength-1);
		System.out.println("The final index position in this string is " + a + ", because we start index counting at 0.");
		//char x = message.charAt(a);

		//System.out.println("'charAt(#)' (indexing) begins at 0. The last character, '" + x + "', is at position " + a + ". \n");
		
		//question1 System picks the next charAt 
		int indexNumber = (int) (Math.random() * a);
		System.out.println("\nIn our example, '" + message + "', the character at index 0 is '" + message.charAt(0) + "'.");

		System.out.println("What is the character at index position " + indexNumber + "?");
		String guessTwo = input.nextLine();
		//to make it easier for the user, we will ask the program to trim the users input.

		char chTwo = guessTwo.charAt(0);
		char randomIndex = message.charAt(indexNumber);
		if ( randomIndex == chTwo )
			System.out.println(guessTwo + " is correct.");
		else
			System.out.println(guessTwo + " is incorrect. \nThe answer is '" + randomIndex + "'.\nRemember, whitespace charaters (spaces) count, and strings are case sensitive.");
		System.out.println("\nReady to continue? Press enter.");
		input.nextLine();
		
		System.out.println("We can also modify a message. Would you like it to be uppercase(a), or lowercase(b)?\n");
		String firstMod = input.nextLine();
		char fm = firstMod.charAt(0);
		if (fm == 'a')
			System.out.println(message.toUpperCase());
		else if (fm == 'b')
			System.out.println(message.toLowerCase());
		else {
			System.out.println("Please enter 'uppercase' or 'lowercase'.");
			System.exit(0); }
		
		System.out.println("\nNew! More String Practice! Ready?");
		input.nextLine();
		char ch = message.charAt(0);
		System.out.println("Now we will convert your string to a hex digit... we will only use the first character (" + ch + ").");
		input.nextLine();
		
		if ('A' <= ch && ch <= 'F') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for the hex digit " + ch + " is " + value);
			}
		else if ('a' <= ch && ch <= 'f') {
			int value = ch - 'a' + 61;
			System.out.println("The decimal value for the hex digit " + ch + " is " + value);
		}
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for the hex digit " + ch + " is " + ch);
		}
		else {
			System.out.println(ch + " is an invalid input.");
		}
		System.out.println("Press enter to continue.");
		input.nextLine();
		System.out.println("\nThere is more we can do with strings, such as comparisons, which will be covered in another game. \n\nThat's all for now! Thanks for playing!");
	
		
		
	}

	}