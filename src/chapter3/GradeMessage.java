package chapter3;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your letter grade");
        String grade = scanner.next();
        String message;

        switch (grade){
            case "A":
                message = "Your grade is " + grade + " Excellent Job!";
                break;
            case "B":
                message = "Your grade is " + grade + " Great Job!";
                break;
            case "C":
               message = "Your grade is " + grade + " Good Job!";
                break;
            case "D":
                message = "Your grade is " + grade + " You need to work a bit harder!";
                break;
            case "F":
                message = "Your grade is " + grade + " Uh Oh!";
                break;
            default:
                message = "Error Invalid Grade";
                break;
        }
        System.out.println(message);
    }
}
