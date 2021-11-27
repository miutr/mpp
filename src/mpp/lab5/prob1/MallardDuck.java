package mpp.lab5.prob1;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		super.setFlyBehavior(new FlyWithWings());
		super.setQuackBehavior(new Quack());
	}
}
