package mpp.lab3.prob3.Problem3b;

public class Circle {
	private double radius;
	final double pi=3.14;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double computeArea() {
		return Math.pow(radius, 2)*pi;
	}
}
