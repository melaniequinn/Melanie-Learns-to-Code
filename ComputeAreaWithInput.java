
import java.util.Scanner;

class ComputeAreaWithInput {

	public static void main(String[] args) {
		double radius; 
		double area;
		Scanner input = new Scanner(System.in);
		//assign a value to radius w user input
		System.out.print("Please enter a number for radius: ");
		radius = input.nextDouble(); 
		
		//Calculate Area
		area = radius * radius * 3.141592645;
		
		//Display results option 1 (commented out)
		
		//System.out.print("The area of a circle with radius ");
		//System.out.print (radius);
		//System.out.print (" is ");
		//System.out.println(area);
		
		//OR
		System.out.print("The area of a circle with radius " + radius + " is " + area);

		
	}

}