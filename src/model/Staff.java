package model;

import Enums.AccountStatus;

import java.util.ArrayList;
import java.util.List;

public class Staff extends Account{
    private List<Aircraft> aircrafts;
    private List<Flight> flights;

    public Staff(String id, String name, String password, String email, String phone, AccountStatus accountStatus, Passport passport) {
        super(id, name, password, email, phone, accountStatus, passport);
        this.aircrafts = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft){
        aircrafts.add(aircraft);
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }
}
