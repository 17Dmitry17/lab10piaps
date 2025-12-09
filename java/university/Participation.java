package university;

public class Participation {
	private int hours;
	private ResearchAssociate researchAssociate;
	private Project project;

	public Participation(ResearchAssociate ra, Project project, int hours) {
		this.researchAssociate = ra;
		this.project = project;
		this.hours = hours;

		ra.addParticipation(this);
		project.addParticipation(this);
	}

	public int getHours() { return hours; }
	public void setHours(int hours) { this.hours = hours; }

	public ResearchAssociate getResearchAssociate() { return researchAssociate; }
	public Project getProject() { return project; }
}
