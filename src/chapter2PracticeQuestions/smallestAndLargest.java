package chapter2PracticeQuestions;

import java.util.Scanner;

public class smallestAndLargest {

    public static void main(String[] args) {

        Scanner userInteger = new Scanner(System.in);

        int sum;
        int product;
        int average;
        int smallest = 0;
        int largest = 0;

        int integerOne;
        int integerTwo;
        int integerThree;

        System.out.print("Enter a number: ");
        integerOne = userInteger.nextInt();

        System.out.print("Enter a second one: ");
        integerTwo = userInteger.nextInt();

        System.out.print("Enter a third number: ");
        integerThree = userInteger.nextInt();

        sum = integerOne + integerTwo + integerThree;
        product = integerOne * integerTwo * integerThree;
        average = (integerOne + integerTwo + integerThree)/3;

         if(integerOne > integerTwo){
             largest = integerOne;
         }

         if(integerOne > integerThree) {
             largest = integerOne;
         }

         if (integerTwo > integerOne) {
             largest = integerTwo;
         }

        if (integerTwo > integerThree) {
            largest = integerTwo;
        }

        if (integerThree > integerOne) {
            largest = integerThree;
        }

         if ( integerThree > integerTwo) {
             largest = integerThree;
         }



        if (integerOne < integerTwo) {
            smallest = integerOne;
        }

        if(integerOne < integerThree) {
            smallest = integerOne;
        }

        if (integerTwo < integerOne) {
            smallest = integerTwo;
        }

        if (integerTwo < integerThree) {
            smallest = integerTwo;
        }

        if (integerThree < integerOne ) {
            smallest = integerThree;
        }

        if (integerThree < integerTwo) {
            smallest = integerThree;
        }

        System.out.printf("%d%n", sum);
        System.out.printf("%d%n", product);
        System.out.printf("%d%n", average);
        System.out.printf("Largest is %d%n" , largest);
        System.out.printf("Smallest is %d%n ", smallest);
    }

}
