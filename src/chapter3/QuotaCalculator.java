package chapter3;

/*
If Else
All sales people are expected to make at least 10 sales each week
For those who do, they recieve a congratulartory message
For those who don't, they're informed of how many sales they were short
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //Init known values
        int salesTarget = 10;
        //Get Unknown values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sales made this week: ");
        int numberOfSales = Integer.parseInt(scanner.nextLine());
        //Make a decision on the path to take
        if (numberOfSales>=salesTarget){
            System.out.println("Congrats! Number of sales achieved");
        }
        else System.out.println("You were off by " + (salesTarget - numberOfSales) + " sale(s)");
    }
}
