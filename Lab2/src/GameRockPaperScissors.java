import java.util.*;
public class GameRockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//A scissor(0) can cut > (2)paper
		//A rock (1) can knock scissor > (0)
		//Paper (2) can wrap rock > (1)
		
		double rock = 1;
		double paper = 2;
		double scissors = 0;
		int computer = (int) (Math.random() * 10 % 3 );
		
				
		//Player enter a value
		System.out.println("Lets play 'Rock, Paper, Scissors'! \nRock(1), Paper(2), or Scissors(0)?");
		double player = input.nextDouble();
		
		/*if ( player == 1 )  {
			player = rock;
			if ( computer == 0 ) 
				System.out.println("You are rock. The computer is scissors. You win!");
			else if ( computer == 1 )
				System.out.println("You are rock. The computer is rock. Its a draw.");
			else if ( computer == 2 )
				System.out.println("You are rock. The computer is paper. You lose.");
		}
		else if ( player == 2 )   {
			player = paper;
			if ( computer == 0 ) 
				System.out.println("You are paper. The computer is scissors. You lose.");
			else if ( computer == 1 )
				System.out.println("You are paper. The computer is rock. You win!");
			else if ( computer == 2 )
				System.out.println("You are paper. The computer is paper. It's a draw.");
		}
		else if ( player == 0 )   {
			player = scissors;
			if ( computer == 0 ) 
				System.out.println("You are scissors. The computer is scissors. It's a draw.");
			else if ( computer == 1 )
				System.out.println("You are scissors. The computer is rock. You lose.");
			else if ( computer == 2 )
				System.out.println("You are scissors. The computer is paper. You win!");
		}	
		else 
			System.out.println("Invalid input. Enter 0, 1, or 2.");
		*/
		boolean win = 
			( player > computer) || (( player == 0 ) && ( computer == 2 ));
		boolean draw = 
			( player == computer );
			
		if ( player > 2 ) {
			System.out.println("Invalid entry.");
		}
		else if ( win == true )
		System.out.println("You chose " + player + " and computer chose " + computer + ". You win!");
		else if ( draw == true )
		System.out.println("You chose " + player + " and computer chose " + computer + ". It's a draw.");
		else if ( win == false )
		System.out.println("You chose " + player + " and computer chose " + computer + ". You lose.");
		else
		System.out.println("Invalid input.");
		
	
		}
}
