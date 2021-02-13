import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrew> cabinCrewMembers;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;

    @Before
    public void before(){
        cabinCrewMembers = new ArrayList<CabinCrew>();
        cabinCrew1 = new CabinCrew("Rory", RankType.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Amber", RankType.FLIGHTATTENDANT);
        passengers = new ArrayList<Passenger>();
        passenger1 = new Passenger("Angelo", 1);
        passenger2 = new Passenger("Rhiannon", 2);
        passenger3 = new Passenger("BigShaq", 5);
        plane = new Plane(PlaneType.FIGHTERJET);
        flight = new Flight(pilot, cabinCrewMembers, passengers, plane, "10:30", "Rome", "Edinburgh","RMO567");
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("RMO567", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Edinburgh", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Rome", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("10:30", flight.getDepartureTime());
    }

    @Test
    public void flightHasPilot(){
        assertEquals(pilot, flight.getPilot());
    }


    @Test
    public void hasCabinCrew(){
        flight.addCabinCrewMembers(cabinCrew1);
        flight.addCabinCrewMembers(cabinCrew2);
        assertEquals(2, flight.getNumberOfCabinCrew());
    }

    @Test
    public void flightStartsWithNoPassengers(){
        assertEquals(0, flight.getPassengers());
    }

    @Test
    public void hasPassengers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2,flight.getPassengers());
    }

    @Test
    public void cannotAddPassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2,flight.getPassengers());
    }


}

