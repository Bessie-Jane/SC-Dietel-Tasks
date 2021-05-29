package chapter2PracticeQuestions;

import java.util.Scanner;

public class SmallestAndLargest2{

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;

        System.out.print("Please enter a number: ");
        firstNumber = userInput.nextInt();

        System.out.print("Please enter another one: ");
        secondNumber = userInput.nextInt();

        System.out.print("And another one.... : ");
        thirdNumber = userInput.nextInt();

        System.out.print("Another one, enter another one: ");
        fourthNumber = userInput.nextInt();

        System.out.print("Please enter another one: ");
        fifthNumber = userInput.nextInt();

        int smallest = firstNumber;
        int largest = firstNumber;


        //first condition
//        if(firstNumber > largest){
//            largest = firstNumber;
//            System.out.println("After first condition --> "+largest);
//        }
//        else if(firstNumber < smallest){
//
//            smallest = firstNumber;
//            System.out.println("After first condition --> "+largest);
//        }

        //second condition

        if(secondNumber > largest){
            largest = secondNumber;
            System.out.println("After first condition --> "+largest);
        }
        else if(secondNumber < smallest){

            smallest = secondNumber;
            System.out.println("After first condition --> "+largest);
        }

        //third condition

        if(thirdNumber > largest){
            largest = thirdNumber;
            System.out.println("After first condition --> "+largest);
        }

        else if(thirdNumber < smallest){

            smallest = thirdNumber;
            System.out.println("After first condition --> "+largest);
        }


        //fourth condition
        if(fourthNumber > largest){
            largest = fourthNumber;
            System.out.println("After first condition --> "+largest);
        }
        else if(fourthNumber < smallest){

            smallest = fourthNumber;
            System.out.println("After first condition --> "+largest);
        }

        //fifth condition
        if(fifthNumber > largest){
            largest = fifthNumber;
            System.out.println("After first condition --> "+largest);
        }
        else if(fifthNumber < smallest){

            smallest = fifthNumber;
            System.out.println("After first condition --> "+largest);
        }

        System.out.printf("Largest is %d%n" , largest);

        System.out.printf("Smallest is %d%n" , smallest);

    }
}


