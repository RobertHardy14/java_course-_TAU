package chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static Scanner scanner = new Scanner(System.in);
    static int expectedSalary = 25000;
    static int requiredCreditScore = 700;

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        //Check if user is qualified
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
        scanner.close();
    }

    public static double getSalary(){
        System.out.println("Enter your Salary");
        double salary = scanner.nextDouble();
        return salary ;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore>=requiredCreditScore && salary>=expectedSalary) {
            return true;
        }
        else return false;
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You're qualified for a Credit");
        }
        else System.out.println("Sorry, you have not qualified for Credit");
    }

}
