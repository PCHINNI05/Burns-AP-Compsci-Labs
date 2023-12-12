package Lab3;
public class HonorsCivics extends Histories {
	public static final double creditsEarned = 4.5;
	public HonorsCivics (String schoolName) {
		super(schoolName);		
	}
	
	public String toString() {
		String response = "Honors Civics:\n"
						+ "History Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Manifestos Memorized: " + super.manifestosMemorized;
		return response;
	}
}
