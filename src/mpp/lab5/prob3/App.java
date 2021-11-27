package mpp.lab5.prob3;

public class App {
	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		factory.getVehicle("car").startEngine();
		factory.getVehicle("Truck").startEngine();
		factory.getVehicle("Bus").startEngine();
		factory.getVehicle("ElectricCar").startEngine();
	}
}
