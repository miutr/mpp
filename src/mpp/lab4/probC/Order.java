package mpp.lab4.probC;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private int orderAmount;
	
	public Order(String orderNo, LocalDate orderDate, int orderAmount) {
		this.setOrderAmount(orderAmount);
		this.setOrderDate(orderDate);
		this.setOrderNo(orderNo);
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
}
