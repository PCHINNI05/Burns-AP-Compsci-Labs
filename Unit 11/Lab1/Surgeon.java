package Lab1;
public class Surgeon extends Employee {
	public static int patientsRemaining = 0;
	public static int totalSurgeries = 0;
	private int surgeries = 0;
	
	public Surgeon (String name) {
		super (name, "Surgeon");
	}
	public String surgery () {
		String response;
		if (patientsRemaining == 0) {
			response = "No patients waiting for a surgery";
		}
		else if (Janitor.roomsCleaned == 0) {
			response = "No clean rooms";
		}
		else {
			totalSurgeries++;
			surgeries++;
			patientsRemaining--;
			String suffix;
			int num = surgeries;
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
			
			response = super.getName() + " has completed their " + surgeries + suffix + " surgery\n";
			response += "The Hospital now has completed " + totalSurgeries + " total surgeries";
		}
		return response;
	}
	public String toString() {
		String response = super.getName() + ":\n";
		response += surgeries + " surgeries completed";
		
		return response;
	}
}