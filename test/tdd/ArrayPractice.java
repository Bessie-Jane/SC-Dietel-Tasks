package tdd;

public class ArrayPractice {

    public int sumOfArrayElements(int[] arrays) {
        int sum = 0;
        int counter = 0;

        while(counter < arrays.length){
            sum = sum + arrays[counter];
            counter++;
        }
        return sum;
    }

    public int averageOfArrayElements(int[] arrays) {
        int average = 0;
        int sum = sumOfArrayElements(arrays);

        average = sum /arrays.length;
        return average;
    }

    public int maximumElementInArray(int[] arrays) {
        int maximumNumber = arrays[0];

        int counter = 0;
        while (counter < arrays.length){
            if(arrays[counter] > maximumNumber){
              maximumNumber = arrays[counter];
            }
            counter++;
        }
        return maximumNumber;
    }

    public int minimumElementInArray(int[] arrays) {
        int minimumNumber = arrays[0];

        int counter = 0;
        while (counter < arrays.length){
            if(arrays[counter] < minimumNumber){
                minimumNumber = arrays[counter];
            }
            counter++;
        }
        return minimumNumber;
    }

    public void highestSumOfElementsInArray(int[] arrays) {




    }
}
