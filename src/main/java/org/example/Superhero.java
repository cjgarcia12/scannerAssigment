package org.example;

import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero");
        System.out.println("Who is the hero of our story?");
        String heroName = scanner.nextLine();

        System.out.println("What is their superpower?");
        String superpower = scanner.nextLine();
        System.out.println("Here is the story.");

        System.out.println("In a quiet town, there lived a remarkable individual named " + heroName +
                "who had the extraordinary ability of " + superpower + ".");
        System.out.println("One day, a great danger threatened their town, and " + heroName +
                " realized it was time to step up.");
        System.out.println("With courage and determination, " + heroName + " harnessed their power of " + superpower +
                " to protect their home and bring peace back to their community.");


    }

}
