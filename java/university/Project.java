package university;
import java.util.Date;
import java.util.Vector;
import java.util.List;

public class Project {
	private String _name;
	private Date _start;
	private Date _end;
	private List<Participation> _participations = new Vector<>();

	public Project(String aName, Date aStart, Date aEnd) {
		this._name = aName;
		this._start = aStart;
		this._end = aEnd;
	}

	public void addParticipation(Participation p) {
		_participations.add(p);
	}

	public String getName() { return _name; }
}
