package mpp.lab4.probC;

public abstract class Employee {
	private String empId;
	
	public abstract double calcGrossPay(int month, int year);
	
	public void print(int month, int year) {
		System.out.println("Employee Id: " + empId);
		calcCompensation(month, year);
	}
	
	public PayCheck calcCompensation (int month, int year) {
		PayCheck payCheck = new PayCheck(calcGrossPay(month, year));
		payCheck.print();
		return payCheck;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
}
