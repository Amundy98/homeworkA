package Rool;

import java.util.Scanner;

public class Oop {



    public static void main(String[] args) {
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);

        while (isCorrect == false) {
            System.out.println("What's your name?");
            String username = "";
            username = sc.nextLine();
            if (username.equalsIgnoreCase("alice")) {
                System.out.println("Hello," + username + ".");
                isCorrect = true;
            } else if (username.equalsIgnoreCase("Bob")) {
                System.out.println("Hello," + username + ".");
                isCorrect = true;
            } else {
                System.out.println("Sorry, who?");

            }

        }

    }



}
