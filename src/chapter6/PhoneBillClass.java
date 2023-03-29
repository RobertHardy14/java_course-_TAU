package chapter6;

import java.util.Scanner;

public class PhoneBillClass {

    static Scanner read = new Scanner(System.in);
    static double tax = 0.25;
    static double overage = 0.15;
    static int numOfUsedMin;
    static int numOfAMin;

    //Default Constructor
    PhoneBillClass(){
        int ID = 0;
        int numOfAMinutes = 0;
        int numOfUsedMin = 0;
    }

    //One that only takes the ID
    PhoneBillClass(int ID){
        ID = 0;
    }

    //One that accepts all fields
    PhoneBillClass(int ID, int numOfAMinutes, int numOfUsedMin){
        ID = 0;
        numOfAMinutes = 0;
        numOfUsedMin = 0;
    }

    public  int getOverage() {
        return numOfUsedMin;
    }
    public double setOverage(int numOfUsedMin){return numOfUsedMin * overage;}

    public int getNumOfAMin(){
        return numOfAMin;
    }

    public int setNumOfAMin(int numOfAMin) {return this.numOfAMin = numOfAMin;}
}


