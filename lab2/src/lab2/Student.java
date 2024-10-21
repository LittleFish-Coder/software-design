package lab2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private List<Enrollment> enrollments = new ArrayList<>();

	public void enroll(Course course) {
		Enrollment enrollment = new Enrollment(this, course);
		enrollments.add(enrollment);
		course.add(enrollment);
	}
	
}
