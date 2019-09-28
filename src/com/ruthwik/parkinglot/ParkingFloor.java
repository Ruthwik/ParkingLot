package com.ruthwik.parkinglot;

import java.util.UUID;

public class ParkingFloor {

	String floorId;
	Boolean status;
	
	
	public ParkingFloor() {
		this.floorId = UUID.randomUUID().toString();
	}

	public boolean addParkingSpace() {
		return status;
		
	}
	public String getFloorId() {
		return floorId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	
}
