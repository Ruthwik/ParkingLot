package com.ruthwik.parkinglot.space;

import com.ruthwik.parkinglot.ParkingSpace;

public class ParkingSpaceFactory {
	
	public ParkingSpace addParkingSpace(ParkingSpaceType type) {
		if(type.equals(ParkingSpaceType.MOTOR_BIKE_SPACE))
			return new MotorBikeParkingSpace();
		if(type.equals(ParkingSpaceType.CAR_SPACE))
			return new CarParkingSpace();
		if(type.equals(ParkingSpaceType.BUS_SPACE))
			return new BusParkingSpace();
		if(type.equals(ParkingSpaceType.TRUCK_SPACE))
			return new TruckParkingSpace();
		
		return null;
		
	}
}
