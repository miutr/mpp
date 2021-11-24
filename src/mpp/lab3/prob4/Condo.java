package mpp.lab3.prob4;

public class Condo extends Building{
	private double numFloors;
	
	public Condo(double numFloors) {
		super();
		super.setRent(400 * numFloors);
	}

	public double getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(double numFloors) {
		this.numFloors = numFloors;
	}
}
