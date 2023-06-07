package com.wonderwebdev;
import java.util.Random;
import java.util.Scanner;
public class Assignment2App {

	public static void main(String[] args) {
		// random number game
		//generate random number 1-100--target number
		Random random = new Random();
		int targetNumber = random.nextInt(101);
		
		Scanner scanner = new Scanner(System.in);
		int guesses = 0;
		//start the guessing loop
		while(guesses < 5) {
		// get the user's guess
			
			if (guesses == 0) { 
			System.out.println("Please pick a number between 1 and 100.");
			}
			int guess = scanner.nextInt();
		// validate guess
			if(guess< 1 || guess> 100) {
				System.out.println("Your guess is not between 1-100. Please try again");
				continue;
			}
		//if a guess is valid, check against target number
			if (guess > targetNumber) {
			    System.out.println("Please pick a lower number");
			    guesses++;
			} else if (guess < targetNumber) {
			    System.out.println("Please pick a higher number");
			    guesses++;
			} else {
			    System.out.println("You win!");
			    break;
			}

		//End Game = guess correct or failed attempts = 5
			if (guesses == 5) {
			    System.out.println("You lose, the number to guess was " + targetNumber);
			}


	}
		scanner.close();
  }
}
