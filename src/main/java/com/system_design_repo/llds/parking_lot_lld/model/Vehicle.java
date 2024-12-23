package com.system_design_repo.llds.parking_lot_lld.model;

public class Vehicle {

    private String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
