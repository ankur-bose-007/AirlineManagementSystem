package model;

import java.util.Date;
import java.util.Timer;

public class Flight {
    public Date departure, arrival;
    public Timer duration;
    public String source, destination;
    private Aircraft aircraft;

    public Flight(Date departure, Date arrival, Timer duration, String source, String destination, Aircraft aircraft) {
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
        this.source = source;
        this.destination = destination;
        this.aircraft = aircraft;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                ", duration=" + duration +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", aircraft=" + aircraft +
                '}';
    }
}
