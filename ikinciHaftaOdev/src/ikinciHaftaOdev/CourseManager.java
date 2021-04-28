package ikinciHaftaOdev;

public class CourseManager {
		public CourseManager(Course[] courses) {
			for (Course course : courses) {
				System.out.println(course.courseName + "\n" + course.instructor);
				System.out.println("İlerleme Durumu: Yüzde " + course.percent + " tamamlandı.");
			}
		}
		
		public void Add(Course course) {
			System.out.println(course.courseName + " added to your account.");
		
		}
	}

