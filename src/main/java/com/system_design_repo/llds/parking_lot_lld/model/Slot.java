package com.system_design_repo.llds.parking_lot_lld.model;


import com.system_design_repo.llds.parking_lot_lld.enumType.SlotType;

public class Slot {

    private int slotId;
    private SlotType type;
    private boolean isBooked;
    private Vehicle vehicle;

    public Slot(int slotId, SlotType type) {
        this.slotId = slotId;
        this.type = type;
        this.isBooked = false;
        this.vehicle = null;
    }

    public boolean isAvailable() {
        return !isBooked;
    }

    public void book(Vehicle vehicle) {
        if (isAvailable()) {
            this.isBooked = true;
            this.vehicle = vehicle;
        } else {
            throw new IllegalStateException("Slot is already booked.");
        }
    }

    public void unbook() {
        if (!isAvailable()) {
            this.isBooked = false;
            this.vehicle = null;
        } else {
            throw new IllegalStateException("Slot is already empty.");
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public SlotType getType() {
        return type;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public int getSlotId() {
        return slotId;
    }
}
