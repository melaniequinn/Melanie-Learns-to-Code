import java.util.*;
class TriangleChecker {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
			
	System.out.println("Enter three numbers for the side lengths of a triange: ");
	double sideOne = input.nextDouble();
	double sideTwo = input.nextDouble();
	double sideThree = input.nextDouble();
		
	boolean equilateral =
			(sideOne == sideTwo) && (sideOne == sideThree);
	boolean isosoles =
			(sideOne == sideTwo) || (sideOne == sideThree) || (sideTwo == sideThree);
	boolean scalene = 
			(sideOne != sideTwo) && (sideTwo != sideThree) && (sideOne != sideThree);
		
		if ( equilateral == true )
			System.out.println("The triangle is equilateral.");
		else if ( isosoles == true )
			System.out.println("The triangle is isosoles.");
		else if ( scalene == true )
			System.out.println("The triangle is scalene.");
		else 
			System.out.println("Invalid input.");
			
	double perimeter = (sideOne + sideTwo + sideThree);
	System.out.println("The perimeter of your triangle is " + perimeter );
	System.out.println("\nEnter two sidelengths for Triangle#2. Triangle#2 is a right angled triangle.");
	double sideOneB = input.nextDouble();
	double sideTwoB = input.nextDouble();
			
	double sideThreeB = Math.sqrt(sideOneB * sideOneB + sideTwoB * sideTwoB);
	System.out.println("The hypoteneuse is " + sideThreeB + ", and the perimeter is " + (sideOneB + sideTwoB + sideThreeB) + "\n");
		
		if (( sideOne / sideTwo ) == ( sideOneB / sideTwoB )) 
				System.out.println("The triangles are similar.");
		else
				System.out.println("The triangles are not similar.");
			
			
		}
	}