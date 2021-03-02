package chapter2PracticeQuestions;

import java.util.Scanner;

public class IntegerDisplay {

        public static void main(String[] args) {

            Scanner inputInteger = new Scanner(System.in);

            int firstNumber;
            int secondNumber;
            int sum;
            int product;
            int difference;
            int quotient;

            System.out.println("Enter a number: ");
            firstNumber = inputInteger.nextInt();

            System.out.println("Enter a number: ");
            secondNumber = inputInteger.nextInt();

            sum = firstNumber + secondNumber;
            product = firstNumber * secondNumber;
            difference = firstNumber - secondNumber;
            quotient = firstNumber / secondNumber;

            System.out.printf("%d%n", sum);
            System.out.printf("%d%n", product);
            System.out.printf("%d%n", difference);
            System.out.printf("%d%n", quotient);
        }
}


