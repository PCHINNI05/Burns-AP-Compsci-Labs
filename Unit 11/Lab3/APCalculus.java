package Lab3;
public class APCalculus extends Maths {
	public static final double creditsEarned = 5.0;
	public APCalculus (String schoolName) {
		super(schoolName);
	}
	
	public String toString() {
		String response = "AP Calculus:\n"
						+ "Math Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Worksheets Completed: " + super.worksheetsCompleted;
		return response;
	}
}
