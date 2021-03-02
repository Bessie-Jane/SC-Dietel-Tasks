package chapterFour;

public class christmasCarolForLoop {

    public static void main(String[] args) {

        for(int counter = 1 ; counter <= 12 ; counter ++){

            System.out.print("On the ");

                switch(counter){

                    case 1 -> System.out.println("first");
                    case 2 -> System.out.println("second");
                    case 3 -> System.out.println("third");
                    case 4 -> System.out.println("fourth");
                    case 5 -> System.out.println("fifth");
                    case 6 -> System.out.println("sixth");
                    case 7 -> System.out.println("seventh");
                    case 8 -> System.out.println("eighth");
                    case 9 -> System.out.println("ninth");
                    case 10 -> System.out.println("tenth");
                    case 11 -> System.out.println("eleventh");
                    case 12 -> System.out.println("twelfth");

                }

                System.out.println("day of Christmas my true love sent to me");

                switch(counter){
                    case 12:
                        System.out.println("Twelve Lords are leaping");
                    case 11:
                        System.out.println("Eleven Ladies dancing");
                    case 10:
                        System.out.println("Ten pipers piping");
                    case 9:
                        System.out.println("Nine ladies dancing");
                    case 8:
                        System.out.println("Eight maids are milking");
                    case 7:
                        System.out.println("Seven swans are a swimming");
                    case 6:
                        System.out.println("Six geese are a laying");
                    case 5:
                        System.out.println("Five golden rings");
                    case 4:
                        System.out.println("Four colly birds");
                    case 3:
                        System.out.println("Three french hens");
                    case 2:
                        System.out.println("Two turtle doves");

                    default:
                        System.out.println("And a Partridge in a pear tree!! \n ");
                        
            }

        }

    }

}
