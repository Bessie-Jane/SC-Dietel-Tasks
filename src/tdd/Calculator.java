package tdd;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return secondNumber + secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int numerator, int denominator) {
        if (denominator == 0) {
            return 0;
        }
        return numerator/(denominator * 1.0);
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (secondNumber > firstNumber){
            return secondNumber - firstNumber;
        }
        return firstNumber - secondNumber;
    }
}

