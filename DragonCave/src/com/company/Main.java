package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // Dragon Cave Introduction
    String Intro =
            "\nYou are in a land full of dragons. In front of you," +
            "\nyou see two caves. In one cave, the drangon is friendly" +
            "\nand will share his treasures with you. The other dragon" +
            "\nis greedy and hungry and will eat you on sight." +
            "\nWhich cave will you go into? (1 or 2)\n";

    // Input choice 1 or 2
        System.out.println(Intro);
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());

    // The outcome
        String Ending =
                "\nYou approach the cave..." +
                "\nIt is dark and spooky..." +
                "\nA large dragon jumps out in front of you! He opens his jaw and..." +
                "\nGobbles you down in one bite!";
        System.out.println(Ending);


    }
}
