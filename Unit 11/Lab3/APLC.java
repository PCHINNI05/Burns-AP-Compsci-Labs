package Lab3;
public class APLC extends LanguageArts {
	public static final double creditsEarned = 5.0;
	public APLC (String schoolName) {
		super(schoolName);
	}
	
	public String toString() {
		String response = "AP Literature and Composition:\n"
						+ "Language Arts Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Chapters Read: " + super.chaptersRead;
		return response;
	}
}
