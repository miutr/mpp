package mpp.lab4.probC;

public class Hourly extends Employee {
	private double hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
		super.setEmpId(empId);
		this.setHourlyWage(hourlyWage);
		this.setHoursPerWeek(hoursPerWeek);
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		return 4 * hourlyWage * hoursPerWeek;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
}
