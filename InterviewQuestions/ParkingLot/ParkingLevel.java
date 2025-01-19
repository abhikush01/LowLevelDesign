package InterviewQuestions.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import InterviewQuestions.ParkingLot.Vehicle.Vehicle;
import InterviewQuestions.ParkingLot.Vehicle.VehicleType;

public class ParkingLevel {
	private int floorNumber;
	private List<ParkingSpot> spots;
	
	ParkingLevel(int floorNumber,int numberOfSpots){
		
		this.floorNumber = floorNumber;
		this.spots = new ArrayList<>();
		
		int numberOfBike = (int)(numberOfSpots * 0.50);
		int numberOfCars = (int)(numberOfSpots * 0.30);
		
		int i = 0;
		
		for(i = 1 ; i < numberOfBike ; i++) {
			spots.add(new ParkingSpot(VehicleType.BIKE,i));
		}
		
		for(; i < numberOfBike + numberOfCars ; i++) {
			spots.add(new ParkingSpot(VehicleType.CAR,i));
		}
		
		for(; i < numberOfSpots ; i++) {
			spots.add(new ParkingSpot(VehicleType.TRUCK,i));
		}	
	}
	
	public synchronized boolean parkVehicle(Vehicle vehicle) {
		for(ParkingSpot spot : spots) {
			if(spot.getType().equals(vehicle.getType()) && spot.isAvailable()) {
				spot.parkVehicle(vehicle);
				System.out.println("Vehicle : " + vehicle.getType() + " With Number Plate : " + vehicle.getNumberPlate() + " Parked at Floor : " + floorNumber + " at Spot Number : " +spot.getSpotNumber());
				return true;
			}
		}
		return false;
	}
	
	public synchronized boolean unParkVehicle(Vehicle vehicle) {
		for(ParkingSpot spot : spots) {
			if(!spot.isAvailable() && spot.getVehicle().getNumberPlate().equals(vehicle.getNumberPlate())) {
				spot.unParkVehicle();
				System.out.println("Vehicle : " + vehicle.getType() + " With Number Plate : " + vehicle.getNumberPlate() +" Exit " + ", Floor : " + floorNumber + " and Spot Number : " + spot.getSpotNumber()+" is Now Free");
				return true;
			}
		}
		return false;
	}
	
	public void displayAvailability() {
		System.out.println("Floor : " + floorNumber + " Availability");
		for(ParkingSpot spot : spots) {
			System.out.println(spot.getSpotNumber() + " :" + (spot.isAvailable() ? " Available for " : " Occupied By ") + spot.getType());
			
		}
	}
}
