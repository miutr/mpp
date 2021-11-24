package mpp.lab3.prob1;

public class PersonWithJob {

	private Person person;
	private double salary;

	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
// if a persons name equals to this name we can return true
		// or we can return true if argument object is instanceof PersonWithJob 
		//and the arguments' name and salary equals to this objects' name and salary
		if(aPerson instanceof Person) {
			Person p = (Person) aPerson;
			boolean isEqual = this.person.getName().equals(p.getName());
			return isEqual;
		}
		else if(aPerson instanceof PersonWithJob){
			PersonWithJob p = (PersonWithJob) aPerson;

			boolean isEqual = this.person.getName().equals(p.person.getName()) &&
					this.getSalary()==p.getSalary();
			return isEqual;

		}
			return false;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
