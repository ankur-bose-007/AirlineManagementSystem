package model;

import Enums.ClassType;
import Enums.SeatCategory;

public class Seat {
    public int seatNumber;
    public ClassType type;
    public SeatCategory seatCategory;

    public Seat(int seatNumber, ClassType type, SeatCategory seatCategory) {
        this.seatNumber = seatNumber;
        this.type = type;
        this.seatCategory = seatCategory;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public ClassType getClassType() {
        return type;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }
}
