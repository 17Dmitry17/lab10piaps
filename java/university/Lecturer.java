package university;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociate {
	private List<Course> courses;

	public Lecturer(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email, fieldOfStudy);
		this.courses = new ArrayList<>();
	}

	public List<Course> getCourses() { return courses; }

	public void addCourse(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
			course.setLecturer(this);
		}
	}
}
