import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Airline;

import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {
    Airline virginAtlantic;

    @BeforeEach
    void startAllWithThis(){
        virginAtlantic = new Airline();
    }

    @AfterEach
    void tearDown(){
        virginAtlantic = null;
    }

    @Test
    void airlineReservationService_canBeCreated(){
        assertNotNull(virginAtlantic);
    }

    @Test
    void airline_canHaveFlight(){
        virginAtlantic.setAvailableFlight(1);
        assertEquals(1, virginAtlantic.getAvailableFlight());
    }

    @Test
    void airline_canHaveSeats(){
        virginAtlantic.assignToEconomyClass();
        assertEquals(9, virginAtlantic.getAvailableNumberOfSeats());
    }
    @Test
    void airlineCanAssignToFirstClass(){
        virginAtlantic.assignToFirstClass();
        assertEquals(1, virginAtlantic.totalOccupiedSeats());
    }

    @Test
    void airlineCanAssignToFirstClassMultipleTwice(){
        virginAtlantic.assignToFirstClass();
        assertEquals(1, virginAtlantic.totalOccupiedSeats());

        virginAtlantic.assignToFirstClass();
        assertEquals(2, virginAtlantic.totalOccupiedSeats());

        virginAtlantic.assignToFirstClass();
        assertEquals(3, virginAtlantic.totalOccupiedSeats());
    }

    @Test
    void airlineCanAssignToEconomyClass(){
        virginAtlantic.assignToEconomyClass();
        virginAtlantic.assignToFirstClass();
        assertEquals(2, virginAtlantic.totalOccupiedSeats());
    }

    @Test
    void airlineCanAssignToEconomyClassMultipleTimes(){
        virginAtlantic.assignToEconomyClass();
        assertEquals(1, virginAtlantic.totalOccupiedSeats());

        virginAtlantic.assignToEconomyClass();
        assertEquals(2, virginAtlantic.totalOccupiedSeats());

        virginAtlantic.assignToEconomyClass();
        assertEquals(3, virginAtlantic.totalOccupiedSeats());

        virginAtlantic.assignToEconomyClass();
        assertEquals(4, virginAtlantic.totalOccupiedSeats());
    }

    @Test
    void user_canSelectClass(){
        int firstClass = 1;
        int economyClass = 2;
        virginAtlantic.selectClass(firstClass);
        assertEquals(1, virginAtlantic.occupiedSeatsInFirstClass());
        assertEquals(1, virginAtlantic.totalOccupiedSeats());
        virginAtlantic.selectClass(economyClass);
        assertEquals(1, virginAtlantic.occupiedSeatsInEconomyClass());
        assertEquals(2, virginAtlantic.totalOccupiedSeats());
    }


}
