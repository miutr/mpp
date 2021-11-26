package mpp.lab4.probC;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	private double commission;
	private double baseSalary;
	private List<Order> orders = new ArrayList<>();
	
	public Commissioned(String empId, double comission, double baseSalary, List<Order> orders) {
		super.setEmpId(empId);
		this.setBaseSalary(baseSalary);
		this.setCommission(comission);
		this.setOrders(orders);
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		return orders.stream().filter(order -> order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year)
				.mapToDouble(order -> order.getOrderAmount()).sum() * commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	

}
