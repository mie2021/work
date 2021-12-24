package ch4_1;

public class Student extends Person{
	private String studentId,className;
	private double score;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student(String id,String name,String sex,String studentId,String className,double score) {
		super(id,name,sex);
		this.studentId = studentId;
		this.className = className;
		this.score = score;
	}
	public Student() {
		super();
	}
	public void startCourse(String courseName) {
		System.out.println("ио"+courseName);
	}
	public void text(String courseName) {
		System.out.println("ио"+courseName);
	}
}
