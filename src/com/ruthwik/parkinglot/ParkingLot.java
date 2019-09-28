/**
 * 
 */
package com.ruthwik.parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruthwik
 *
 */
public class ParkingLot {
	
	List<ParkingFloor> parkingFloorList = new ArrayList<>();
	
	Address address;	
	
	private static ParkingLot instance=null;
	
	private ParkingLot() {}

	public static ParkingLot getinstance() {
		if (null == instance)
			instance = new ParkingLot();

		return instance;
	}
	

     public String addParkingFloor(int spaceNumber) {
    	 
    	ParkingFloor parkingFloor = new ParkingFloor();
    	parkingFloorList.add(parkingFloor);
    	
		return parkingFloor.getFloorId();
    	 
     }
     
     public boolean removeParkingFloor(int floorId) {
		return false;
    	 
     }
     public boolean isParkingAvailable(Vehicle vehicle) {
		return false;
    	 
     }
      
     public Ticket parkVehicle(Vehicle vehicle) {
		return null;
    	 
     }
     
     public boolean payAmount(Ticket ticket) {
		return false;
    	 
     }
     
     public boolean leave(Vehicle vehicle) {
		return false;
     }
	
}
