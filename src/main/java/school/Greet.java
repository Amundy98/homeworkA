package school;

import java.util.Locale;
import java.util.Scanner;

public class Greet {


    public String greeting () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        return sc.nextLine();
    }

    public static String greetUser(String username) {
        if (username.toUpperCase().equals("alice")) {
        return "Hello," + username + ".";
        }else if (username.toUpperCase().equals("Bob")) {
        return "Hello," + username + ".";
        } else {
            return "Sorry, who?";
        }

    }

    public void message (String userInput){
        System.out.println(userInput);
    }
}