package chapterZero;

import java.util.Scanner;

public class StudentScoreAverage {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int total = 0;
        int score;

            int totalNumberOfValues = 0;

            while ( totalNumberOfValues < 3) {
                System.out.print(" Enter a number: ");
                score = userInput.nextInt();
                total = total +score;
                totalNumberOfValues++;
            }

             double average = total/(totalNumberOfValues * 1.0);
             System.out.print(average);



         }


    }

