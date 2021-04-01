package chapterZero;

public class PrintingMultidimensionalArrays {

    public static void main(String[] args) {

        int numbers[][] = {{1, 2,},{4, 5, 6}, {1, 7, 8, 9}, {1, 3, 5, 7, 9, 11, 13, 15}};

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
                System.out.print(numbers[i][j]);
                System.out.println();
            }
        }
    }
