package Lab3;
public class HonorsMath extends Maths {
	public static final double creditsEarned = 4.5;
	private int level;
	public HonorsMath (String schoolName, int level) {
		super(schoolName);
		
		this.level = level;
	}
	
	public String toString() {
		String response = "Honors Math " + level + ":\n"
						+ "Math Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Worksheets Completed: " + super.worksheetsCompleted;
		return response;
	}
}
