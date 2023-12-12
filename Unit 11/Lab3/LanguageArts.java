package Lab3;
public class LanguageArts extends School {
	public int chaptersRead = 0;
	public LanguageArts (String schoolName) {
		super (schoolName);
	}
	public String classwork() {
		chaptersRead++;
		return "Chapter read";
	}
}
