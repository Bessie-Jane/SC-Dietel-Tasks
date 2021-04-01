package chapterZero;

import java.util.Scanner;

public class FactorsTest {

    public static void main(String[] args) {

        Factors2 newFactor = new Factors2();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = userInput.nextInt();

        newFactor.getFactorsOf(number);

    }
}
