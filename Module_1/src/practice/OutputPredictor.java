package practice;
import java.util.*;


public class OutputPredictor {
	public static void main(String[] args) {
	char what ='A'+1;
	System.out.println("2. " + what);
	System.out.println("3. " + "AbA".compareToIgnoreCase("abC"));	
	System.out.println("4. " + "abc".compareTo("aba"));
	System.out.println("5. " + "Java"+1+2+3);
	
	char val = '4';
	System.out.println("6. " + (char)4 + val);
	
	char c = 100;
	System.out.println("7. " + c);
	
	System.out.println("SELECT".substring(4, 4));
	
	String s1 = "A String";
	String s2 = "Another String";		
	System.out.println(s1.equals(s2) == s2.equals(s1));
	
	String s = "Something about Java";
	//System.out.println(String.toUpperCase("Java"));
	//System.out.println("Java".toUpperCase("Java"));
	System.out.println("Java".toUpperCase());
	//System.out.println(toUpperCase("Java"));

	char x = s.charAt(4);
	System.out.println(x);

	char ch = 'b';
	if (ch >= 'A' && ch >= 'Z')
		System.out.println(ch + " is a capital letter (A)");
	if(ch >= 'A' && ch <= 'Z')
		System.out.println(ch + " is a capital letter (B)");
	if(ch >= 'A' || ch <= 'Z')
		System.out.println(ch + " is a capital letter (C)");
	//if ('A' <= ch <= 'Z')	
	//System.out.println(ch + "is a capital letter");			

	
	}
}
