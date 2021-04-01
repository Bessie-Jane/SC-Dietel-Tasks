package tdd;

public class Airline {
 boolean [] seatsOccupied = new boolean[10];
    private int availableFlight = 0;
    private int availableSeats = 0;
    private int totalNumberOfOccupiedSeats = 0;
    private int totalNumberOfOccupiedEconomySeats;
    private int totalNumberOfOccupiedFirstClassSeats;


    public int getAvailableFlight() {
        return availableFlight;
    }

    public void setAvailableFlight(int availableFlight) {
        this.availableFlight = availableFlight;
    }

    public int getAvailableNumberOfSeats() {
       int availableSeats = seatsOccupied.length - totalNumberOfOccupiedSeats;
        return availableSeats;
    }

    public void assignToFirstClass() {
        for (int i = 0; i < seatsOccupied.length - 5; i++) {
            if (!seatsOccupied[i]) {
                seatsOccupied[i] = true;
                totalNumberOfOccupiedFirstClassSeats++;
                break;
            }
        }
    }

    public void assignToEconomyClass() {
        for (int i = 5; i < seatsOccupied.length ; i++) {
            if (!seatsOccupied[i]){
                seatsOccupied[i] = true;
                totalNumberOfOccupiedEconomySeats++;
                break;
            }
        }
    }

    public int totalOccupiedSeats(){
        return totalNumberOfOccupiedEconomySeats + totalNumberOfOccupiedFirstClassSeats;
    }

    public void selectClass(int classSelection) {
        switch (classSelection) {
            case 1 -> assignToFirstClass();
            case 2 -> assignToEconomyClass();
            default -> System.out.println("Invalid selection");
        }
    }

    public int occupiedSeatsInFirstClass() {
        return totalNumberOfOccupiedFirstClassSeats;
    }

    public int occupiedSeatsInEconomyClass() {
        return totalNumberOfOccupiedEconomySeats;
    }
}
