package unit4;

import java.util.Scanner;

public class StudentMajorAndStatus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter for your Major, and a number for your status: \nI: Information Management \nC: Computer Science \nA: Accounting \n\n1. Freshman \n2. Sophomore \n3. Junior \n4. Senior\n");
		//define input
		String s1 = input.nextLine();
		//break up input
		String major = s1.substring(0, 1);
		String year = s1.substring(1);
		//assign majors to strings because they are not numerical
		String i = "I";
		String c = "C";
		String a = "A";
		//Print major
		if (major.equalsIgnoreCase(i))
		System.out.print("Information Management");
		if (major.equalsIgnoreCase(c))
		System.out.print("Computer Science");
		if (major.equalsIgnoreCase(a))
		System.out.print("Accounting");
		//Print year
		if (year.equals("1"))
			System.out.print(" Freshman");
		if (year.equals("2"))
			System.out.print(" Sophomore");
		if (year.equals("3"))
			System.out.print(" Junior");
		if (year.equals("4"))
			System.out.print(" Senior");


	}

}