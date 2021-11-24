package mpp.lab3.prob4;

public class House extends Building {
	private Address address;
	private double lotSize;
	
	public House(double lotSize) {
		super();
		super.setRent(0.1 * lotSize);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}
}
