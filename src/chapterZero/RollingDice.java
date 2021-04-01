package chapterZero;

import java.security.SecureRandom;

public class RollingDice {

    public static void main(String[] args) {

        SecureRandom input = new SecureRandom();
        int[] arrays = new int[6];

        int dieCounter = 0;
        while( dieCounter <= 6000){
            int randomNumber = 1 + input.nextInt(6);
            arrays [randomNumber -1]++;
            dieCounter++;
        }

        int dieHead = 0;
        while (dieHead < arrays.length){
            System.out.printf("%3d%8d%n", dieHead + 1, arrays[dieHead]);
            dieHead++;
        }
    }
}
