package Lab3;
public class HonorsAI extends LanguageArts {
	public static final double creditsEarned = 4.5;
	public HonorsAI (String schoolName) {
		super(schoolName);
		
	}
	
	public String toString() {
		String response = "Honors Advanced Inquiry:\n"
						+ "Language Arts Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Chapters Read: " + super.chaptersRead;
		return response;
	}
}
