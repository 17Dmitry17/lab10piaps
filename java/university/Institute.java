package university;

import java.util.ArrayList;
import java.util.List;

public class Institute {
	private String name;
	private String address;
	private List<ResearchAssociate> researchAssociates;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
		this.researchAssociates = new ArrayList<>();
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	public List<ResearchAssociate> getResearchAssociates() { return researchAssociates; }

	public void addResearchAssociate(ResearchAssociate ra) {
		if (!researchAssociates.contains(ra)) {
			researchAssociates.add(ra);
		}
	}
}
