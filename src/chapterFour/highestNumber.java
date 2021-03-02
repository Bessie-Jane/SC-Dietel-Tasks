package chapterFour;

import java.util.Scanner;

public class highestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1;
        int userInput = 0;
        int max = 0;

        while (number <= 4) {

            System.out.print("Enter a number: ");
            userInput = input.nextInt();

            if (userInput > max) {
                max = userInput;
            }

            number++;
        }

        System.out.print("Largest is " + max );





//        else if (max < userInput){
//            max = smallest;
//            System.out.print("Smallest is" + smallest);
//        }

    }
}
