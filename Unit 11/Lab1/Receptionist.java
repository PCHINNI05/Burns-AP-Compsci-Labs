package Lab1;
public class Receptionist extends Employee {
	public static int CheckupLine = 0;
	public static int VaccineLine = 0;
	public static int SurgeryLine = 0;
	private int patientsChecked = 0;
	
	public Receptionist (String name) {
		super (name, "Receptionist");
	}
	public String checkIn (String purpose) {
		String response;
		if (purpose.equalsIgnoreCase("Checkup")) {
			Doctor.patientsRemaining++;
			response = "You have been checked in, there are " + CheckupLine + " people ahead of you.";
			patientsChecked++;
		}
		else if (purpose.equalsIgnoreCase("Vaccine")) {
			Nurse.patientsRemaining++;
			response = "You have been checked in, there are " + CheckupLine + " people ahead of you.";
			patientsChecked++;
		}
		else if (purpose.equalsIgnoreCase("Surgery")) {
			Surgeon.patientsRemaining++;
			response = "You have been checked in, there are " + CheckupLine + " people ahead of you.";
			patientsChecked++;
		}
		else {
			response = "That isn't an option at our hospitol\nPlease type checkup, vaccine, or surgery";
		}
		return response;
	}
	public String toString() {
		String response = super.getName() + ":\n";
		response += patientsChecked + " patients checked in";
		
		return response;
	}
}
