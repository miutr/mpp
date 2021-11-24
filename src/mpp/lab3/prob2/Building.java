import java.util.ArrayList;

public class Building {

	private ArrayList<Apartment> apartments = new ArrayList<Apartment>();
	private double maintenanceCost;
	public Building() {

	}

	public double calculateProfit() {
		double sumOfRent=0;		
		for(Apartment apartment : apartments) {
			sumOfRent+=apartment.getRent();
		}
		return sumOfRent-maintenanceCost;
	}

	public ArrayList<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(ArrayList<Apartment> apartments) {
		this.apartments = apartments;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}







}
