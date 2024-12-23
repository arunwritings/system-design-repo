package com.system_design_repo.llds.parking_lot_lld;



import com.system_design_repo.llds.parking_lot_lld.enumType.SlotType;
import com.system_design_repo.llds.parking_lot_lld.model.Floor;
import com.system_design_repo.llds.parking_lot_lld.model.Slot;
import com.system_design_repo.llds.parking_lot_lld.model.Ticket;
import com.system_design_repo.llds.parking_lot_lld.model.Vehicle;
import com.system_design_repo.llds.parking_lot_lld.service.ParkingLotService;
import com.system_design_repo.llds.parking_lot_lld.service.PricingService;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotLldApplication {

	public static void main(String[] args) {

		List<Floor> floors = new ArrayList<>();
		for (int i = 1; i <= 2; i++) {
			floors.add(new Floor(i, 5));
		}
		ParkingLotService parkingLotService = new ParkingLotService(floors);
		PricingService pricingService = new PricingService();

		Vehicle vehicle1 = new Vehicle("22 BH 1234");
		Ticket ticket1 = parkingLotService.parkVehicle(vehicle1, SlotType.STANDARD);
		System.out.println("Vehicle " + vehicle1.getRegistrationNumber() + " parked in Slot: " + ticket1.getSlot().getType());

		// Check if the parking lot is full
		System.out.println("Is Parking Lot Full? " + parkingLotService.isParkingLotFull());

		// Unparking a vehicle
		parkingLotService.unparkVehicle(ticket1);
		System.out.println("Vehicle " + vehicle1.getRegistrationNumber() + " unparked.");

		// Checking free slots of particular type
		List<Slot> freeStandardSlots = parkingLotService.getFreeSlots(SlotType.STANDARD);
		System.out.println("Free STANDARD Slots: " + freeStandardSlots.size());

		// Pricing strategy
		System.out.println("Pricing for STANDARD slot: $" + pricingService.getPricing(SlotType.STANDARD));

	}

}
