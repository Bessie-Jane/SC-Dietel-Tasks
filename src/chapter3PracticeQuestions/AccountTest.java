package chapter3PracticeQuestions;


import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf(" The name of the account is %n%s%n", myAccount.getName());

        System.out.print("Please enter new name: ");
        String theName = input.nextLine();

        myAccount.setName(theName);
        System.out.printf("But at this point the name is %n%s%n" , myAccount.getName());









    }


















    }




