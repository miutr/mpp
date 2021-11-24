
public class Cylinder extends Circle{

	private double height;
	private double radius;


	public Cylinder(double radius,double height) {
		super(radius);
		this.radius=radius;
		this.height=height;
	}

	public double computeVolume() {

		return (this.height)*computeArea();

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
