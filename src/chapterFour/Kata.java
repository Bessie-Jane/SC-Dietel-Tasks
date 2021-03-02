package chapterFour;

public class Kata {
    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber){
      double  average = ( firstNumber + secondNumber + thirdNumber)/3.0;
        return average;
    }
    public String studentGrade(int firstValue) {
        if (firstValue <= 0 && firstValue <= 100){
            return "invalid score";
            }
            if (firstValue >= 90) {
                return "Grade A";
            }
            else if (firstValue >= 80) {
                return "Grade B";
            }
            else if (firstValue >= 70) {
                return "Grade C";
            }
            else
                return "Fail";


    }
    public boolean isEven(int number){
        if ( number % 2 == 0 ) {
            return true;
        }
        else{
                return false;

            }
        }

        public boolean isPrimeNumber(int primeNumber){
           int number;
           number = 2;
           if (primeNumber == 1) {
               return false;
           }
            while(number < primeNumber ){
                if(primeNumber % number == 0){
                    return false;
                }
                number++;
            }
            return true;
        }

}


