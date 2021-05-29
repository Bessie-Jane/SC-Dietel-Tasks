package chapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Straight Time: 40 Hrs a week
        //Time and Half: Anything more than straight time
        //Salary of time and half: 40 plus Half of Straight time

        String firstEmployee;
        String secondEmployee;
        String thirdEmployee;

        double straightTimePay = 400.00;
        double timeAndHalfPay = 200.00;

        int numberOfHours = 0;
        double excessTime = numberOfHours - 40;
        double grossPay = straightTimePay + ( excessTime + timeAndHalfPay);;



        System.out.println();
        System.out.println("Enter name of first Employee: ");
        firstEmployee = input.next();

        System.out.println("Enter number of hours worked: ");
        numberOfHours = input.nextInt();

        if(numberOfHours < 40) {
            System.out.println("Enter a number from 40 and above ");
        }
        if (numberOfHours == 40){
            System.out.println("Your salary is: " + straightTimePay);
        }
        else if (numberOfHours > 40){
            System.out.println("Gross pay of first employee is: " + grossPay);
        }
        System.out.println();


        System.out.println("Enter name of second Employee: ");
        secondEmployee = input.next();

        System.out.println("Enter number of hours worked: ");
        numberOfHours = input.nextInt();

        if(numberOfHours < 40) {
            System.out.println("Enter a number from 40 and above ");
        }
        if (numberOfHours == 40){
            System.out.println("Your salary is: " + straightTimePay);
        }
        else if (numberOfHours > 40){
            System.out.println("Gross pay of second employee is: " + grossPay);
        }
        System.out.println();


        System.out.println("Enter name of third Employee: ");
        thirdEmployee = input.next();

        System.out.println("Enter number of hours worked: ");
        numberOfHours = input.nextInt();

        if(numberOfHours < 40) {
            System.out.println("Enter a number from 40 and above ");
        }
        if (numberOfHours == 40){
            System.out.println("Your salary is: " + straightTimePay);
        }
        else if (numberOfHours > 40){
            System.out.println("Gross pay of third employee is: " + grossPay);
        }

    }
}
