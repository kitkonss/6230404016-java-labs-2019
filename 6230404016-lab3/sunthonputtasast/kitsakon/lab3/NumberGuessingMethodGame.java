package sunthonputtasast.kitsakon.lab3;

import java.util.Scanner;

public class NumberGuessingMethodGame {
    static void genAnswer() {
        int answer = 1 + (int) (10 * Math.random());
        NumberGuessingMethodGame.answer = answer;
    }

    static void playGame() {
        System.out.println("Welcome to a number guessing game!");
        Scanner input = new Scanner(System.in);
        int guessNum = 1;
        int num = 0;
        boolean correct = false;
        while (true) {
            if (correct || guessNum > 5)
                break;
            System.out.print("Enter an integer between 1 and 10:");
            int yourGuess = input.nextInt();
            correct = (yourGuess == answer);
            if (answer > yourGuess && guessNum < 5)
                System.out.println("Try a higher number!");
            if (answer < yourGuess && guessNum < 5)
                System.out.println("Try a lower number!");
            guessNum += 1;
            num += 1;
        }
        if (correct) {
            System.out.println("Congratulations!");
            System.out.println("You have tried " + num + " times");
        } else {
            System.out.println("You have tried 5 times. You ran out of guesses");
            System.out.println("The answer is " + answer);
        }
    }

    static int answer;

    public static void main(String[] args) {
        genAnswer();
        playGame();
    }
}