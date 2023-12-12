package Lab5;
import java.util.Scanner;
public class Unit9Lab5 {
	public static void main(String[] args) {
		Bank APBank = new Bank();
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		while (!response.equalsIgnoreCase("stop")) {
			System.out.println("Do you want to create a new account (new), "
								+ "sort the existing accounts by balance (bal), "
								+ "sort the existing accounts by first name (first),\n"
								+ "sort the existing accounts by last name (last), "
								+ "or sort the existing accounts by account number (num)?\n"
								+ "Type \"stop\" to stop");
			response = sc.nextLine();
			
			if (response.equalsIgnoreCase("new")) {
				System.out.println("\nEnter the first name on your new account");
				String firstName = sc.nextLine();
				
				System.out.println("\nEnter the last name on your new account");
				String lastName = sc.nextLine();
				
				System.out.println("\nEnter the base deposit on your new account");
				double balance = sc.nextDouble();
				
				System.out.println(APBank.createAccount(firstName, lastName, balance));
			}
			else if (response.equalsIgnoreCase("bal")) {
				System.out.println("Enter the balance you want to check for, if it doesn't exist, it will find the closest one");
				double bal = sc.nextDouble();
				
				System.out.println(APBank.sortByClosestBal(bal));
			}
			else if (response.equalsIgnoreCase("first")) {
				System.out.println("Enter the first name you want to sort by");
				String first = sc.nextLine();
				
				System.out.println(APBank.sortByFirstName(first));
			}
			else if (response.equalsIgnoreCase("last")) {
				System.out.println("Enter the last name you want to sort by");
				String last = sc.nextLine();
				
				System.out.println(APBank.sortBylastName(last));
			}
			else if (response.equalsIgnoreCase("num")) {
				System.out.println("Enter the account number you want to view");
				int accountNum = sc.nextInt();
				
				System.out.println(APBank.sortByAccountNum(accountNum));
			}
		} 
		
		}
}