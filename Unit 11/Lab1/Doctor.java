package Lab1;
public class Doctor extends Employee {
	public static int patientsRemaining = 0;
	public static int totalCheckups = 0;
	private int checkups = 0;
	
	public Doctor (String name) {
		super (name, "Doctor");
	}
	public String checkup () {
		String response;
		if (patientsRemaining == 0) {
			response = "No patients waiting for a checkup";
		}
		else if (Janitor.roomsCleaned == 0) {
			response = "No clean rooms";
		}
		else {
		totalCheckups++;
		checkups++;
		patientsRemaining--;
		String suffix;
		int num = checkups;
		if (num == 11 || num == 12 || num == 13) {
			suffix = "th";
		}
		else {
			int lastNum = num % 10;
			switch (lastNum) {
			case 1:
				suffix = "st";
				break;
			case 2:
				suffix = "nd";
				break;
			case 3:
				suffix = "rd";
				break;
			default:
				suffix = "th";
			}
		}		
		
		response = super.getName() + " has completed their " + checkups + suffix + " checkup\n";
		response += "The Hospital now has completed " + totalCheckups + " total checkups";
		}
		
		return response;
	}
	public String toString() {
		String response = super.getName() + ":\n";
		response += checkups + " checkups completed";
		
		return response;
	}
}