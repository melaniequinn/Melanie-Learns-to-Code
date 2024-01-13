import java.util.Scanner;

class ComputeAreaWithConstants {

	public static void main(String[] args) {
		double radius; 
		double area;
		final double PI = 3.141592654;
		//all caps for MAX VALUE such as PI above
		Scanner input = new Scanner(System.in);
		//assign a value to radius w user input
		System.out.print("Please enter a numeric value for radius: ");
		radius = input.nextDouble(); 
		//Next Double is a method and uses camelCaps
		
		//Calculate Area
		area = radius * radius * PI;
		
		//Display results option 1 (commented out)
		
		//System.out.print("The area of a circle with radius ");
		//System.out.print (radius);
		//System.out.print (" is ");
		//System.out.println(area);
		
		//OR
		System.out.print("The area of a circle with radius " + radius + " is approximately " + area + " cm^2");

		
	}

}