package Lab3;
public class CTE extends School {
	public int projectsMade = 0;
	public CTE (String schoolName) {
		super(schoolName);
	}
	public String classwork() {
		projectsMade++;
		return "Project finished";
	}
}
