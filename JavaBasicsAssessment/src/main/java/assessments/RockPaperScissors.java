/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessments;

import java.util.Scanner;

/**
 *
 * @author DivyaDeverapally
 */
public class RockPaperScissors {
    
    
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean isContinue = true;   
	
		
		while (isContinue) {
			
			System.out.println("Please enter how many round you would like to play");
			int numberOfRounds = input.nextInt();
			
			if (numberOfRounds < 1 || numberOfRounds > 10) 
			{
				System.out.println("The range should be between 1 and 10");
				System.out.println("Restart the game again!!!");
				return;
			} 
			else
			{
				gamePlay(numberOfRounds);
				
				System.out.println("Do you want to continue ? (y/n) ");
				String c = input.next();
				if (c.equalsIgnoreCase("y")) {
					isContinue = true;
				} else {
					System.out.println("******************Thanks for playing!*********************");
					isContinue = false;
				}

			}
		}

	}

	private static void gamePlay(int numberOfRounds) {
		// TODO Auto-generated method stub
		int ties = 0, userWins = 0, computerWins = 0;  //variables to store the result after each round
		//Below loop is to iterate over number of rounds entered by user	
		for (int round = 1; round <= numberOfRounds; round++)
			{
				System.out.println("Choose an option from below 1/2/3");
				System.out.println("1 : Rock");
				System.out.println("2 : Paper");
				System.out.println("3 : Scissors");
				

				int userChoice = input.nextInt();
				
				if(userChoice != 1 && userChoice != 2 && userChoice != 3)
				{
					System.out.println("Invalid choice ");
					System.out.println("Enter your choice again");
					userChoice= input.nextInt();
				}
				int computerChoice = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);

				if (userChoice == computerChoice)
					{
						ties++;
					}     
				 if ((userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)
						|| (userChoice == 1 && computerChoice == 3))
					{
						userWins++;
					} 
				 if ((computerChoice == 2 && userChoice == 1) || (computerChoice == 3 && userChoice == 2)
						|| (computerChoice == 1 && userChoice == 3))
					{
						computerWins++;
					}

			}

		System.out.println("Total number of Rounds are : " + numberOfRounds);
		System.out.println("Number of Ties : " + ties);
		System.out.println("Number of User Wins : " + userWins);
		System.out.println("Number of Computer Wins : " + computerWins);
		System.out.println();
		if(userWins== computerWins)
		{
			System.out.println("Both User and Computer won equally");
		}
		else if (userWins > computerWins) {
			System.out.println("User won in most of the rounds");
		} else {
			System.out.println("Computer won in most of the rounds");
		}
		
	}

}
