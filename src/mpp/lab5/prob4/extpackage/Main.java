package mpp.lab5.prob4.extpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import mpp.lab5.prob4.Order;
import mpp.lab5.prob4.CustOrderFactory;
import mpp.lab5.prob4.CustomerAndOrders;

public class Main {
	public static void main(String[] args) {
		
		List<Order> orders = new ArrayList<Order>();
		Order order = Order.newOrder(LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");
		orders.add(order);
		order = Order.newOrder(LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");
		orders.add(order);
		CustomerAndOrders custAndOrders = CustOrderFactory.createCustomerAndOrder("Bob", orders);
	
		System.out.println(custAndOrders.getCustomer().getOrders());
	}
}

		
