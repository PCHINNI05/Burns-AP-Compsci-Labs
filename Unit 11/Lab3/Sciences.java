package Lab3;
public class Sciences extends School {
	public int labsCompleted = 0;
	public Sciences (String schoolName) {
		super(schoolName);
	}
	public String classwork() {
		labsCompleted++;
		return "Lab completed";
	}
}
