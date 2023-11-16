

import java.util.Scanner;
public class HealthApplication {

 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   // Prompt the user to enter weight in pounds
   System.out.print("Enter weight in pounds: ");
   double weight = input.nextDouble();
   
   // Prompt the user to enter height in feet and inches
   System.out.print("Enter feet: ");
   double ft = input.nextDouble();
   System.out.print("Enter inches: ");
   double in = input.nextDouble();
   double height =  ((ft * 12) + in);
   System.out.print("Height is " + height + " inches. ");
   
   
   final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
   final double METERS_PER_INCH = 0.0254; // Constant 
   
   // Compute BMI
   double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
   double heightInMeters = height * METERS_PER_INCH; 
   double bmi = weightInKilograms / 
     (heightInMeters * heightInMeters);

   // Display result
   System.out.println("BMI is " + bmi);
   if (bmi < 18.5)
     System.out.println("Underweight");
   else if (bmi < 25)
     System.out.println("Normal");
   else if (bmi < 30)
     System.out.println("Overweight");
   else
     System.out.println("Obese");
 }
}