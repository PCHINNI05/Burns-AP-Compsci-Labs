package ChallengeLab2;
public class StudentOrganizer {
	private String firstName;
	private String lastName;
	private int studentNum;
	
	public StudentOrganizer (String firstName, String lastName, int studentNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNum = studentNum;
	}
	public String getFirstName () {
		return firstName;
	}
	public String getLastName () {
		return lastName;
	}
	public int getStudentNum () {
		return studentNum;
	}
	public String toString () {
		String student = lastName + ", " + firstName + " - " + studentNum;
		return student;
	}
}
