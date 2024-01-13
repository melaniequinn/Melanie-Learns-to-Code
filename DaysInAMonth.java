import java.util.*;

class DaysInAMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		String yearIn = input.nextLine();
		
		System.out.println("Enter the first three letters of a month, starting with a capital letter: ");
		String month = input.nextLine();	
		System.out.println("You have entered " + month + " " + yearIn);	
		
		int year = Integer.parseInt(yearIn);
		
		if ( month.equals("Feb") ) {
			boolean isLeapYear =
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if ( isLeapYear == true )  {
			System.out.println( year + " is a leap year, so there are 29 days in Feb " + year + ".");
			}
			else if ( isLeapYear == false ) {
			System.out.println("28 days in " + month + " of " + year );
			}
		}
		else if ( month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec") ) {
		System.out.println(month + " " + year + " " + " has 31 days."); 
		}
		else if ( month.equals("Apr")|| month.equals("Jun") || month.equals("Sep") || month.equals("Nov") ) {
		System.out.println(month + " " + year + " has 30 days."); 
		}
		else {
			System.out.println(month + " is not a correct month name.");
		}


		
	}

}