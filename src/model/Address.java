package model;

public class Address {
    public String apartments;
    public String area;
    public String city;
    public String state;
    public String country;
    public String landmark;

    public Address(String apartments, String area, String city, String state, String country, String landmark) {
        this.apartments = apartments;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.landmark = landmark;
    }

    public Address(String apartments, String area, String city, String state, String country) {
        this.apartments = apartments;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
