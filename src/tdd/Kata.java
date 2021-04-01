package tdd;

public class Kata {
    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        return average;
    }

    public String studentGrade(int firstValue) {
        if (firstValue <= 0 && firstValue <= 100) {
            return "invalid score";
        }
        if (firstValue >= 90) {
            return "Grade A";
        } else if (firstValue >= 80) {
            return "Grade B";
        } else if (firstValue >= 70) {
            return "Grade C";
        } else
            return "Fail";


    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }

    public boolean isPrimeNumber(int primeNumber) {
        int number;
        number = 2;
        if (primeNumber == 1) {
            return false;
        }
        while (number < primeNumber) {
            if (primeNumber % number == 0) {
                return false;
            }
            number++;
        }
        return true;
    }


    public int priceCalculator(double price) {

        int numberOfCopies = 0;
        int priceOfBooks = 0;
        int amountOfBooks = 1;
    return 0;
    }


    public int calculatePriceFor(int testDrillerQuantity) {
        int unitPrice = 0;

        if (testDrillerQuantity >= 1 && testDrillerQuantity <= 4) {
            unitPrice = 1500;
        }
        if(testDrillerQuantity >= 5 && testDrillerQuantity <= 10){
            unitPrice = 1400;
        }
        if(testDrillerQuantity >= 11 && testDrillerQuantity <= 29){
            unitPrice = 1200;
        }
        if(testDrillerQuantity >= 30 && testDrillerQuantity <= 49){
            unitPrice = 1100;
        }
        if(testDrillerQuantity >= 50 && testDrillerQuantity <= 99){
            unitPrice = 1000;
        }
        if(testDrillerQuantity >= 100 && testDrillerQuantity <= 199){
            unitPrice = 900;
        }
        if(testDrillerQuantity >= 200 ){
            unitPrice = 800;
        }
        return unitPrice * testDrillerQuantity;
    }
}



