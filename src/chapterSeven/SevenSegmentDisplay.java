package chapterSeven;

public class SevenSegmentDisplay {

    private int[][] sevenSegmentDisplay = new int[5][4];

    public void display() throws InterruptedException {
//        for (int row = 0; row < sevenSegmentDisplay.length; row++) {
//
//            for (int column = 0; column < sevenSegmentDisplay[row].length; column++) {
//                if (sevenSegmentDisplay[row][column] == 1){
//                    System.out.print("# ");
//                } else{
//                    System.out.print("  ");
//                    Thread.sleep(1000);
//                }
//            }
//            System.out.println();
//        }

        for (int[] i: sevenSegmentDisplay){
            for (int j : i) {
               if(j == 1)
                   System.out.print("- ");
               else
                   System.out.print("  ");
                    Thread.sleep(1000);
            }
            System.out.println();
        }
    }

    public void writeOnA(){
        for (int row = 0; row < sevenSegmentDisplay[0].length; row++){
            sevenSegmentDisplay[0][row] = 1;
        }
//        sevenSegmentDisplay[0][0] = 1;
//        sevenSegmentDisplay[0][1] = 1;
//        sevenSegmentDisplay[0][2] = 1;
//        sevenSegmentDisplay[0][3] = 1;
    }

    public void writeOnB(){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < sevenSegmentDisplay[i].length; j++){
                sevenSegmentDisplay[i][3] = 1;
            }
        }
//        sevenSegmentDisplay[0][3] = 1;
//        sevenSegmentDisplay[1][3] = 1;
//        sevenSegmentDisplay[2][3] = 1;
    }

    public void writeOnC(){
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j < sevenSegmentDisplay[i].length; j++){
                sevenSegmentDisplay[i][3] = 1;
            }
        }
//        sevenSegmentDisplay[2][3] = 1;
//        sevenSegmentDisplay[3][3] = 1;
//        sevenSegmentDisplay[4][3] = 1;
    }

    public void writeOnD(){
        for (int row = 0; row < sevenSegmentDisplay[4].length; row++){
            sevenSegmentDisplay[4][row] = 1;
        }
//        sevenSegmentDisplay[4][0] = 1;
//        sevenSegmentDisplay[4][1] = 1;
//        sevenSegmentDisplay[4][2] = 1;
//        sevenSegmentDisplay[4][3] = 1;
    }

    public void writeOnE(){
        for (int i = 2; i <= 4; i++) {
            for (int j = 0; j < sevenSegmentDisplay[i].length; j++){
                sevenSegmentDisplay[i][0] = 1;
            }
        }
//        sevenSegmentDisplay[2][0] = 1;
//        sevenSegmentDisplay[3][0] = 1;
//        sevenSegmentDisplay[4][0] = 1;
    }

    public void writeOnF(){
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < sevenSegmentDisplay[i].length; j++){
                sevenSegmentDisplay[i][0] = 1;
            }
        }
//        sevenSegmentDisplay[0][0] = 1;
//        sevenSegmentDisplay[1][0] = 1;
//        sevenSegmentDisplay[2][0] = 1;
    }

    public void writeOnG(){
        for (int row = 0; row < sevenSegmentDisplay[2].length; row++){
            sevenSegmentDisplay[2][row] = 1;
        }
//        sevenSegmentDisplay[2][0] = 1;
//        sevenSegmentDisplay[2][1] = 1;
//        sevenSegmentDisplay[2][2] = 1;
//        sevenSegmentDisplay[2][3] = 1;
    }


    public void displayInput(String inputFromUser) throws ExceededDigitsException, WrongInputException {
        for (int i = 0; i < inputFromUser.length(); i++) {
            while (inputFromUser.length() < 8) {
                inputFromUser = "0" + inputFromUser;
            }
        }

        canOnlyInputZerosAndOnesAndCanNotBeMoreThanEight("111111");

//        for (int i = 0; i < inputFromUser.length(); i++) {
//            if (inputFromUser.charAt(i) != '0' && inputFromUser.charAt(i) != '1') {
//                throw new WrongInputException();
//            }
//            if (inputFromUser.length() > 8) {
//                throw new ExceededDigitsException();
//            }
//        }


        for (int i = 0; i < inputFromUser.length(); i++) {
            if(inputFromUser.charAt(i) == '1'){
                switch (i){
                    case 0: writeOnA();
                        break;
                    case 1: writeOnB();
                        break;
                    case 2: writeOnC();
                        break;
                    case 3: writeOnD();
                        break;
                    case 4: writeOnE();
                        break;
                    case 5: writeOnF();
                        break;
                    case 6: writeOnG();
                        break;
                    default:
                        break;
                }
            }

        }
    }


    public void canOnlyInputZerosAndOnesAndCanNotBeMoreThanEight(String inputFromUser) throws WrongInputException, ExceededDigitsException {
        for (int i = 0; i < inputFromUser.length(); i++) {
            if (inputFromUser.charAt(i) != '0' && inputFromUser.charAt(i) != '1') {
                throw new WrongInputException();
            }
            if (inputFromUser.length() > 8) {
                throw new ExceededDigitsException();
            }
        }
    }
}





