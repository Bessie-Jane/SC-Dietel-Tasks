package chapter2PracticeQuestions;

import java.util.Scanner;

public class LargerNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstInteger;
        int secondInteger;

        System.out.print("Enter first number: ");
        firstInteger = input.nextInt();

        System.out.print("Enter second number: ");
        secondInteger = input.nextInt();

        if (firstInteger > secondInteger)
            System.out.println(firstInteger + " is larger");

        if (secondInteger > firstInteger)
            System.out.println(secondInteger + " is larger");

        if (secondInteger == firstInteger)
            System.out.println("Numbers are equal");


    }
}
