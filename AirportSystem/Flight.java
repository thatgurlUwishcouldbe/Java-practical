package AirportSystem;

public class Flight implements Comparable<Flight>{

    private String flightCode;
    private String destination;
    private String departureTime;
    int priority;

    public Flight(String code, String destination, String time, int priority) {
        this.flightCode = code;
        this.destination = destination;
        this.departureTime = departureTime;
        this.priority = priority;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return flightCode
                + " -> "
                + destination
                + " at "
                + departureTime;
    }
    
    // PriorityQueue علشان الcompareTo 
    @Override
    public int compareTo(Flight other) {

        return this.priority -
               other.priority;
    }
}
