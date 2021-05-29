package chapter2PracticeQuestions;

import java.util.Scanner;

public class SeparationOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;


        System.out.print("Enter a five digit number: ");
        int  userInput = input.nextInt();

        if(userInput >= 10000 && userInput <= 99999) {

            fifthNumber = userInput % 10;
            userInput/=10;
             fourthNumber = userInput % 10;
            userInput /= 10;
             thirdNumber = userInput % 10;
            userInput /= 10;
             secondNumber = userInput % 10;
            userInput /= 10;
        }
        System.out.print( userInput + " " + secondNumber  + " " + thirdNumber + " " + fourthNumber + " " + fifthNumber);


    }
}
