package com.stevelinz.hungry;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FoodChallengeFound implements FoodChallengeStrategy {

    public String foodReality() {

        guessNumber();

        return ("The food challenge is complete.");
    }

    void guessNumber() {
        int guess = 0;
        int number;
        int tries = 5; // after 5 tries give a hint.
        int guessCount = 0; // give a tally on how they did.
        Random randomNumbers = new Random();
        number = randomNumbers.nextInt(20) + 1;
        System.out.print("First, guess the number  (between 1 and 20)  ");
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Guess:");

            try {
                guess = keyboard.nextInt();
            } catch (InputMismatchException e){
                System.out.println("It is over, too hungry to type, Bye!");
                System.exit(3210);
            }

            while (guess > 20) {
                System.out.print("guess a number 20 or less  ");
                guess = keyboard.nextInt();
            }
            guessCount++;
            if (guess == number) {
                System.out.println("You guessed it the number was " + number);
                System.out.println("And it took you " + guessCount + " tries.");
                if (guessCount == 1)
                    System.out.println("!!!PERFECT GAME!!!"); // POSITIVE FEEDBACK
                System.out.println();
            } else if (guess > number)
                System.out.println("Too high, try again.");
            else
                System.out.println("Too low, try again.");
            if (tries <= 1 && guess != number) {
                if (number % 2 == 0)
                    System.out.println("HINT: The number is EVEN.");
                else
                    System.out.println("HINT: The number is ODD.");
            }
            tries--;
        } while (guess != number);
    }
}


