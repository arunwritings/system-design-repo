package com.system_design_repo.llds.parking_lot_lld.service;

import com.system_design_repo.llds.parking_lot_lld.enumType.SlotType;
import com.system_design_repo.llds.parking_lot_lld.model.Floor;
import com.system_design_repo.llds.parking_lot_lld.model.Slot;
import com.system_design_repo.llds.parking_lot_lld.model.Ticket;
import com.system_design_repo.llds.parking_lot_lld.model.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingLotService {

    private List<Floor> floors;

    public ParkingLotService(List<Floor> floors) {
        this.floors = floors;
    }

    public Ticket parkVehicle(Vehicle vehicle, SlotType slotType) {
        for (Floor floor : floors) {
            List<Slot> availableSlots = floor.getAvailableSlots(slotType);
            if (!availableSlots.isEmpty()) {
                Slot slot = availableSlots.get(0);
                slot.book(vehicle);
                return new Ticket(vehicle.getRegistrationNumber(), slot);
            }
        }
        throw new IllegalStateException("No available slots of this type.");
    }

    public void unparkVehicle(Ticket ticket) {
        Slot slot = ticket.getSlot();
        slot.unbook();
    }

    public boolean isParkingLotFull() {
        return floors.stream().allMatch(Floor::isFull);
    }

    public List<Slot> getFreeSlots(SlotType type) {
        return floors.stream()
                .flatMap(floor -> floor.getAvailableSlots(type).stream())
                .collect(Collectors.toList());
    }

}
