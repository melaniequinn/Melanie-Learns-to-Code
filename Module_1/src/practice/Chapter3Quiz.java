package practice;

import java.util.*;

public class Chapter3Quiz {
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	//Test Line
	System.out.println("Hello");
		
	//Question 1
	//System.out.println((int)Math.random() * 4);
	// is zero because the default random number is between 0.0 and 0.999...
	// Int will change it to a whole number by dropping the decimals.	
	
	//Question 5
	double h = 35;
	if ((h < 100) && (h > 10))
		System.out.println("h is between 10 and 100");
	
	System.out.println((int)Math.random() * 4);
	System.out.println((int)(Math.random() * 4));
	
	double income = 4001;
	if (income > 3000) {

		 System.out.println("Income is greater than 3000");

		}

		else if (income > 4000) {

		 System.out.println("Income is greater than 4000");

		}

	double x = 1;
	double y = -1;
	double z = 1;
	
	if (x > 0) 
	if (y > 0)
		System.out.println("x > 0 and y > 0");
	else if (z > 0)
		System.out.println("x < 0 and z > 0");
	
	boolean even = false;

	if (even) {

	 System.out.println("It is even!");

	}
	
	}

}
