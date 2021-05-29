package chapter4PracticeQuestions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int userInput;
        int largest;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        largest = input.nextInt();

        int counter = 2;
        while(counter <= 10 ){
            System.out.print("Enter a number: ");
            userInput = input.nextInt();
            if (userInput > largest){
                largest = userInput;
             }
             counter++;
        }
        System.out.println(largest + " is the largest number");
    }

}
