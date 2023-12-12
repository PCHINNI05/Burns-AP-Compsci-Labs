package Lab3;
public class APBiology extends Sciences {
	public static final double creditsEarned = 5.0;
	public APBiology (String schoolName) {
		super(schoolName);
	}
	
	public String toString() {
		String response = "AP Biology:\n"
						+ "Science Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Labs Completed: " + super.labsCompleted;
		return response;
	}
}
