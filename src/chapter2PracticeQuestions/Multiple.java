package chapter2PracticeQuestions;

import java.util.Scanner;

public class Multiple {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         int num1 = 0;
         int num2 = 0;

         System.out.print("Type in a number: ");
         num1 = input.nextInt();

         System.out.print("Please type in another one: ");
         num2 = input.nextInt();

         if (num1 % num2 == 0) {
             System.out.printf("%d%n is a multiple of %d%n", num1, num2);
         }


           else  if (num1 % num2 != 0) {
                     System.out.printf("%d%n is not a multiple of %d%n", num1, num2);
                 }



     }

}

