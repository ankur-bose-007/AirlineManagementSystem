package model;

public class Aircraft {
    private String name;
    private String model;
    private int seats;
    private String manufacturingYear;

    public Aircraft(String name, String model, int seats, String manufacturingYear) {
        this.name = name;
        this.model = model;
        this.seats = seats;
        this.manufacturingYear = manufacturingYear;
    }

    public String getFlightName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
