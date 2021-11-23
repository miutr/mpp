package mpp.prob2a;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Yigit");
		System.out.println(student1.getName());
		student1.getGradeReport().setGrade("A");
		System.out.println(student1.getGradeReport().getGrade());
	}

}
