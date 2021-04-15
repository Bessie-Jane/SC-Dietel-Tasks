package chapter2PracticeQuestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATMTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userPin = 0;
        int pin = 0;
        double amountToDeposit;
        double amountToWithDraw;
        double amountToTransfer;

        ATM myAtm = new ATM(" Chibuzo E.", 00.00, userPin);

        System.out.println("Welcome Chibuzo E.,");
        System.out.println();

        System.out.println("Create new pin: ");
        userPin = scan.nextInt();

        System.out.println("Pin creation successful.");
        System.out.println("");

        System.out.println("Please confirm your pin: ");
        pin = scan.nextInt();



        int counter = 1;
        while (counter <= 3) {
            if (pin != userPin) {
                System.out.println("Wrong Pin!, Try Again");
                pin = scan.nextInt();
                counter++;
                boolean userHasExceededMaximumTry = counter == 3 && pin != userPin;
                if (userHasExceededMaximumTry) {
                    System.out.println("You have exceeded your number of trials.");
                    System.exit(1);
                }
            } else {
                System.out.print("Please select a transaction");
                break;
            }
        }

        String Prompt = """
                                
                -> 1: Deposit
                -> 2: Withdraw
                -> 3: Transfer
                -> 4: Check Balance
                -> 5: Exit
                              
                """;

        String prompt = """
                     Thank you for banking with us 
                     -> press 1 to perform another Transaction
                     -> press 5 to exit
                     
                     """;

        System.out.print(Prompt);

        int userInput = 0;
        while (userInput != 5) {
            System.out.println(" Select a number from 1 - 5 ");
            userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    amountToDeposit = scan.nextDouble();
                    myAtm.setDeposit(amountToDeposit, pin);
                    System.out.println("Your balance is " + myAtm.getBalance());
                    System.out.println(prompt);
                    break;

                    case 2:
                    System.out.println("Enter amount to withdraw: ");
                    amountToWithDraw = scan.nextDouble();
                    myAtm.setWithdraw(amountToWithDraw, pin);
                    System.out.println( "Your balance is " + myAtm.getWithdraw());
                    System.out.println("Withdraw Successful");
                        System.out.println(prompt);
                    break;

                case 3:
                    System.out.println("Enter amount to transfer: ");
                    amountToTransfer = scan.nextDouble();
                    myAtm.setTransfer(amountToTransfer, pin);
                    System.out.println( "Your balance is " + myAtm.getTransfer());
                    System.out.println("Transfer Successful");
                    System.out.println(prompt);
                    break;

                case 4:
                    System.out.println("Your account balance is " + myAtm.getBalance());
                    System.out.println(prompt);
                    break;

                case 5:
                    System.out.println("Thank you, Have a nice day!");

                    default:
                        if(userInput == 5){

                        } else {
                            System.out.println("Invalid Selection");
                        }


            }

            //switchCount++;

        }

    }
}