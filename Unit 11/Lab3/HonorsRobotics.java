package Lab3;
public class HonorsRobotics extends CTE {
	public static final double creditsEarned = 4.5;
	public int level;
	public HonorsRobotics (String schoolName, int level) {
		super(schoolName);
		
		this.level = level;
	}
	
	public String toString() {
		String response = "Honors Robotics " + level + ":\n"
						+ "CTE Department\n"
						+ "Credits Earned: " + creditsEarned + "\n"
						+ "Projects Completed: " + super.projectsMade;
		return response;
	}
}
