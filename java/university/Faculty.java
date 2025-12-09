package university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
	private String name;
	private Employee dean;
	private List<Institute> institutes;

	public Faculty(String name) {
		this.name = name;
		this.institutes = new ArrayList<>();
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Employee getDean() { return dean; }
	public void setDean(Employee dean) { this.dean = dean; }

	public List<Institute> getInstitutes() { return institutes; }

	public void addInstitute(Institute institute) {
		if (!institutes.contains(institute)) {
			institutes.add(institute);
		}
	}
}
