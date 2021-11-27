package mpp.lab5.prob2;

public final class Rectangle implements Figure {
	
	private final Double width;
	private final Double length;
	
	public Rectangle(Double width, Double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public Double computeArea() {
		return width * length;
	}
	
	public Double getWidth() {
		return width;
	}

	public Double getLength() {
		return length;
	}
}
