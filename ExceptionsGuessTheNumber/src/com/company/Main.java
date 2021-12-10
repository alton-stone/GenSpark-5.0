package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello! What is your name?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        //try catch block for string input
        try {
            System.out.println(name);
        }
        catch (Exception e) {
            System.out.println("Caught Exception: User Input Error");
        }
        System.out.println("\n\nWell," +name+ ",I am thinking of a number between 1 and 20.");

        //set random number between 1-20
        Random rand = new Random();
        int number = rand.nextInt(20);

        //counter for number of guesses
        int i = 0;

        //counter loop for number of guesses
        boolean good = false;
        while (good == false) {
            System.out.println("\nTake a guess.\n");
            int guess = input.nextInt();

            //try catch block for integer input
            try {
                System.out.println(guess);
            }
            catch (Exception e) {
                System.out.println("Caught Exception: User input was not a number");
            }
            i++;
            if (guess == number) {
                good = true;
            }
            else if (i > 5) {
                return;
            }
            if (guess > number) {
                System.out.println("\nYour guess is too high.");
            }
            if (guess < number) {
                System.out.println("\nYour guess is too low.");
            }
        }
        //If boolean becomes true
        System.out.println("Good job," + name + "! You guessed my number in " + i + " guesses!\n" +
                "Would you like to play again? (y or n)");
    }
}

