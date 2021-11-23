package mpp.prob2b;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date orderDate;
	private List<OrderLine> orderLine;
	
	Order(Date orderDate) {
		this.orderDate = orderDate;
		this.orderLine = new ArrayList<OrderLine>();
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<OrderLine> getOrderLine() {
		return orderLine;
	}
	public void setGradeReport(List<OrderLine> orderLine) {
		this.orderLine = orderLine;
	}
}
