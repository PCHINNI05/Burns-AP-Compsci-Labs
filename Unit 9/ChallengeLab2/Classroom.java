package ChallengeLab2;
import java.util.ArrayList;
public class Classroom {
	private StudentOrganizer[] Class;
	private static final int studentCount = 20;
	private static int students = 0;
	public Classroom () {
		Class = new StudentOrganizer[studentCount];
	}
	public String addStudent (String firstName, String lastName, int StudentNum) {
		String numBinary;
		int num = StudentNum;
		if (students < 20) {
			numBinary = Integer.toBinaryString(num);
			String numBinaryFinal = ("0000000000" + numBinary).substring(numBinary.length());
			num = Integer.parseInt(numBinaryFinal);
			Class[students] = new StudentOrganizer(firstName, lastName, num);
			students++;
		}
		return "Student Added, their account number is " + num;
	}
	public ArrayList<String> sortByFirstName () {
		ArrayList<StudentOrganizer> sorted = new ArrayList<StudentOrganizer>();
		ArrayList<String> response = new ArrayList<String>();
		
		for (int x = 0; x < Class.length; x++) {
			sorted.add(Class[x]);
		}
		
		for (int i = 0; i < sorted.size(); i++) {
            for (int j = i + 1; j < sorted.size(); j++) { 
                if (sorted.get(i).getFirstName().compareTo(sorted.get(j).getFirstName()) > 0) {
                    StudentOrganizer temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
		
		for (int a = 0; a < sorted.size(); a++) {
			response.add(sorted.get(a).getFirstName());
		}
		
		return response;
	}
	
	public ArrayList<String> sortByLastName () {
		ArrayList<StudentOrganizer> sorted = new ArrayList<StudentOrganizer>();
		ArrayList<String> response = new ArrayList<String>();
		
		for (int x = 0; x < Class.length; x++) {
			sorted.add(Class[x]);
		}
		
		for (int i = 0; i < sorted.size(); i++) {
            for (int j = i + 1; j < sorted.size(); j++) { 
                if (sorted.get(i).getLastName().compareTo(sorted.get(j).getLastName()) > 0) {
                    StudentOrganizer temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
		
		for (int a = 0; a < sorted.size(); a++) {
			response.add(sorted.get(a).getLastName());
		}
		
		return response;
	}
	public ArrayList<Integer> sortByStudentNum () {
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		
		for (int i = 0; i < Class.length; i++) {
			sorted.add(Class[i].getStudentNum());
		}
		
		return sorted;
	}
}
