package chapter4;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Number of items to scan
        System.out.println("Enter the number of items to scan");
        int quantity = Integer.parseInt(scanner.nextLine());

        double total = 0;

        //For Loop

        for (int i = 1; i<=quantity; i++)
        {
            System.out.println("Enter the cost of the item " + i);
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
