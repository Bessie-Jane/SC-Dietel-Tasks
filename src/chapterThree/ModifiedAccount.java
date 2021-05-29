package chapter3PracticeQuestions;

public class ModifiedAccount {

    private String name;
    private double balance;

    public ModifiedAccount(String name, double balance){
        this.name = name;
        if(balance > 0.0)
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void deposit(double amountToDeposit){
        if(amountToDeposit > 0)
        balance = balance + amountToDeposit;
    }

    public void withdraw(double amountToWithdraw){
        if(amountToWithdraw > 0 && amountToWithdraw < balance) {
            balance = balance - amountToWithdraw;
        }
        if(amountToWithdraw > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}
