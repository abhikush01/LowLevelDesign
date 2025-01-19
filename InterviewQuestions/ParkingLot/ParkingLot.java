package InterviewQuestions.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import InterviewQuestions.ParkingLot.Vehicle.Vehicle;

public class ParkingLot {
	
	private static ParkingLot parkingLot;
	private List<ParkingLevel> levels; 
	
	private ParkingLot() {
		levels = new ArrayList<>();
	}
	
	public synchronized static ParkingLot getInstance() {
		if(parkingLot == null) {
			parkingLot = new ParkingLot();
		}
		return parkingLot;
	}
	
	public void addLevel(ParkingLevel level) {
		levels.add(level);
	}
	
	public synchronized boolean parkVehicle(Vehicle vehicle) {
		for(ParkingLevel level : levels) {
			if(level.parkVehicle(vehicle)) {
				return true;
			}
		}
		return false;
	}
	
	public synchronized boolean unParkVehicle(Vehicle vehicle) {
		for(ParkingLevel level : levels) {
			if(level.unParkVehicle(vehicle)) {
				return true;
			}
		}
		return false;
	}
	
	public void displayAvailability() {
		for(ParkingLevel level : levels) {
			level.displayAvailability();
		}
	}
}
