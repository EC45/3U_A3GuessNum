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
   Scanner sc = new Scanner(System.in);
   Random numGenerator = new Random();
   
  
    // Generate a random number from 0-100
    //Variables
    int answer = numGenerator.nextInt(100);
    int lives = 5; // default guess num.
    int guess;
    int num = -1;
    System.out.println("Welcome to Guessing a number! \n");
    System.out.println("Guess a number, you have 5 guesses!!");
    System.out.println("If you lose... pfft game over!");

    while(sc.hasNextInt()) {
      guess = sc.nextInt();
      if (guess == answer && lives > 0){
          System.out.println("Correct !!");
      } else if (guess < answer && lives > 0){
          lives--;
          System.out.println("Your current guess : " + guess);
          System.out.println("Your number is too low");
          System.out.println("Your current live: " + lives);
      } else if (guess > answer && lives > 0){
          lives--;
          System.out.println("Your current guess : " + guess);
          System.out.println("Your number is too high");
          System.out.println("Your current live: " + lives);
      }
    }

    
    

    


    // if (answer == guess){
    //   System.out.println("Congrats!");
    //     break;
      
    // } else if (answer > guess && guess != numberofTries -1){
    //     System.out.println("The number is " + "greater than" + guess);
    // }
    
   // close main
   
   }
}

