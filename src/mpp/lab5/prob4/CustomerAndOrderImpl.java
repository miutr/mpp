package mpp.lab5.prob4;

import java.util.List;

public class CustomerAndOrderImpl implements CustomerAndOrders {
	private Customer customer;
	private List<Order> orders;
	
	public CustomerAndOrderImpl(Customer customer, List<Order> orders) {
		this.customer = customer;
		for(Order order : orders) {
			this.customer.addOrder(order);
		}
		this.orders = orders;
	}
	@Override
	public Customer getCustomer() {
		return this.customer;
	}

	@Override
	public List<Order> getOrders() {
		return this.orders;
	}

}
