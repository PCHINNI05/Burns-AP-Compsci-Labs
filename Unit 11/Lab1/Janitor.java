package Lab1;
public class Janitor extends Employee {
	public static final int rooms = 10;
	public static int roomsCleaned = rooms;
	private int cleanCount = 0;
	public Janitor (String name) {
		super (name, "Jannitor");
	}
	public String cleanRoom () {
		String response;
		if (roomsCleaned >= rooms) {
			response = "All rooms are clean";
		}
		else {
			roomsCleaned++;
			cleanCount++;
			response = "A room has been cleaned, there are " + (rooms - roomsCleaned) + " dirty rooms left";
		}
		return response;
	}
	public String toString() {
		String response = super.getName() + ":\n";
		response += cleanCount + " rooms cleaned";
		
		return response;
	}
}
