package chapter2PracticeQuestions;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userInput;
        int number = 2;

        System.out.print("Enter a number: ");
        userInput = input.nextInt();

        if (userInput % number == 0){

            System.out.println("Number is even");
        }

        if (userInput % number != 0){

            System.out.println("Number is odd");
        }


        System.out.print("Enter a number: ");
        userInput = input.nextInt();


        if (userInput % number != 0) {

            System.out.print("Number is odd");
        }

        if (userInput % number == 0) {

            System.out.println("Number is even");
        }


    }
}

