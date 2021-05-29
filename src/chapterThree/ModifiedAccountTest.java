package chapter3PracticeQuestions;

import java.util.Scanner;

public class ModifiedAccountTest {

    public static void main(String[] args) {

        ModifiedAccount account1 = new ModifiedAccount("Bessie's Account", 70.0);
        ModifiedAccount account2 = new ModifiedAccount("Anthony's Account", 100.0);

        System.out.printf("%s balance : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n%n", account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        System.out.printf("adding %.2f to account balance %n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(),account2.getBalance());

        System.out.println("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();

        System.out.printf("adding %.2f to account balance %n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(),account2.getBalance());

        System.out.println("Enter Withdrawal amount for account1:");
        int withdrawalAmount = input.nextInt();

        System.out.printf("withdrawing %d from %n%n", withdrawalAmount, account1.getName());
        account1.withdraw(withdrawalAmount);

        System.out.printf("%s balance is: $%.2f%n%n", account1.getName(),account1.getBalance());

        System.out.println("Enter Withdrawal amount for account2:");
        withdrawalAmount = input.nextInt();

        System.out.printf("withdrawing %d from %n%n", withdrawalAmount, account2.getName());
        account2.withdraw(withdrawalAmount);

        System.out.printf("%s balance is: $%.2f", account2.getName(),account2.getBalance());
        }
    }

