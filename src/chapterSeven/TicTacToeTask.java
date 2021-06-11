package chapterSeven;

public class TicTacToeTask {

    public void displayTicTacToe() {
        char[][] ticTacToe = new char[3][3];

        for (int row = 0; row < ticTacToe.length; row++) {
            System.out.println(" ");

            for (int column = 0; column < ticTacToe[row].length; column++) {
                ticTacToe[0][0] = 'X';
                ticTacToe[0][2] = 'X';
                ticTacToe[1][2] = 'X';
                ticTacToe[2][1] = 'X';

                if (ticTacToe[row][column] != 'X') {
                    ticTacToe[row][column] = 'O';
                }
                System.out.print(ticTacToe[row][column] + " ");
            }
            System.out.println();
        }

    }


   public static void main(String[] args) {

     TicTacToeTask charTask = new TicTacToeTask();
     charTask.displayTicTacToe();

   }
}
