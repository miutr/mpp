import java.util.ArrayList;

public class Main {


	public static void main(String[] args) 
	{ 
		ArrayList<Apartment> apartments = new ArrayList<Apartment>();
		Apartment a1= new Apartment();
		a1.setRent(1000);
		Apartment a2= new Apartment();
		a2.setRent(950);
		Apartment a3= new Apartment();
		a3.setRent(1300);
		
		apartments.add(a1);
		apartments.add(a2);
		apartments.add(a3);
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		Building b1=new Building();
		b1.setMaintenanceCost(125);
		b1.setApartments(apartments);
		buildings.add(b1);
		
		LandLord l1=new LandLord();
		l1.setBuildings(buildings);
		
		
		System.out.println(l1.calculateProfit());
	}
}
