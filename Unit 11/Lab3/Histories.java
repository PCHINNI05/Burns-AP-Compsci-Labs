package Lab3;
public class Histories extends School {
	public int manifestosMemorized = 0;
	public Histories (String schoolName) {
		super(schoolName);
	}
	public String classwork() {
		manifestosMemorized++;
		return "New manifesto memorized";
	}
}