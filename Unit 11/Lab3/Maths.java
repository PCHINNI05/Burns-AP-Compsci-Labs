package Lab3;
public class Maths extends School {
	public int worksheetsCompleted = 0;
	public Maths (String schoolName) {
		super (schoolName);
	}
	public String classwork() {
		worksheetsCompleted++;
		return "Worksheet completed";
	}
}
