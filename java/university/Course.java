package university;

public class Course {
	private String name;
	private int id;
	private float hours;
	private Lecturer lecturer;

	public Course(String name, int id, float hours) {
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public float getHours() { return hours; }
	public void setHours(float hours) { this.hours = hours; }

	public Lecturer getLecturer() { return lecturer; }
	public void setLecturer(Lecturer lecturer) { this.lecturer = lecturer; }
}
