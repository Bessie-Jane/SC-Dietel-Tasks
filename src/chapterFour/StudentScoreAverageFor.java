package chapterFour;

import java.util.Scanner;

public class StudentScoreAverageFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double sumOfValues;
        double number;
        double totalNumberOfValues= 0;


        for(sumOfValues = 0; sumOfValues < 10; sumOfValues++ ){

            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number >= 1 && number <= 100) {

                totalNumberOfValues = totalNumberOfValues + number;

            }

            double average = totalNumberOfValues / (sumOfValues) * 1.0;

            System.out.print("the total average is" + average);



        }


    }



}
