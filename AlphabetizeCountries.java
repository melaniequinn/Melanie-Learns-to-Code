import java.util.*;

class AlphabetizeCountries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first country: ");
		String country1 = input.nextLine();
		System.out.print("Enter the second country: ");
		String country2 = input.nextLine();
		System.out.print("Enter the third country: ");
		String country3 = input.nextLine();
		
		System.out.print("The three countries in descending (reverse alphabetical) order are: ");
	
		boolean c1First = 
		(country1.compareToIgnoreCase(country3) > 0) && (country1.compareToIgnoreCase(country2) > 0);
		boolean c2First = 
		(country2.compareToIgnoreCase(country1) > 0) && (country2.compareToIgnoreCase(country3) > 0);	
		boolean c3First = 
		(country3.compareToIgnoreCase(country1) > 0) && (country3.compareToIgnoreCase(country2) > 0);	
		
		if (c1First == true)
		System.out.print(" " + country1);
		else if (c2First == true)
		System.out.print(" " + country2);
		else if (c3First == true)
		System.out.print(" " + country3);
	
		boolean c1Second = 
		((country1.compareToIgnoreCase(country3) > 0) && (country1.compareToIgnoreCase(country2) < 0)) || ((country1.compareToIgnoreCase(country3) < 0) && (country1.compareToIgnoreCase(country2) > 0));
		boolean c2Second = 
		((country2.compareToIgnoreCase(country3) > 0) && (country2.compareToIgnoreCase(country1) < 0)) || ((country2.compareToIgnoreCase(country3) < 0) && (country2.compareToIgnoreCase(country1) > 0));	
		boolean c3Second = 
		((country3.compareToIgnoreCase(country1) > 0) && (country3.compareToIgnoreCase(country2) < 0)) || ((country3.compareToIgnoreCase(country1) < 0) && (country3.compareToIgnoreCase(country2) > 0));	
		
		if (c1Second == true)
		System.out.print(" " + country1);
		else if (c2Second == true)
		System.out.print(" " + country2);
		else if (c3Second == true)
		System.out.print(" " + country3);
		
		boolean c1Third = 
		(country1.compareToIgnoreCase(country3) < 0) && (country1.compareToIgnoreCase(country2) < 0);
		boolean c2Third = 
		(country2.compareToIgnoreCase(country1) < 0) && (country2.compareToIgnoreCase(country3) < 0);	
		boolean c3Third = 
		(country3.compareToIgnoreCase(country1) < 0) && (country3.compareToIgnoreCase(country2) < 0);			
	
		if (c1Third == true)
		System.out.print(" " + country1);
		else if (c2Third == true)
		System.out.print(" " + country2);
		else if (c3Third == true)
		System.out.print(" " + country3);		
		
		
		else 
		System.out.println("The countries could not be arranged.");
	}

}