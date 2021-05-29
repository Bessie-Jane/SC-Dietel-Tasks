package chapterThree;
import java.security.SecureRandom;
import java.util.Scanner;

public class RandomQuestions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom varyingNumber = new SecureRandom();


        int correctAnswerCollector = 0;
        int wrongAnswerCollector = 0;


        int varyingNumberLoopCounter = 1;

        while(varyingNumberLoopCounter <= 10) {

            int firstNumber = 1 + varyingNumber.nextInt(10);
            int secondNumber = 1 + varyingNumber.nextInt(10);

            int randomQuestion = 1 + varyingNumber.nextInt(4);


            int firstOperation = firstNumber + secondNumber;
            int secondOperation = firstNumber - secondNumber;
            int thirdOperation = firstNumber * secondNumber;
            int fourthOperation = firstNumber / secondNumber;

            switch (randomQuestion) {
                case 1:
                    if (randomQuestion == 1) {
                        System.out.println(firstNumber + "+" + secondNumber);
                        System.out.println("Answer: ");
                        int answerFromUser = input.nextInt();
                        if (answerFromUser == firstOperation) {
                            System.out.println("That's Correct");
                            correctAnswerCollector++;
                        } else {
                            System.out.println("That's Wrong");
                            wrongAnswerCollector++;
                        }
                    }
                    break;
                case 2:
                    if (randomQuestion == 2) {
                        System.out.println(firstNumber + "-" + secondNumber);
                        System.out.println("Answer: ");
                        int answerFromUser = input.nextInt();
                        if (answerFromUser == secondOperation) {
                            System.out.println("That's Correct");
                            correctAnswerCollector++;
                        } else {
                            System.out.println("That's Wrong");
                            wrongAnswerCollector++;
                        }
                    }
                    break;
                case 3:
                    if (randomQuestion == 3) {
                        System.out.println(firstNumber + "*" + secondNumber);
                        System.out.println("Answer: ");
                        int answerFromUser = input.nextInt();
                        if (answerFromUser == thirdOperation) {
                            System.out.println("That's Correct");
                            correctAnswerCollector++;
                        } else {
                            System.out.println("That's Wrong");
                            wrongAnswerCollector++;
                        }
                    }
                    break;
                case 4:
                    if (randomQuestion == 4) {
                        System.out.println(firstNumber + "/" + secondNumber);
                        System.out.println("Answer: ");
                        int answerFromUser = input.nextInt();
                        if (answerFromUser == fourthOperation) {
                            System.out.println("That's Correct");
                            correctAnswerCollector++;
                        } else {
                            System.out.println("That's Wrong");
                            wrongAnswerCollector++;
                        }
                    }
            }
            varyingNumberLoopCounter++;
        }


        System.out.println("You had " + correctAnswerCollector + " right and " + wrongAnswerCollector + " wrong.");












    }
}
