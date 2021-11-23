package mpp.prob2a;

public class GradeReport {
	private Student student;
	private String grade;

	public GradeReport(Student student) {
		this.student = student;
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
