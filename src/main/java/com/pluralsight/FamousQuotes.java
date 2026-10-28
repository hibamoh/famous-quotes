package com.pluralsight;
import java.util.Scanner;


public class FamousQuotes {
    static void main() {

    try {
        Scanner myScanner = new Scanner(System.in);
        String[] quotes = new String[3];

        quotes[0] = "to be or no to be";
        quotes[1] = "i think therefore i am";
        quotes[2] = "oxfords not brouges";

        System.out.println(" which quote do you want? 1-3");
        String userInput = myScanner.nextLine();

        int number = Integer.parseInt(userInput);

        number--;

        System.out.println(quotes[number]);
    }
    catch (Exception e) {

        System.out.println("your number was out of range!");

    }

    }
}
