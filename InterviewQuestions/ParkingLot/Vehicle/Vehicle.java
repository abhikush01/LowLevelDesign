package InterviewQuestions.ParkingLot.Vehicle;

public class Vehicle {
	private String numberPlate;
	private VehicleType type;
	
	Vehicle(String numberPlate,VehicleType type){
		this.numberPlate = numberPlate;
		this.type = type;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public VehicleType getType() {
		return type;
	}
	
}

