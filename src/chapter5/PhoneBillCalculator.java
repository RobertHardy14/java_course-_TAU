package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double tax = 0.15;
    static double overage = 0.25;

    public static void main(String[] args) {
        System.out.println("This program is to calculate the Total of your phone bill");
        System.out.println("Enter the plan fee: ");
        double planFee = scanner.nextDouble();
        System.out.println("Enter the amount of overage minutes: ");
        int overageMins = scanner.nextInt();
        double overageFee = calculateOverageFee(overageMins);
        double total = calculateTotal(overageFee,planFee);
        double taxTotal = calculateTax(total, tax);

        System.out.println("Phone Bill Statement: ");
        System.out.println("Plan $"+ planFee);
        System.out.println("Overage Charge $"+ overageFee);
        System.out.println("Tax $" + taxTotal);
        System.out.println("Total with Tax $" + (total+taxTotal));
    }

    public static double calculateTax(double total, double tax)
    {
        double taxTotal = total * tax;
        return taxTotal;
    }

    public static double calculateOverageFee(int overageMins)
    {
        double overageFee = overageMins * overage;
        return overageFee;
    }

    public static double calculateTotal(double overageFee, double planFee)
    {
        double total =  overageFee + planFee;
        return total;
    }

}
