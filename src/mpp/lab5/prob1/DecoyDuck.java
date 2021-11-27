package mpp.lab5.prob1;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super.setFlyBehavior(new CannotFly());
		super.setQuackBehavior(new MuteQuack());
	}
}
