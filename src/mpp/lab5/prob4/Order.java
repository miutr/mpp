package mpp.lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	//use a factory method
	private Order(LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
	}
	public static Order newOrder(LocalDate date) {
		Order ord = new Order(date);
		return ord;
	}
	public void addItem(String name){
		items.add(new Item(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
