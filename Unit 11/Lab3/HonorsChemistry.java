package Lab3;
public class HonorsChemistry extends Sciences {
	public static final double creditsEarned = 4.5;
	public int level;
	public HonorsChemistry (String schoolName, int level) {
		super(schoolName);
		
		this.level = level;
	}
	
	public String toString() {
		String response = "Honors Chemistry " + level + ":\n"
						+ "Science Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Labs Completed: " + super.labsCompleted;
		return response;
	}
}
