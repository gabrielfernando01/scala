package com.rockthejvm;

import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I'm Rock, the chatbot your progrmmed.");
        System.out.println("May I know your name?");

        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");

        System.out.println("I'm going to try to guess your age.");
        System.out.println("May I know the remainder of your age divided by 5?");
        int ageMod5 = scanner.nextInt();
        System.out.println("Thank you, May I know the remainder of your age divided by 7?");
        int ageMod7 = scanner.nextInt();
        System.out.println("Thank you!, May I know the remainder of your age divided by 9?");
        int ageMod9 = scanner.nextInt();

        System.out.println("You wrote: " + ageMod5 + ", " + ageMod7 + " and " + ageMod9);

        // deduce age
        int age = 0;
        int potentialAge = 1;
        while (potentialAge <= 120) {
            if ((potentialAge % 5 == ageMod5) && (potentialAge % 7 == ageMod7) && (potentialAge % 9 == ageMod9)) {
                age = potentialAge;
                break;
            }
            potentialAge++;
        }

        if (age == 0) {
            System.out.println("Error: Invalid age");
        } else {
            System.out.println("Based on your provided remainders, You should be " + age + " years old.");
        }
    }
}
