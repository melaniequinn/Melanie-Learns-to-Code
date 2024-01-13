class RandomLowercaseLetterGenerator {

	public static void main(String[] args) {

		System.out.println("Generate a random lowercase letter: ");
		int randomLetter =(int) (Math.random() * 26 + 97);
		
		System.out.println("Your random letter is " + (char)randomLetter);
		
	

	}

}
