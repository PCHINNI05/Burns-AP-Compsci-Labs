package Lab3;
public class APCOMSCI extends CTE {
	public static final double creditsEarned = 5.0;
	public APCOMSCI (String schoolName) {
		super(schoolName);
	}
	
	public String toString() {
		String response = "AP Computer Science:\n"
						+ "CTE Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Projects Completed: " + super.projectsMade;
		return response;
	}
}
