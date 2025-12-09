package university;

import java.util.ArrayList;
import java.util.List;

public class ResearchAssociate extends Employee {
	private String fieldOfStudy;
	private List<Institute> institutes;
	private List<Participation> participations;

	public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
		this.institutes = new ArrayList<>();
		this.participations = new ArrayList<>();
	}

	public String getFieldOfStudy() { return fieldOfStudy; }
	public void setFieldOfStudy(String fieldOfStudy) { this.fieldOfStudy = fieldOfStudy; }

	public List<Institute> getInstitutes() { return institutes; }

	public void addInstitute(Institute institute) {
		if (!institutes.contains(institute)) {
			institutes.add(institute);
			institute.addResearchAssociate(this);
		}
	}

	public List<Participation> getParticipations() { return participations; }

	public void addParticipation(Participation participation) {
		if (!participations.contains(participation)) {
			participations.add(participation);
		}
	}
}
