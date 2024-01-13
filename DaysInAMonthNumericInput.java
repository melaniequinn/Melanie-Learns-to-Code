import java.util.*;
class DaysInAMonthNumericInput {
	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a year: ");
		 int year = input.nextInt();
		 System.out.println("Enter a month in numbers: ");
		 int month = input.nextInt();
		 	
		if ( month == 1 )
			System.out.println("31 days in January of " + year );
		else if ( month == 2 ) {
			
			boolean isLeapYear =
					(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
				if ( isLeapYear == true )  
				System.out.println( year + " is a leap year, so there are 29 days in February of " + year + ".");
				else if ( isLeapYear == false ) 
				System.out.println("28 days in February of " + year );
			}
		else if ( month == 3 )	
			System.out.println("31 days in March of " + year );
		else if ( month == 4 )
			System.out.println("30 days in April of " + year );
		else if ( month == 5 )
			System.out.println("31 days in May of " + year );
		else if ( month == 6 ) 
			System.out.println("30 days in June of " + year );
		else if ( month == 7 ) 
			System.out.println("31 days in July of " + year);
		else if ( month == 8 ) 
			System.out.println("31 days in August of " + year );
		else if  (month == 9 ) 
			System.out.println("30 days in September of " + year );
		else if ( month == 10 )
			System.out.println("31 days in October of " + year );
		else if ( month == 11 )
			System.out.println("30 days in Noveber of " + year );
		else if ( month == 12 ) 
			System.out.println("31 days in December of " + year);
		else
			System.out.println("Invalid input. Please enter a number for month between 1 and 12.");
	}
		 

		
		
	}