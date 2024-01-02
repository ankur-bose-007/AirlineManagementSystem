package model;

import java.util.Date;

public class Reservation {
    private static int idCounter = 0;
    public String reservationNumber;
    public Date creationDate;
    public Flight flight;
    public Seat seat;
    public Airport sourceAirport, destinationAirport;
    public Customer customer;

    public Reservation(Date creationDate, Flight flight, Seat seat, Airport sourceAirport, Airport destinationAirport, Customer customer) {
        idCounter += 1;
        this.reservationNumber = String.valueOf(idCounter);
        this.creationDate = creationDate;
        this.flight = flight;
        this.seat = seat;
        this.sourceAirport = sourceAirport;
        this.destinationAirport = destinationAirport;
        this.customer = customer;
    }

    public String getReservationNumber(){
        return reservationNumber;
    }

    public Seat getSeat(){
        return seat;
    }

    public Flight getFlight(){
        return flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNumber='" + reservationNumber + '\'' +
                ", creationDate=" + creationDate +
                ", flight=" + flight +
                ", seat=" + seat +
                ", sourceAirport=" + sourceAirport +
                ", destinationAirport=" + destinationAirport +
                ", customer=" + customer +
                '}';
    }
}
