package com.ruthwik;

import com.ruthwik.parkinglot.ParkingLot;
import com.ruthwik.parkinglot.Ticket;
import com.ruthwik.parkinglot.Vehicle;
import com.ruthwik.parkinglot.vehicle.Car;

public class Main {

	public static void main(String[] args) {
		
		//Parking Lot is created
		ParkingLot parkingLot = ParkingLot.getinstance();
		
		// add floor to the parking lot
		parkingLot.addParkingFloor(100);
		
		//create a vehicle
		Vehicle car1 = new Car();
		
		//check if the parking is available
		Boolean isAvailable = parkingLot.isParkingAvailable(car1);
		
		Ticket ticket = null;
		
		//park the vehicle if parking is available
		if(isAvailable)
			ticket = parkingLot.parkVehicle(car1);
		else
			System.out.println("Parking not available");
		
		//pay the amount for parking
		Boolean paidStatus = parkingLot.payAmount(ticket);
		
		//exit the parking lot
		if(paidStatus)
			parkingLot.leave(car1);
		else
			System.out.println("Please pay the parking amount");
	}

}
