package model;

public class Passport {
    public String passportNumber;
    public String dob;
    public String expiryDate;
    public Address address;

    public Passport(String passportNumber, String dob, String expiryDate, Address address) {
        this.passportNumber = passportNumber;
        this.dob = dob;
        this.expiryDate = expiryDate;
        this.address = address;
    }
}
