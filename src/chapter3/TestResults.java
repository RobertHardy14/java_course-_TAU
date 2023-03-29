package chapter3;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Get Test Score
        System.out.println("Enter the test score");
        double score = Double.parseDouble(scanner.nextLine());
        //Determine Letter Grade
        char grade;

        if (score<60)
        {
            grade = 'F';
        } else if (score<70) {
            grade = 'D';
        } else if (score<80) {
            grade = 'C';
        } else if (score<90) {
            grade = 'B';
        } else grade = 'A';

        System.out.println("Your Grade is "+ grade);
    }
}
