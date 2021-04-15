package chapter2PracticeQuestions;

public class ATM {


    private int pin;
    private double balance;
    private String name;
    private double deposit;

    public ATM(String name, double balance, int pin) {
        this.name = name;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }
    public void setPin(int userPin) {
        this.pin = userPin;
    }


    public double getDeposit() {
        return balance;
    }
    public void setDeposit(double deposit, int pin) {
        if(deposit > balance){
            balance = balance + deposit;
            System.out.println("Your account has been credited.");
        }
    }



    public double getWithdraw() {
        return balance;
    }
    public void setWithdraw(double withdraw, int pin){

        if (withdraw > balance) {
            System.out.print("Insufficient funds");
        } else if (withdraw < balance)
            balance = balance - withdraw;
    }


    public double getTransfer() {
        return balance;
    }
    public void setTransfer(double transfer, int pin) {

        if (transfer > balance) {
            System.out.print("Insufficient funds");
        } else if (transfer < balance)
            balance = balance - transfer;
    }


    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance, int pin) {
        balance = balance + deposit;
        this.balance = balance;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }








}




