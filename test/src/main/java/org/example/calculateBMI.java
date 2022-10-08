package org.example;

import java.util.Scanner;

public class calculateBMI {

    static void println(String string) {
        System.out.println(string);
    }

    static void print(String string) {
        System.out.print(string);
    }

    private static void printBMIResult(float bmi) {
        String result = "";

        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 25) {
            result = "Normal";
        } else if (bmi < 30) {
            result = "Overweight";
        } else {
            result = "Obese";
        }
        println("Your BMI is " +  bmi + "and that means you are " + result);
    }

    private static void calculateBMImethodOne() {
        Scanner scanner = new Scanner(System.in);
        println("Enter weight in Pounds : ");
        float weight = scanner.nextFloat();

        println("Enter Height in inches : ");
        float height = scanner.nextFloat();

        float bmi = (weight * 703) / (height * height);

        //print the result
        printBMIResult(bmi);

    }
    private static void calculateBMImethodTwo() {
        Scanner scanner = new Scanner(System.in);
        println("Enter weight in Kilogram : ");
        float weight = scanner.nextFloat();

        println("Enter Height in Meters : ");
        float height = scanner.nextFloat();

        float bmi = (weight) / (height * height);

        //print the result
        printBMIResult(bmi);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        println("You can calculate BMI by entering weight in pounds and height in inches or Weight in Kilograms and Height in Meter.");

        while (true) {
            println("");
            println("Enter 1 for entering weight/height in pounds/inches OR 2 for kilogram/meters : ");
            int userInput;

            userInput = sc.nextInt();

            if (userInput == 1) {
                calculateBMImethodOne();
                break;
            } else if (userInput == 2) {
                calculateBMImethodTwo();
                break;
            } else {
                println("Invalid Input !!!");
                continue;
            }
        }
    }
}