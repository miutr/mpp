package mpp.lab5.prob1;

public class RubberDuck extends Duck {
	public RubberDuck() {
		super.setFlyBehavior(new CannotFly());
		super.setQuackBehavior(new Quack());
	}
}
