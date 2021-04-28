package ikinciHaftaOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id = 1;
		course1.courseName = "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)";
		course1.instructor = "Engin Demirog";
		course1.percent = 100;
		
		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)";
		course2.instructor = "Engin Demirog";
		course2.percent = 36;
		
		Course course3 = new Course();
		course3.id = 3;
		course3.courseName = "Programlamaya Giriş için Temel Kurs";
		course3.instructor = "Engin Demirog";
		course3.percent = 0;
		
		
		Course[] courses = {course1,course2,course3};
		
		CourseManager courseManager = new CourseManager(courses);
		courseManager.Add(course3);
		
		
	}

}
