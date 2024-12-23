package com.system_design_repo.llds.parking_lot_lld.model;



import com.system_design_repo.llds.parking_lot_lld.enumType.SlotType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Floor {

    private int floorId;
    private List<Slot> slots;

    public Floor(int floorId, int numberOfSlotsPerType) {
        this.floorId = floorId;
        this.slots = new ArrayList<>();
        int slotId = 1;

        // Adding slots to the floor
        for (int i = 0; i < numberOfSlotsPerType; i++) {
            slots.add(new Slot(slotId++, SlotType.COMPACT));
            slots.add(new Slot(slotId++, SlotType.STANDARD));
            slots.add(new Slot(slotId++, SlotType.LARGE));
        }
    }

    public List<Slot> getAvailableSlots(SlotType type) {
        return slots.stream()
                .filter(slot -> slot.isAvailable() && slot.getType() == type)
                .collect(Collectors.toList());
    }

    public boolean isFull() {
        return slots.stream().allMatch(Slot::isBooked);
    }

    public List<Slot> getAllSlots() {
        return slots;
    }

}
