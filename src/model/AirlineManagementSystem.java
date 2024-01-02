package model;

import Enums.AccountStatus;
import Enums.ClassType;
import Enums.SeatCategory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Timer;

public class AirlineManagementSystem {

    private final ArrayList<Airport> airports;
    private final ArrayList<Flight> flights;
    private HashMap<String, ArrayList<Flight>> flightsMap;

    public AirlineManagementSystem(ArrayList<Airport> airports, ArrayList<Flight> flights) {
        this.airports = airports;
        this.flights = flights;
        this.flightsMap = new HashMap<>();

        generateFlightsMap();
    }

    // we are populating the flights map in this method
    public void generateFlightsMap(){
        for(Flight flight: flights){
            if(!flightsMap.containsKey(flight.destination))
                flightsMap.put(flight.destination, new ArrayList<>());

            flightsMap.get(flight.destination).add(flight);
        }
;    }

    // customer can search a flight

    public ArrayList<Flight> searchFlight(String destination) throws Exception {
        if(!flightsMap.containsKey(destination))
            throw new Exception("No flights found");

        return flightsMap.get(destination);
    }

    public Reservation bookFlight(Date creationDate, Flight flight, Seat seat, Airport sourceAirport, Airport destinationAirport, Customer customer, int numOfSeats) throws Exception {
        if(flight.getAircraft().getSeats() < numOfSeats)
            throw new Exception("Seats not available");

        int remainingSeats = flight.getAircraft().getSeats() - numOfSeats;

        flight.getAircraft().setSeats(remainingSeats);

        return new Reservation(creationDate, flight, seat, sourceAirport, destinationAirport, customer);
    }

    public static void main(String[] args){
        // address
        Address harshAddress = new Address("apartment", "area", "BLR", "KA", "India");
        Address goaAirportAddress = new Address("apartment", "area", "GOA", "GO", "India");
        Address delhiAirportAddress = new Address("apartment", "area", "DEL", "DE", "India");
        Address staffMemberAddress = new Address("apartment", "area", "GOA", "GOA", "India");

        // passport
        Passport harshPassport = new Passport("1234", "10/10/10", "10/10/29", harshAddress);
        Passport bobPassport = new Passport("1234", "10/10/10", "10/10/29", staffMemberAddress);

        // user
        //    1. Customer
        //    2. Staff
        Customer harsh = new Customer("1", "harsh", "pass", "abc@email.com", "1234", AccountStatus.ACTIVE, harshPassport);
        Customer bob = new Customer("2", "bob", "pass", "abc@email.com", "1234", AccountStatus.ACTIVE, bobPassport);

        // Aircraft
        Aircraft indigo = new Aircraft("indigo", "Boeing", 120, "2023");
        Aircraft airIndia = new Aircraft("air india", "Airbus", 180, "2023");

        // Airport
        Airport goaAirport = new Airport("Rajiv Gandhi", goaAirportAddress, 23);
        Airport delhiAirport = new Airport("Indira Gandhi", goaAirportAddress, 33);

        delhiAirport.addAircraft(indigo);
        goaAirport.addAircraft(airIndia);

        // Flight
        Flight delhiToGoa = new Flight(new Date(), new Date(), new Timer("120"), "goa", "delhi", indigo);
        Flight goaToDelhi = new Flight(new Date(), new Date(), new Timer("120"), "delhi", "goa", airIndia);

        ArrayList<Flight> flightArrayList = new ArrayList<>();
        flightArrayList.add(delhiToGoa);
        flightArrayList.add(goaToDelhi);

        ArrayList<Airport> airportArrayList = new ArrayList<>();
        airportArrayList.add(goaAirport);
        airportArrayList.add(delhiAirport);

        AirlineManagementSystem airlineManagementSystem = new AirlineManagementSystem(airportArrayList, flightArrayList);

        // Search a flight
        try {
            ArrayList<Flight> searchedFlights = airlineManagementSystem.searchFlight("goa");

            System.out.println("Searched flights: " + searchedFlights);
        } catch (Exception e) {
            System.out.println("No flights found");
        }

        try {
            Reservation harshReservation = airlineManagementSystem.bookFlight(new Date(), delhiToGoa, new Seat(5, ClassType.BusinessClass, SeatCategory.ACCESSIBLE), delhiAirport, goaAirport, harsh, 1);
            System.out.println("Flight booked successfully");
            System.out.println(harshReservation);
        } catch (Exception e) {
            System.out.println("No seats available");
        }

    }
}
