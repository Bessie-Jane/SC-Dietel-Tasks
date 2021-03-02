package chapterFour;

public class KataTest {
    public static void main(String[] args) {
        Kata Kata = new Kata();
        System.out.println("The average is "+ Kata.calculateAverage(76, 55, 45));

        System.out.println("Is the number even? " + Kata.isEven(8) + " " + Kata.studentGrade(88));

        System.out.print("Is the number prime? "+ Kata.isPrimeNumber(8));
    }



}

