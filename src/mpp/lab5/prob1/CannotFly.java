package mpp.lab5.prob1;

public class CannotFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("\t cannot fly");	
	}

}
