package ikinciHaftaOdev;

public class Course {
	
	public Course() {
		System.out.println("Running...");
	}
	
	public Course(int id, String name, String instructor, String detail, int percent) {
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.percent = percent;
	}
	int id;
	String courseName;
	String instructor;
	String courseDetail;
	int percent;

}
