package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Begin Guess The Number Game
        System.out.println("Hello! What is your name?");

        //Input name
        Scanner Keyboard = new Scanner(System.in);
        String name = Keyboard.nextLine();

        System.out.println("\n" + name);
        System.out.println("\n\nWell," + name + ",I am thinking of a number between 1 and 20.");

        //Random number generated
        Random rand = new Random();
        int guess = rand.nextInt(20) + 1;

        //counter for number of guesses
        //while loop with nested if statements to guess the number
        int i = 0;
        boolean good = false;
        while (!good) {
            System.out.println("\nTake a guess.\n");
            int input = Keyboard.nextInt();
            i++;

            if (input == guess) {
                good = true;
            }
            else if (i > 5) {
                return;
            }
            if (input > guess) {
                System.out.println("\nYour guess is too high.");
            }
            if (input < guess) {
                System.out.println("\nYour guess is too low.");
            }
        }
        //Outcome when you win game within 6 guesses
        System.out.println("\nGood job," + name + "! You guessed my number in " + i + " guesses!");
        System.out.println("\nWould you like to play again? (y or n)\n"+ Keyboard.nextLine());
        System.out.println(Keyboard.nextLine());
    }
}
