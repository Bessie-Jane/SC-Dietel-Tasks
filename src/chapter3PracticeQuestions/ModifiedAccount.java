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

    public void setDeposit(int amountToDeposit){
        if (amountToDeposit > 0){
            balance = balance + amountToDeposit;
        }
    }

    public void setWithdraw(int amountToWithdraw){
        if (amountToWithdraw > 0){
            balance = balance - amountToWithdraw;
        }
    }

    public double getBalance(){
        return balance;
    }


}
