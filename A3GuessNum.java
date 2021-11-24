
import java.util.*;

public class GuessGame{

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


        // Generate a random number from 0-5.
        int answer = numGenerator.nextInt(100);
        int live = 3; // default guess num.
        int guess;
        System.out.println("Welcome to Guessing a number! \n");
        System.out.println("Guess a number, you have 5 guesses!!");
        System.out.println("If you lose... pfft game over!");
        System.out.print("Your number: ");

        while(sc.hasNextInt()){
            guess = sc.nextInt();
            if (guess == answer && live > 0){
                System.out.println("Correct !!");
            } else if (guess < answer && live > 0){
                live--;
                System.out.println("Your current guess : " + guess);
                System.out.println("Your number is too low");
                System.out.println("Your current live: " + live);
            }else if(guess > answer && live > 0){
                live--;
                System.out.println("Your current guess : " + guess);
                System.out.println("Your number is too high");
                System.out.println("Your current live: " + live);
            }
        }
    }// close main
}
