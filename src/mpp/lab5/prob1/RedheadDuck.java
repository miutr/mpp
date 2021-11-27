package mpp.lab5.prob1;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		super.setFlyBehavior(new FlyWithWings());
		super.setQuackBehavior(new Quack());
	}
}
