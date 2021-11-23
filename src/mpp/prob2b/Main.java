package mpp.prob2b;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(new Date());
		OrderLine orderLine1 = new OrderLine(order);
		orderLine1.setLineNum(1);
		orderLine1.setPrice(1.1f);
		orderLine1.setQuantity(123);
		OrderLine orderLine2 = new OrderLine(order);
		orderLine2.setLineNum(2);
		orderLine2.setPrice(2.1f);
		orderLine2.setQuantity(12);
		order.getOrderLine().add(orderLine1);
		order.getOrderLine().add(orderLine2);
		
		for(OrderLine orderLine : order.getOrderLine())
			System.out.println(orderLine.getLineNum());
	}

}
