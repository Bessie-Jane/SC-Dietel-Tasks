package chapter2PracticeQuestions;

import java.util.Scanner;

public class Multiple {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         int firstNumber = 0;
         int secondNumber = 0;

         System.out.print("Type in a number: ");
         firstNumber = input.nextInt();

         System.out.print("Please type in another one: ");
         secondNumber = input.nextInt();

         if (firstNumber % secondNumber == 0) {
             System.out.printf("%d%n is a multiple of %d%n", firstNumber, secondNumber);
         }


           else  if (firstNumber % secondNumber != 0) {
                     System.out.printf("%d%n is not a multiple of %d%n", firstNumber, secondNumber);
                 }



     }

}

