import java.util.*;
class PosOrNeg{
	public static void main(String args []) {	
		//if Y is a positive value, X=1
		Scanner input = new Scanner(System.in);
				
		System.out.println("Please enter a value for y: ");
		double y;
		double x;

		y = input.nextDouble();
		if (y > 0) {
			x = 1;

		} else {
			x = 0;
		}
		System.out.println("x = " + x);
		System.out.println("If the value of x was 1, you entered a positive value.");
		
		// Boolean Data Type - Use Boolean to store
		x = 1;
		System.out.println((x > 0)); // true
		System.out.println((x < 0)); // false
		System.out.println((x != 0)); // true
		System.out.println((x >= 0)); // true
		System.out.println((x != 1)); // false
	}
}
			
