package chapterZero;

public class Factors2 {

   public String  getFactorsOf(int number) {

     int randomNumberLoopCounter = 1;
        String space = " ";

        while (randomNumberLoopCounter <= number) {
            if (number % randomNumberLoopCounter == 0) {
                System.out.print(randomNumberLoopCounter + space);
           }
           randomNumberLoopCounter++;
       }
       return space;
    }
}

