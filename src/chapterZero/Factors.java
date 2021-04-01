package chapterZero;

public class Factors {

   public static void main(String[] args) {

//        Scanner collector = new Scanner(System.in);
//
//        System.out.println("Enter any number: ");
//        int inputFromUser = collector.nextInt();
//
//        int loopCounter = 1;
//
//        while (loopCounter <= inputFromUser) {
//
//            if (inputFromUser % loopCounter  == 0) {
//
//                System.out.print(loopCounter+ " ");
//            }
//            loopCounter++;
//        }
      int[] arrays = new int[0];

      arrays [0] = 1;
      arrays [1] = 2;
      arrays [2] = 3;
      arrays [3] = 4;
      arrays [4] = 5;

      int counter = 0;
      while (counter < arrays.length) {
           System.out.print(arrays[counter] + " ");
          counter++;
       }
    }

}


