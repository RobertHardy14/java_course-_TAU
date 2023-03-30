package chapter7;

import java.util.Scanner;

public class daysOfWeek {

   private static String [] days = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

   static Scanner scanner = new Scanner(System.in);

    public static String getDay(int dayNumber)
    {
        for(int i=0; i<=days.length; i++)
        {
            if(dayNumber == i)
            {
                System.out.println(days[dayNumber - 1]);
            }
        }

        return days[dayNumber - 1];
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number of the day of the week you want to see: ");
        int number = scanner.nextInt();
        getDay(number);
    }

}
