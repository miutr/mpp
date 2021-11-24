import java.util.ArrayList;

public class LandLord {
	
	private ArrayList<Building> buildings = new ArrayList<Building>();
	
	public LandLord() {
		
	}
	
	public double calculateProfit() {

		double sum=0;
		for(Building building : buildings) {
			sum+=building.calculateProfit();
		}

		return sum;
	}

	public ArrayList<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(ArrayList<Building> buildings) {
		this.buildings = buildings;
	}
	
	
	
}
