/*
*Name:
Eric
*Date:
11/23/2021
*Desription:
*/

import java.util.*;

public class A3GuessNum{
  
  //int min and max
  // int min = 0;
  // int max = 100;
  // Scanner input = new Scanner(System.in);
  // Random numGenerator = new Random();
  //main method
  public static void main(String[] arg){
    // Make a scanner and Random Object.
   Scanner input = new Scanner(System.in);
   Random numGenerator = new Random();
   
  
    // Generate a random number from 0-5.
    int answer = numGenerator.nextInt(100) + 1;
    int numberofTries = 5; // default guess num.
    int guess;
    System.out.println("Welcome to Guessing a number! \n");
    System.out.println("Guess a number, you have 5 guesses!!");
    System.out.println("If you lose... pfft game over!");
    System.out.print("Your number: ");
    guess = input.nextInt();
    numberofTries--;
   //If the number is high or low, you lose a guess
    if (guess == answer){
    } else if (guess < answer && guess != numberofTries -1){
      System.out.println("Your number is too low");
      System.out.println("Your current guess: " + numberofTries);
    }else if(guess > answer && guess != numberofTries -1){
      System.out.println("Your number is too high");
      System.out.println("Your current guess: " + numberofTries);
    }

    // if (answer == guess){
    //   System.out.println("Congrats!");
    //     break;
      
    // } else if (answer > guess && guess != numberofTries -1){
    //     System.out.println("The number is " + "greater than" + guess);
    // }
    
      
  }// close main
}
