package mpp.lab5.prob3;

public class VehicleFactory {
	public Vehicle getVehicle(String v) {
		switch (v.toLowerCase()) {
		case "bus": 
			return new Bus();
		case "truck":
			return new Truck();
		case "car":
			return new Car();
		case "electriccar":
		case "electric car":
			return new ElectricCar();
		default:
			throw new IllegalArgumentException("Unexpected value: " + v.toLowerCase());
		}
	}
}
