package chapter3;

/*
IF Statement
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        //Initalize known values
        int salary = 1000;
        int bonus = 250;

        //Get values for the unknown
        System.out.println("Enter the amount of sales");
        Scanner scanner = new Scanner(System.in);
        int sales = Integer.parseInt(scanner.nextLine());
        scanner.close();
        //Quick detour for the bonus earners
        if (sales>10){
            salary = salary + bonus;
        }
        //Output
        System.out.println("The Salary is: "+ salary);
    }

}
