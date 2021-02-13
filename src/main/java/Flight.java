import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<CabinCrew> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private Pilot pilot;


    public Flight(Pilot pilot, ArrayList<CabinCrew>cabinCrewMembers, ArrayList<Passenger> passengers,Plane plane, String departureTime, String departureAirport, String destination, String flightNumber){
        this.pilot = pilot;
        this.plane = plane;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.departureAirport = departureAirport;
        this.cabinCrewMembers = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public int getNumberOfCabinCrew() {
        return this.cabinCrewMembers.size();
    }

    public void addCabinCrewMembers(CabinCrew cabinCrew) {
        this.cabinCrewMembers.add(cabinCrew);
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public String addPassenger(Passenger passenger) {
        if(getPassengers() < plane.getCapacity()){
        this.passengers.add(passenger);
        return "Welcome Aboard";
        } else {
            return "Goodbye Fam";
        }
    }

    public int getNumberOfRemainingSeats() {
        return this.plane.getCapacity() - getPassengers();
    }
}
