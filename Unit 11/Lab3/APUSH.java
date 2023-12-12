package Lab3;
public class APUSH extends Histories {
	public static final double creditsEarned = 5.0;
	public APUSH (String schoolName) {
		super(schoolName);
	}
	
	public String toString() {
		String response = "AP US History:\n"
						+ "History Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Manifestos Memorized: " + super.manifestosMemorized;
		return response;
	}
}
