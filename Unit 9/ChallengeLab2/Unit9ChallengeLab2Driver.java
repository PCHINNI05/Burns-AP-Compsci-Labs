package ChallengeLab2;
import java.util.Scanner;
public class Unit9ChallengeLab2Driver {
	public static void main(String[] args) {
		Classroom COMSCI = new Classroom();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			System.out.println("Enter the First Name for student " + (i + 1));
			String fName = sc.next();
			
			System.out.println("Enter the Last Name for student " + (i + 1));
			String lName = sc.next();
			
			System.out.println("Enter the Student Number for student " + (i + 1));
			int sNum = sc.nextInt();
			
			COMSCI.addStudent(fName, lName, sNum);
		}
		
		System.out.println("\n\n\n\n");
		
		String response = "";
		while (!response.equalsIgnoreCase("stop")) {
			System.out.println("Do you want to sort the list of students by First Name (First),\nBy Last Name(Last),\nOr by Student Number(Num)?");
			response = sc.next();
			
			if (response.equalsIgnoreCase("First")) {
				System.out.println(COMSCI.sortByFirstName());
			}
			else if (response.equalsIgnoreCase("Last")) {
				System.out.println(COMSCI.sortByLastName());
			}
			else if (response.equalsIgnoreCase("Num")) {
				System.out.println(COMSCI.sortByStudentNum());
			}
		}
	}

}
