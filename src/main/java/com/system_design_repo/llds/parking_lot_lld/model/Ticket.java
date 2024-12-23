package com.system_design_repo.llds.parking_lot_lld.model;

public class Ticket {

    private String vehicleRegistrationNumber;
    private Slot slot;

    public Ticket(String vehicleRegistrationNumber, Slot slot) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
        this.slot = slot;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public Slot getSlot() {
        return slot;
    }

}
