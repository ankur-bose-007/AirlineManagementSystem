package model;

import Enums.AccountStatus;

public abstract class Account {
    public String id;
    public String name;
    public String password;
    public String email;
    public String phone;
    public AccountStatus accountStatus;
    public Passport passport;

    public Account(String id, String name, String password, String email, String phone, AccountStatus accountStatus, Passport passport) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.accountStatus = accountStatus;
        this.passport = passport;
    }
}
