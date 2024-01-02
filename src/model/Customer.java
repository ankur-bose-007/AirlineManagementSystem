package model;

import Enums.AccountStatus;

public class Customer extends Account{

    public boolean frequentFlyer;
    public Customer(String id, String name, String password, String email, String phone, AccountStatus accountStatus, Passport passport) {
        super(id, name, password, email, phone, accountStatus, passport);
    }

    public Customer(String id, String name, String password, String email, String phone, AccountStatus accountStatus, Passport passport, boolean frequentFlyer) {
        super(id, name, password, email, phone, accountStatus, passport);
        this.frequentFlyer = frequentFlyer;
    }
}
