package mpp.lab4.probC;

public class Salaried extends Employee {
	private double salary;
	
	public Salaried(String empId, double salary) {
		super.setEmpId(empId);
		this.setSalary(salary);
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
