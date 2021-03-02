package chapterFour;

import java.util.Scanner;

public class StudentScoreAverageDoWhile {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumOfValues = 0;
        double number;
        double totalNumberOfValues= 0;


        do {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number >= 1 && number <= 100) {
                totalNumberOfValues = totalNumberOfValues + number;
                sumOfValues++;
            }
        }

        while( sumOfValues < 10);
        double average = totalNumberOfValues / (sumOfValues) * 1.0;
        System.out.print("the total average is" + average);


    }
}
