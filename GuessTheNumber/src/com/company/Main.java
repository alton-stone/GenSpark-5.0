package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Hello! What is your name?");

        Scanner Keyboard = new Scanner(System.in);
        String name = Keyboard.nextLine();

        System.out.println("\n" + name + "\n\nWell," + name + ",I am thinking of a number between 1 and 20.");

        Random rand = new Random();
        int number = rand.nextInt(20);

        int i = 0;
        boolean good = false;

        while (good == false) {
            System.out.println("\nTake a guess.\n");
            int guess = Keyboard.nextInt();
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
        System.out.println("Good job," + name + "! You guessed my number in " + i + " guesses!\n" +
                    "Would you like to play again? (y or n)");


    }
}

