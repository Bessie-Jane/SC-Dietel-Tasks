package chapter2PracticeQuestions;

import java.util.Scanner;

public class RadiusOfACircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double diameter;
        double circumference;
        double area;
        int radius;

        System.out.print("Input radius: ");
        radius = input.nextInt();

        System.out.printf("Diameter is %d%n", 2 * radius);
        System.out.printf("Circumference is %2f%n", 2 * Math.PI* radius);
        System.out.printf("Area is %2f%n", Math.PI *  radius *  radius);

    }
}
