class ComputeArea {

	public static void main(String[] args) { //memorize
		double radius = 4.2; //creates or declares a variable named radius - Variable has to be created before it can be used
		double area; //these are buckets called Variables, specify type aka double, then the name
		
		//assign a value to radius
		//radius = 4.2; (commented out because it is now defined above)
				//= is called an assignment operator
		//Calculate Area
		area = radius * radius * 3.141592645;
		
		//Display results
		System.out.print("The area of a circle with radius ");
		System.out.print (radius);
		System.out.print (" is ");
		System.out.println(area);
		
		//+ means concatenation system, adds value as long as its recognized as part of the string
		
		System.out.print("The area of a circle with radius " + radius + " is " + area);
		//Spaces between quotation marks are important for properly formatted output sentences
		//Spaces between numbers and signs are important for properly formatted code
		
		
		
	}

}