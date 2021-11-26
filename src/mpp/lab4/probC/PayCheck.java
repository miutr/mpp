package mpp.lab4.probC;

public final class PayCheck {
	private final double grossPay;
	private final double state = 5;
	private final double fica = 23;
	private final double local = 1;
	private final double medicare = 3;
	private final double socialSecurity = 7.5;
	
	public void print() {
		System.out.println("Paystub:");
		System.out.println("\t Gross Pay: " + grossPay);
		System.out.println("\t Fica: " + fica);
		System.out.println("\t State: " + state);
		System.out.println("\t Local: " + local);
		System.out.println("\t Medicare: " + medicare);
		System.out.println("\t Social Security: " + socialSecurity);
		System.out.println("\t NET PAY: " + getNetPay());
	}
	
	public double getNetPay() {
		return grossPay - (grossPay * (fica + state + local + medicare + socialSecurity) / 100);
	}
 	
	public PayCheck(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getGrossPay() {
		return grossPay;
	}
	
	public double getState() {
		return state;
	}

	public double getFica() {
		return fica;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
}
