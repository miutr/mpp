package mpp.lab3.prob1;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	// if a persons name equals to this name we can return true
			// or we can return true if argument object is instanceof PersonWithJob 
			//and the arguments' name equals to this objects' name
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		
		if(aPerson instanceof Person) {
			Person p = (Person) aPerson;
			boolean isEqual = this.name.equals(p.getName());
			return isEqual;
		}
		else if(aPerson instanceof PersonWithJob){
			PersonWithJob p = (PersonWithJob) aPerson;

			boolean isEqual = this.name.equals(p.getPerson().getName());
			return isEqual;

		}
		return false;
	}
}
