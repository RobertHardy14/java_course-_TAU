package chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables we know
        int minimumJobTime = 2;
        int minimumSalary = 30000;
        //Unknowns
        int actualSalary;
        int timeAtJob;
        //Everything else here
        System.out.println("Enter the salary of the person asking for the loan");
        actualSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the time the person asking for the loan has been at his/her job");
        timeAtJob = Integer.parseInt(scanner.nextLine());

        if (actualSalary>=minimumSalary && timeAtJob>=minimumJobTime){
                System.out.println("Congrats! You have been approved for a Loan!");
        }
        else System.out.println("Sorry you must make $ "+ minimumSalary + " to qualify for the loan");
    }
}
