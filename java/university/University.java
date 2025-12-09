package university;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String name;
	private int numberOfEmployees;
	private List<Faculty> faculties;

	public University(String name) {
		this.name = name;
		this.numberOfEmployees = 0;
		this.faculties = new ArrayList<>();
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public int getNumberOfEmployees() { return numberOfEmployees; }
	public void setNumberOfEmployees(int numberOfEmployees) { this.numberOfEmployees = numberOfEmployees; }

	public List<Faculty> getFaculties() { return faculties; }

	public void addFaculty(Faculty faculty) {
		if (!faculties.contains(faculty)) {
			faculties.add(faculty);
		}
	}
}
