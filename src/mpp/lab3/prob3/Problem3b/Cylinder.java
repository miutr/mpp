package mpp.lab3.prob3.Problem3b;

public class Cylinder {

	private double height;
	private double radius;
	private Circle circle;

	public Cylinder(double radius,double height) {
		this.radius=radius;
		this.height=height;
		circle=new Circle(this.radius);
	}

	public double computeVolume() {

		return height*circle.computeArea();

	}
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
