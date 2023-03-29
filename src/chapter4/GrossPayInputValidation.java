package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        //Known
        int maxHoursWorked = 40;
        int rate = 15;

        //Unknown
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of hours worked this week");
        double totalHoursWorked = scanner.nextDouble();

        //validate input
        while (totalHoursWorked > maxHoursWorked)
        {
            System.out.println("Invalid Entry, your hours must be between 1 and 40. Try Again");
            totalHoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //calculate gross
        double gross = rate * totalHoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
