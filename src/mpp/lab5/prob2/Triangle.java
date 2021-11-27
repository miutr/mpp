package mpp.lab5.prob2;

public final class Triangle implements Figure {
	
	private final Double base;
	private final Double height;
	
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public Double computeArea() {
		return base * height / 2;
	}
	
	public Double getBase() {
		return base;
	}

	public Double getHeight() {
		return height;
	}
}
