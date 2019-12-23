/**
 * You can guess the number from min to max.
 * You can try only numTries times.
 * If the game over.You can input Y or y to play again.
 * If you input an integer more than max or input an integer less than min,
 * It shows The number must be between  + min +  and + max
* Author: Kitsakon Sunthonputtasast
* ID: 623040401-6
* Sec: 1
* Date: December 23, 2019
**/
package sunthonputtasast.kitsakon.lab3;

import java.util.Scanner;

public class NumberGuessingConfigurableGame {

    static int answer, min, max, numTries;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        configure();
        genAnswer();
        playGame();

    }

    static void configure() {
        Scanner input = new Scanner(System.in);
        NumberGuessingConfigurableGame.input = input;
        boolean correct = false;
        while (true) {
            if (correct)
                break;
            System.out.print("Enter the min value:");
            int min = input.nextInt();
            NumberGuessingConfigurableGame.min = min;
            break;
        }
        while (true) {
            if (correct)
                break;
            System.out.print("Enter the max value:");
            int max = input.nextInt();
            NumberGuessingConfigurableGame.max = max;
            break;
        }
        while (true) {
            if (correct)
                break;
            System.out.print("Enter the maximum number of tries:");
            int numTries = input.nextInt();
            NumberGuessingConfigurableGame.numTries = numTries;
            break;

        }
    }

    static void genAnswer() {
        int answer = min + (int) (((max - min) + 1) * Math.random());
        NumberGuessingConfigurableGame.answer = answer;
    }

    static void playGame() {
        System.out.println("Welcome to a number guessing game!");
        int guessNum = 1;
        int count = 0;
        boolean correct = false;
        while (true) {
            if (correct || guessNum > numTries)
                break;
            System.out.print("Enter an integer between " + min + " and " + max + ":");
            int yourGuess = input.nextInt();
            correct = (yourGuess == answer);
            if (yourGuess < min || yourGuess > max) {
                System.out.println("The number must be between " + min + " and " + max);
                guessNum -= 1;
            }
            if (answer > yourGuess && yourGuess >= min && yourGuess <= max)
                System.out.println("Try a higher number!");
            if (answer < yourGuess && yourGuess >= min && yourGuess <= max)
                System.out.println("Try a lower number!");
            guessNum += 1;
            count += 1;
        }
        if (correct) {
            System.out.println("Congratulations!");
            System.out.println("You have tried " + count + " times ");
            boolean playAgain = false;
            String again = "y";
            while (true) {
                if (playAgain || again == "y")
                    System.out.print("Want to play again (Y or y):");
                Scanner temp = new Scanner(System.in);
                String user = temp.nextLine();
                playAgain = (user.equals("y") || user.equals("Y"));
                if (user.equals("y") || user.equals("Y")) {
                    playGame();
                } else {
                    System.out.println("Thank you for playing our games. Bye!");
                }
                break;
            }
        } else {
            System.out.println("You have tried " + numTries + " times. You ran out of guesses");
            System.out.println("The answer is " + answer);
            boolean playAgain = false;
            String again = "";
            while (true) {
                if (playAgain || again.equals(""))
                    System.out.print("Want to play again (Y or y):");
                Scanner temp = new Scanner(System.in);
                String user = temp.nextLine();
                playAgain = (user.equals("y") || user.equals("Y"));
                if (user.equals("y") || user.equals("Y")) {
                    playGame();
                } else {
                    System.out.println("Thank you for playing our games. Bye!");
                }
                break;

            }
        }
    }

}