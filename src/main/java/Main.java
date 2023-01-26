class Main {
    public static void main(String[] args) {

        Flight newFlight = new Flight("London", "New York");
        newFlight.flightInfo();

    }
}

class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public void flightInfo() {
        System.out.println("Flight from " + departure + " to " + arrival);
    }



}
