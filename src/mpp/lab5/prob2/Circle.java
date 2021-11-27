package mpp.lab5.prob2;

public final class Circle implements Figure{
	
	private final Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double computeArea() {
		return Math.PI * radius * radius;
	}
	
	public Double getRadius() {
		return radius;
	}

}
