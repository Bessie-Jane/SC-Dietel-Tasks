package chapterSeven;

public class SevenSegmentDisplayTest {
    public static void main(String[] args) {

        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();

//     sevenSegmentDisplay.writeOnA();
//     sevenSegmentDisplay.writeOnB();
//     sevenSegmentDisplay.writeOnC();
//     sevenSegmentDisplay.writeOnD();
//     sevenSegmentDisplay.writeOnE();
//     sevenSegmentDisplay.writeOnF();
//     sevenSegmentDisplay.writeOnG();
//     sevenSegmentDisplay.display();



        try {
            sevenSegmentDisplay.displayInput("11111111");
            sevenSegmentDisplay.display();
        }
        catch(InterruptedException e){
            System.out.println("Array could not print");
        }
        catch (WrongInputException e) {
            System.out.println("Please Input only One's and Zeros");
        }
        catch (ExceededDigitsException e) {
            System.out.println("Please Input only eight digits");
        }
    }
}
