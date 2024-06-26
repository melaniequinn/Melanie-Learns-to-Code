import java.util.*;
public class CastOut {
	
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	double health = 100;
		System.out.println("Falling through space.... \nYou wonder if it was worth it...");
		System.out.println("What should you do?");
	//"Choice 1"
		//First Choice Selection - How do you want to play?
		System.out.println("1. Give in to the void and let the darkness take you. \n2. Search for a place to land and begin your plot to overtake the planet. \n3. Find a new home and start a new life.");
		
	double answer1 = input.nextDouble();
		
		if ( answer1 == 1 ) {
			//You let the darkness take you
			System.out.println("You close your eyes and float aimlessly for an indeterminable amount of time. \nYou reminisce about your quiet old life on Uozoa in the Neutral Zone. \nEverything and everyone, always placid. \nNeutral weather, neutral politics, and neutral relationships. \n\nWhere was the fun in that?\n\nIronically, that is all there will ever be again for you as you float through nothingness pointlessly. \nSo in the end, \nWas it worth it?\n\nGame Over.");
			System.out.println("Would you like to try again?");
			
			String retry = input.nextLine();
			
			if (retry == "Yes") 
			System.exit(16); 
			else if (retry == "No")
			System.exit(0);
			else
			System.out.println("Invalid input. Enter 'Yes' or 'No'.");	
			
			}
		
		else if ( answer1 == 2 ) 
			//You search for a planet to overthrow
			System.out.println("It's time to focus, you tell yourself. \nYou scan ahead, and three planets look to be in range. \nWhich one looks like a good planet to overtake?");
			
		else if ( answer1 == 3 )
			//You find a new home and start a new life
			System.out.println("Well, technically you got what you wanted. \nYou wanted a less boring life. \nThe neutral zone was strictly calm and neutral and you and your allies just wanted to be able to express yourselves. "
					+ "\nNow you have been banished and separated, cast rhoughout the universe to your demise.\nIt's time to start your new life. Which planet looks like a good place to start a new life?");	
		else 
			System.out.println("You can't seem to think of another option. Choose 1, 2, or 3.");
	//loop back to Choice 1
		
	//"Choice 2"
		//Second Choice selection - What do planet do you want to go to?
		System.out.println("1. A grey planet with no ozone, no moons, and no local traffic.\n2. A red and green planet with population, and security satellites.\n3. A small colourful planet with no local traffic or satellites and three moons.");	
	//Player chooses a planet 	
	double answer2 = input.nextDouble();
	//Next, a random number is assigned to determine success.
	int percent = (int)(Math.random() * 150 ) ;
	//if player chooses to fight, they have a default lower chance of success

	boolean success = 
			( percent * answer1 > 60 );
		//Will the planet approach succeed?
		//Planet 1 = A grey planet with no ozone, no moons, and no local traffic. Easy to approach. Add 20 to success
		if ( answer2 == 1 ) {
			percent = + 20;
			if ( success == true )
			System.out.println("Your efforts were successful. You have arrived at your new planet.");
			else {
			System.out.println("You were not successful. You lost 5 health.");
			health = (health-5);
				if (health > 0) {
					System.out.println("You died. Game over.");
					System.exit(0);	
			}
			System.out.println("Your health is " + health + ". Would you like to try again? \n1. Yes \n2. No ");

	//If failed and input = 1, Loop to planet selection	or if 2 end program	
				}}
		//Planet 2 = A red and green planet with population, and security satellites. Easy to approach for friends, difficult to approach as Enemies. 
		else if ( answer2 == 2 ) {
			if ( success == true ) 
			System.out.println("Your efforts were successful. You have arrived at your new planet.");
			else {
			System.out.println("You were not successful. You lost 5 health.");
			health = (health-5);
				if (health > 0) {
				System.out.println("You died. Game over.");
				System.exit(0);	
				}
			System.out.println("Your health is " + health + ". Would you like to try again? \n1. Yes \n2. No ");
			}}
	//If failed and input = 1 loop to planet selection	if input = 2 terminate program
		//Planet 3 = A colorful unguarded planet. Easy to approach but hard to live on. +5 to damage
		else if ( answer2 == 3 ) {
			percent = + 35;
			if ( success == true ) {
			health = (health-5);
			System.out.println("Your efforts were successful. You have arrived at your new planet, but its air is not breathable. -5 health. \nYour health is " + health );
			} else {
			System.out.println("You were not successful. You lost 5 health.");
			health = (health-5);
			System.out.println("Your health is " + ( health ) + ". Would you like to try again? \n1. Yes \n2. No ");
			System.out.println(health);
			}}
	//If failed and input = 1 loop to planet selection.
	//If failed and input = 2 end game and display game over message
		//if no valid input
		else {
		System.out.println("You look again... it looks like its option 1, 2, or 3... \nor we could just keep floating in the void?\nSo, what will it be? "
				+ "\n1. The Void\n2. The Choice"); 
		Scanner input2 = new Scanner (System.in);
		
		double answer3 = input2.nextDouble();
		
		if ( answer3 == 1 ) {
		System.out.println("You close your eyes and float aimlessly for an indeterminable amount of time. "
					+ "\nYou decided not to settle for another planet, but for the inevitable.\nGame Over."); 
		System.exit(1);
		}
	//Game Over
		else if ( answer3 == 2 ) {
		System.out.println("Excellent! Let the adventure continue!");
		System.out.println("Choose a planet: "); 
			}
		}
	//loop back to planet choice (answer2 input).
			
	//loop back to answer3 input
			
		//how to make this happen every time health is reduced.
		if (health == 0)
		System.out.println("You died. Game Over.");
			
			} 
}

