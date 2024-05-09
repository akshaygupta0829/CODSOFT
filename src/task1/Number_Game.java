package task1;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {

		public static void main(String[] args) {
			Random rand = new Random();
			Scanner sc = new Scanner(System.in);
			int n = 100;
			
			int finalScore = 0;
			int chances = 5;
			System.out.println("Enter your name:");
			String name = sc.next();
			
			System.out.println("-------- Welcome to "+ name.toUpperCase()+ " in NUMBER GAME --------");
			System.out.println("Enter number in between 1 to 100");
			System.out.println("You have "+chances+" chances to play this game");
			boolean playGame = true;
			
			while(playGame)
			{ 
				boolean guess = false;
				int a = rand.nextInt(n);				
				
				for(int i=1;i<=chances;i++) 
				{
					System.out.println("\nEnter the "+ i +" chance");
					int guessno = sc.nextInt();
					if(guessno > 0 && guessno <= 100) {
						if(guessno == a)
					      {
						  System.out.println("You won the game");
						  guess = true;
						  finalScore++;
						  break;
						  }
						  else if(guessno>a)
						  {
							  System.out.println("number is to high");
						  }
						  else  
						  {
							  System.out.println("number is to low");
						  }
					}else {
						System.out.println("Please enter a number between 1 to 100");
					}
				}
				if(guess == false)
				{
					System.out.println("\nYou loss the game the number is "+a);
				}
				System.out.println("Do you want to play again enter y/n");
				String pa = sc.next();
				playGame = pa.equalsIgnoreCase("y");
				
			}
			
			System.out.println("\nThank you for playing ");
			System.out.println("Your winning score is "+finalScore );
		}
	    
	
}
