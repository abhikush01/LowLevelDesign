package InterviewQuestions.ParkingLot;

import InterviewQuestions.ParkingLot.Vehicle.*;

public class ParkingLotDemo {

	public static void main(String[] args) {
		ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new ParkingLevel(1, 10));
        parkingLot.addLevel(new ParkingLevel(2, 12));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle bike = new Bike("M1234");
        

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(bike);

        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unParkVehicle(bike);

        // Display updated availability
        parkingLot.displayAvailability();

	}

}
