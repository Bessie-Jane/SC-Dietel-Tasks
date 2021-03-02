package chapterFour;

import java.util.Scanner;

public class CustomerSupportSwitch {
    public static void main(String[] args) {

        String promptMessage = """
                ->Press 1 for Igbo.
                ->Press 2 for Hausa.
                ->Press 3 for Yoruba.
                ->Press 4 for English.
                """;

        System.out.print(promptMessage);
        Scanner userInputCollector = new Scanner(System.in);

        int userInput = userInputCollector.nextInt();

        switch(userInput){
            case 1:
                System.out.println("Igbo Kweenu!!!");
                break;
            case 2:
                System.out.println("Aboki Kweenu!!!");
                break;
                case 3:
                    System.out.println("Omo-Onile Kweenu!!!");
                    break;
            case 4:
                    System.out.println("Hello Pink People!!!");
                    break;
            default:
                System.out.println("Get lost!!!");

        }

    }
}
