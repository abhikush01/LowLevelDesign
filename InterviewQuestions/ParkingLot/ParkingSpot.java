package InterviewQuestions.ParkingLot;

import InterviewQuestions.ParkingLot.Vehicle.Vehicle;
import InterviewQuestions.ParkingLot.Vehicle.VehicleType;

public class ParkingSpot {
	
	private Vehicle vehicle;
	private VehicleType type;
	private int spotNumber;
	private boolean isEmpty;
	
	ParkingSpot(VehicleType type, int spotNumber){
		this.type = type;
		this.spotNumber = spotNumber;
		isEmpty = true;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public VehicleType getType() {
		return type;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public synchronized boolean isAvailable() {
		return isEmpty;
	}
	
	public synchronized boolean parkVehicle(Vehicle vehicle) {
		if(isAvailable() && vehicle.getType().equals(type)) {
			this.vehicle = vehicle;
			this.isEmpty = false;
			return true;
		}
		return false;
	}
	
	public synchronized boolean unParkVehicle() {
		if(!isAvailable()) {
			this.vehicle = null;
			this.isEmpty = true;
			return true;
		}
		return false;
	}
		
}
