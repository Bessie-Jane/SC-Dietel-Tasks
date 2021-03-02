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

        diameter = 2 * radius ;
        circumference = 2 * Math.PI * radius;
        area = Math.PI *  radius *  radius;

        System.out.print("Diameter is");








    }
}
