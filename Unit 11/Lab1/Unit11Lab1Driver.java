package Lab1;
import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;
public class Unit11Lab1Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SecureRandom gen = new SecureRandom();
		ArrayList<Employee> staff = new ArrayList<Employee>();
		
		String staffCommands = "Directory - to view a list of all employees in order of hire date"
							 + "Policies - to view a list of all polices";
		
		Doctor drMerry = new Doctor("Merry");
		staff.add(drMerry);
		
		Nurse nrCherry = new Nurse("Cherry");
		staff.add(nrCherry);
		
		Administrator adminTerry = new Administrator("Terry");
		staff.add(adminTerry);
		
		Surgeon srPerry = new Surgeon("Perry");
		staff.add(srPerry);
		
		Receptionist repSherry = new Receptionist("Sherry");
		staff.add(repSherry);
		
		Janitor janJerry = new Janitor("Jerry");
		staff.add(janJerry);
		
		System.out.println("Welcome to the Mullberry Hospital\n\n");
		
		String response = "";
		String staffPick = "";
		while (!response.equalsIgnoreCase("Stop")) {
			System.out.println("Do you want to:\n"
					+ "check in a patient (check-in)\n"
					+ "Administer a vaccine (vaccine)\n"
					+ "Preform a checkup (check-up)\n"
					+ "Preform a surgery (surgery)"
					+ "Create a policy (policy) or\n"
					+ "Clean a room (clean)\n\n"
					+ "There is also a list of management commands, type \"Staff\" to see them");
			response = sc.next();
			
			if (response.equalsIgnoreCase("check-in")) {
				System.out.println("All receptionists at Mullberry:");
				for (Employee emp : staff) {
					if (emp.getType().equalsIgnoreCase("receptionist")) {
						System.out.println(emp.getName());
					}
				}
				System.out.println("Which receptionist do you want to go to?");
				staffPick = sc.next();
				
				for (Employee emp : staff) {
					if (emp instanceof Receptionist) {
						Receptionist r = (Receptionist) emp;
				   
						if (r.getName().equalsIgnoreCase(staffPick)) {
							System.out.println("What is the purpose of your visit?");
							String purpose = sc.next();
							System.out.println(r.checkIn(purpose));
						}
					}	
				}
			}
			else if (response.equalsIgnoreCase("vaccine")) {
				int nurseCount = 0;
				for (Employee emp : staff) {
					if (emp instanceof Nurse) {
						nurseCount++;
					}
				}
				int num = gen.nextInt(nurseCount);
				int x = 0;
				for (Employee emp : staff) {
					if (emp instanceof Nurse) {
						x++;
						if (x == num) {
							Nurse n = (Nurse) emp;
							System.out.println(n.administerVaccine());
						}
					}
				}
			}
			else if (response.equalsIgnoreCase("check-up")) {
				int doctorCount = 0;
				for (Employee emp : staff) {
					if (emp instanceof Doctor) {
						doctorCount++;
					}
				}
				int num = gen.nextInt(doctorCount);
				int x = 0;
				for (Employee emp : staff) {
					if (emp instanceof Doctor) {
						x++;
						if (x == num) {
							Doctor d = (Doctor) emp;
							System.out.println(d.checkup());
						}
					}
				}
			}
			else if (response.equalsIgnoreCase("surgery")) {
				int surgeonCount = 0;
				for (Employee emp : staff) {
					if (emp instanceof Surgeon) {
						surgeonCount++;
					}
				}
				int num = gen.nextInt(surgeonCount);
				int x = 0;
				for (Employee emp : staff) {
					if (emp instanceof Surgeon) {
						x++;
						if (x == num) {
							Surgeon s = (Surgeon) emp;
							System.out.println(s.surgery());
						}
					}
				}
			}
			else if (response.equalsIgnoreCase("policy")) {
				System.out.println("All administrators at Mullberry:");
				for (Employee emp : staff) {
					if (emp.getType().equalsIgnoreCase("Administrator")) {
						System.out.println(emp.getName());
					}
				}
				System.out.println("Which administrator do you want to go to?");
				staffPick = sc.next();
				
				for (Employee emp : staff) {
					if (emp instanceof Administrator) {
						Administrator a = (Administrator) emp;
				   
						if (a.getName().equalsIgnoreCase(staffPick)) {
							System.out.println("What is the name of your policy?");
							String name = sc.next();
							System.out.println("What is your policy?");
							String policy = sc.next();
							System.out.println(a.makePolicy(name, policy));
						}
					}	
				}
			}
			else if (response.equalsIgnoreCase("clean")) {
				int janitorCount = 0;
				for (Employee emp : staff) {
					if (emp instanceof Janitor) {
						janitorCount++;
					}
				}
				int num = gen.nextInt(janitorCount);
				int x = 0;
				for (Employee emp : staff) {
					if (emp instanceof Janitor) {
						x++;
						if (x == num) {
							Janitor j = (Janitor) emp;
							System.out.println(j.cleanRoom());
						}
					}
				}
			}
			else if (response.equalsIgnoreCase("staff")) {
				System.out.println(staffCommands);
				response = sc.next();
				
				if (response.equalsIgnoreCase("Directory")) {
					System.out.println(staff);
				}
				else if (response.equalsIgnoreCase("Policies")) {
					System.out.println(Administrator.policies);
				}
			}
		}
	}
}
