package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPracticeTest {

    @Test
    public void getSumOfArray() {
        //given
        ArrayPractice arraySum = new ArrayPractice();

        //when
        int[] arrays = {1, 2, 3, 4, 5, 6};
        int sum = arraySum.sumOfArrayElements(arrays);

        //assert
        assertEquals(21, arraySum.sumOfArrayElements(arrays));
    }

    @Test
    public void getAverageOfArray() {
        //given
        ArrayPractice arrayAverage = new ArrayPractice();

        //when
        int[] arrays = {1, 2, 3, 4, 5, 6, 0};
        double average = arrayAverage.averageOfArrayElements(arrays);

        //assert
        assertEquals(3, average);
    }

    @Test
    public void getMaximumElementInArray() {
        //given
        ArrayPractice maximumElement = new ArrayPractice();

        //when
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int maximum = maximumElement.maximumElementInArray(arrays);

        //assert
        assertEquals(10, maximum);
    }

    @Test
    public void getMinimumElementInArray() {
        //given
        ArrayPractice minimumElement = new ArrayPractice();

        //when
        int[] arrays = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int minimum = minimumElement.minimumElementInArray(arrays);

        //assert
        assertEquals(1, minimumElement.minimumElementInArray(arrays));
    }


    @Test
    public void getSumOfElementInArrayMinusOne() {
        //given
        ArrayPractice sumOfElementsInArray = new ArrayPractice();

        //when
        int[] arrays = {1, 2, 3, 4, 5,};
        sumOfElementsInArray.highestSumOfElementsInArray(arrays);

        //assert

    }

    @Test
    void enhancedForLoopDemo() {
        int counter = 0;
        int sum = 0;

        int[] grades = {2, 4, 2, 5, 6, 3, 4,};
        for (int grade : grades) {
            counter++;
            if (counter % 2 == 0) continue;
            sum += grade;
        }
    }

//    @Test
//    void enhancedForLoopDemo2() {
//
//        int[] grades = {2, 4, 2, 5, 6, 3, 4,};
//        String name = "7865348234";
//        char[] letters = name.toCharArray();
//        int length = name.length();
//        for (int counter = 0; length > counter ; counter++) {
//            System.out.println(letters[length]);
//        }
//    }
//
//    @Test
//    void testPassArrayByValue(){
//        int[] scores = {5,23, 98, 96, 4};
//
//    }

}









