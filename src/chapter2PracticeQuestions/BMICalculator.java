package chapter2PracticeQuestions;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        int weight;
        int height;
        int BMI;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg: ");
        weight = input.nextInt();

        System.out.println("Enter your height in meters: ");
        height = input.nextInt();

        BMI = weight/(height*height);

        if(BMI < 18.5){
            System.out.print("You're Underweight");
        }

        if(BMI > 18.5 && BMI < 24.9){
            System.out.print("Your have a normal body size");
        }

        if(BMI > 25 && BMI < 29.9){
            System.out.print("You are Overweight");
        }

        if(BMI > 30){
            System.out.print("You're Obese");
        }
    }
}
