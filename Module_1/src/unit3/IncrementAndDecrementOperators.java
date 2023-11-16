package unit3;

public class IncrementAndDecrementOperators {
	private static final String MAX_VALUE = null;

	public static void main (String[] args ) {
		//Variables here
		double i=1;
		double j=++i;
		
		System.out.println( "when j=++i , j= " + j + " and i = " + i + " because j becomes i after i increases.");
		System.out.println(" ");
		
		double m=1; //represents i below)
		double n=m++;		//represents j below
		
		System.out.println( "when j=i++, j= " + n + " and i = " + m + " because j becomes i before i increases.");
		

				
		
	}
}
