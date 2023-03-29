package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String[] arg){
        // 1 Get the number of hours worked
        System.out.println("Enter the number of hours worked: ");
        Scanner scanner = new Scanner(System.in);
       int hours = scanner.nextInt();

        // 2 Get the hourly pay rate
        System.out.println("Enter the employee pay rate.");
        double payRate = scanner.nextDouble();
        scanner.close();
        // 3 Multiply the hours and pay rate
        double result = hours * payRate;
        // 4 Display Result
        System.out.println("The employee Gross Pay is " + result);
    }
}
