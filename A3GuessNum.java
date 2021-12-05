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
    int live;
    int num = -1;
    int diff = 1;
    int in = -1;
    int lowBound = 1;
    int highBound = 101;
    int count = 0;
    System.out.println("Welcome to Guessing a number! \n");
    System.out.println("Guess a number, you have 5 guesses!!");
    System.out.println("If you lose... pfft game over!");
    System.out.print("Your number: ");
    
     while(in != num && live > 0) {
                //if user's number is less than the generated number
                if(in < num) {
                    if(in < lowBound) {}
                    else {
                        lowBound = in;
                    }
                    System.out.println("\nLives left: " + live);
                    if(highBound == 101) {
                        System.out.println("Current range: (" + lowBound + "-" + (highBound-1) + ")");
                    } else {
                        System.out.println("Current range: (" + lowBound + "-" + highBound + ")");
                    }
                    //if difficulty is "1", then show the hints
                    if(diff == 1) {
                        if(num-in >= 1 && num-in <= 10) {
                            System.out.println("You are very close, just a bit higher");
                        } else if(Math.abs(in-num) > 50){
                            System.out.println("You are FREEZING right now!\nPlease choose a higher number.");
                        } else if(Math.abs(in-num) > 25) {
                            System.out.println("You are a bit cold right now.\nPlease choose a higher numer.");
                        } else if(Math.abs(in-num) > 10) {
                            System.out.println("You are very warm right now.\nPlease choose a higher number");
                        }
                    }
                    System.out.print("Enter a new number: ");
                     
                }

                //if user's number is more than the generated number
                else if(in > num) {
                    if(in > highBound) {}
                    else {
                        highBound = in;
                    }
                    System.out.println("\nLives left: " + live);
                    System.out.println("Current range: (" + lowBound + "-" + highBound + ")");
                    if(diff == 1) {
                        if(in-num >= 1 && in-num <= 10) {
                            System.out.println("You are very close, just a bit lower");
                        } else if(Math.abs(in-num) > 50){
                            System.out.println("You are FREEZING right now!\nPlease choose a lower number.");
                        } else if(Math.abs(in-num) > 25) {
                            System.out.println("You are a bit cold right now.\nPlease choose a lower numer.");
                        } else if(Math.abs(in-num) > 10) {
                            System.out.println("You are very warm right now.\nPlease choose a lower number");
                        }
                    }
                    System.out.print("Enter a new number: ");
                     
                }
            }


  
    // while(sc.hasNextInt()) {
    //   guess = sc.nextInt();
    //   if (guess == answer && lives > 0){
    //       System.out.println("Correct !!");
    //   } else if (guess < answer && lives > 0){
    //       lives--;
    //       System.out.println("Your current guess : " + guess);
    //       System.out.println("Your number is too low");
    //       System.out.println("Your current live: " + lives);
    //   } else if (guess > answer && lives > 0){
    //       lives--;
    //       System.out.println("Your current guess : " + guess);
    //       System.out.println("Your number is too high");
    //       System.out.println("Your current live: " + lives);
    //   }
    // }
    // if(diff == 1) {
    //   if(num-in >= 1 && num-in <= 10) {
    //     //System.out.println("You are really close, a bit higher though");
    //   } else if(Math.abs(in-num) > 50){
    //     //System.out.println("You are cold.");
    //   } else if(Math.abs(in-num) > 25) {
    //     //System.out.println("You are barely cold.");
    //   } else if(Math.abs(in-num) > 10){
    //     //System.out.println("You are so warm.");
    //     }
    //     //System.out.println("Enter a new number");
    //     //check();
    // }
    

    


    // if (answer == guess){
    //   System.out.println("Congrats!");
    //     break;
      
    // } else if (answer > guess && guess != numberofTries -1){
    //     System.out.println("The number is " + "greater than" + guess);
    // }
    
   // close main
     live += count;
     live--;
   }
}

