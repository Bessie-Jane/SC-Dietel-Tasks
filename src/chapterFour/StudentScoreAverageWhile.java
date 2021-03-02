package chapterFour;

import java.util.Scanner;

public class StudentScoreAverageWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sumOfValues = 0;
        double number;
        double totalNumberOfValues= 0;

        
        while(sumOfValues < 10){

            System.out.print("Enter a value: ");
            number = input.nextDouble();

            if (number >= 1 && number <= 100 ){
                totalNumberOfValues = totalNumberOfValues + number;

            }
            sumOfValues++;
        }
            double average = totalNumberOfValues/ (sumOfValues)*1.0;
            System.out.print("The average is total " + average);

    }
}
