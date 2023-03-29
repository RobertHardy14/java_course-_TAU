package chapter2;

import java.util.Scanner;

public class madLibs {
    public static void main(String[] args) {
        /*
         * Create a program that asks the user for a season of the year, then a whole number
         * then an adjective. Use the input to complete the sentence below then output the result:
         * "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee"
         */

        System.out.println("This program is to complete a phrase, entering a season of the year, a whole number and an adjective \n");

        System.out.println("Enter a Season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter an adjective");
        String adj = scanner.nextLine();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of "+ number + " cups of coffee");
    }
}
