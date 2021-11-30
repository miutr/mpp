package mpp.lab5.prob4;

import java.util.List;

public class CustOrderFactory {
	private CustOrderFactory() {}
	
	public static CustomerAndOrders createCustomerAndOrder(String name, List<Order> orders) {
		Customer customer = new Customer(name);
		return new CustomerAndOrderImpl(customer, orders);
	}
}
