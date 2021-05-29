package chapterFour;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int milesDriven;
        int gallonsUsed;

        System.out.println("Enter the number of miles driven: ");
        milesDriven = input.nextInt();

        System.out.println("Enter number of gallons used: ");
        gallonsUsed = input.nextInt();

        double milesPerGallon = milesDriven/gallonsUsed;

        int tripCounter = 0;
        double totalMilesPerGallon = 0;

        while(milesDriven > 0 && gallonsUsed > 0) {
            totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;
            tripCounter = tripCounter + 1;

            System.out.println("Enter the number of miles driven: ");
            milesDriven = input.nextInt();

            System.out.println("Enter number of gallons used: ");
            gallonsUsed = input.nextInt();
        }

        if(tripCounter != 0){
            double averageMilesPerGallon = totalMilesPerGallon / tripCounter;
            System.out.println("The total gallons used for " + tripCounter + " trips is " + totalMilesPerGallon);
            System.out.println("Average miles per gallon used for the trip is: " + averageMilesPerGallon);
        }
        }
}
