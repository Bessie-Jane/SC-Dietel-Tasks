package chapter5PracticeQuestions;

public class PythagoreanTriple {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 1;

        System.out.println("Side A\t\t" + "Side B\t" + "\tHypotenuse");
        for (i = 1; i <= 500; i++) {
            for (j = 1; j <= 500; j++) {
                for (k = 1; k <= 500; k++) {
                    if((i*i) + (j*j)== (k*k)) { System.out.println(i + "\t\t\t" + j + "\t\t\t" + k +"\t\t\t");}
                }
            }
        }
    }
}

