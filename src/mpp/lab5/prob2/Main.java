package mpp.lab5.prob2;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Figure> figures = Arrays.asList(new Rectangle(20.0, 10.0), new Triangle(5.0, 7.0), new Circle(12.0));
		Double sum = 0.0;
		for(Figure figure : figures) {
			sum += figure.computeArea();
		}
		System.out.println("Sum of Areas = " + sum);
	}
}
