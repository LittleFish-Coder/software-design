package lab2;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private List<Enrollment> enrollments = new ArrayList<>();

	public void add(Enrollment enrollment) {
		enrollments.add(enrollment);
	}
	
}
