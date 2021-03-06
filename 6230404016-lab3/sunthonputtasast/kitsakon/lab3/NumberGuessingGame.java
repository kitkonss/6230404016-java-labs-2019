/**
 * You can guess the number from 1 to 10.
 * You can try only 5 times.
* Author: Kitsakon Sunthonputtasast
* ID: 623040401-6
* Sec: 1
* Date: December 23, 2019
*
**/
package sunthonputtasast.kitsakon.lab3;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to a number guessing game!");
        Scanner input = new Scanner(System.in);
        int secretNum = 1 + (int) (10 * Math.random());
        int guessNum = 1;
        int count = 0;
        boolean correct = false;

        while (true) {
            if (correct || guessNum > 5)
                break;
            System.out.print("Enter an integer between 1 and 10:");
            int yourGuess = input.nextInt();
            correct = (yourGuess == secretNum);
            if (secretNum > yourGuess) // && guessNum < 5)
                System.out.println("Try a higher number!");
            if (secretNum < yourGuess) // && guessNum < 5)
                System.out.println("Try a lower number!");
            guessNum += 1;
            count += 1;
        }
        if (correct) {
            System.out.println("Congratulations!");
            System.out.println("You have tried " + count + " times");

        } else {
            System.out.println("You have tried 5 times. You ran out of guesses");
            System.out.println("The answer is " + secretNum);
        }
    }
}