package Lab1;
public class Nurse extends Employee {
	public static int patientsRemaining = 0;
	public static int totalVaccinesAdministered = 0;
	private int vaccinesAdministered = 0;
	
	public Nurse (String name) {
		super (name, "Nurse");
	}
	public String administerVaccine () {
		String response;
		if (patientsRemaining == 0) {
			response = "No patients waiting for a vaccine";
		}
		else if (Janitor.roomsCleaned == 0) {
			response = "No clean rooms";
		}
		else {
		totalVaccinesAdministered++;
		vaccinesAdministered++;
		patientsRemaining--;
		String suffix;
		int num = vaccinesAdministered;
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
		
		response = super.getName() + " has administered their " + vaccinesAdministered + suffix + " vaccine\n";
		response += "The Hospital now has completed " + totalVaccinesAdministered + " total checkups";
		}
		
		return response;
	}
	public String toString() {
		String response = super.getName() + ":\n";
		response += vaccinesAdministered + " vaccines administered";
		
		return response;
	}
}
