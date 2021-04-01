package chapter3PracticeQuestions;

public class ModifiedAccountTest {

    public static void main(String[] args) {

        ModifiedAccount myModifiedAccountTest = new ModifiedAccount("Bessie's Account", 0.0);

        double initialBalance =  myModifiedAccountTest.getBalance();
        System.out.println("Initial account balance is: " + initialBalance);

        String accountName = myModifiedAccountTest.getName();
        System.out.println("Initial account name is: " + accountName);


        
        }

    }

