package Lab5;
public class Bank {
	public static int accountCount = 0;
	Account[] bank = new Account[30];
	
	public Bank() {
		
	}
	public String createAccount(String firstName, String lastName, double balance) {
		String response = "";
		bank[accountCount] = new Account(firstName, lastName, balance);
		response += "Your account has been created, your account number is " + bank[accountCount].getAccountNum() + "\n";
		accountCount++;
		return response;
	}
	public String sortByFirstName(String name) {
		String response = "";
		for (int i = 0; i < bank.length; i++) {
			if(bank[i].getFirstName().equalsIgnoreCase(name)) {
				response += bank[i];
				response += "\n";
			}
		}
		if (response.equalsIgnoreCase("")) {
			throw new IllegalArgumentException ("No account matches the name provided");
		}
		return response;
	}
	public String sortBylastName(String name) {
		String response = "";
		for (int i = 0; i < bank.length; i++) {
			if(bank[i].getLastName().equalsIgnoreCase(name)) {
				response += bank[i];
				response += "\n";
			}
		}
		if (response.equalsIgnoreCase("")) {
			throw new IllegalArgumentException ("No account matches the name provided");
		}
		return response;
	}
	public String sortByClosestBal(double balance) {
		double distance = Math.abs(bank[0].getDoubleBal() - balance);
		String response = "";
		int x = 0;
		for (int i = 1; i < bank.length; i++) {
			double idistance = Math.abs(bank[i].getDoubleBal() - balance);
			if (idistance < distance) {
				x = i;
				distance = idistance;
			}
		}
		response = bank[x].toString();
		response += "\n";
		return response;
	}
	public String sortByAccountNum(int accountNum) {
		String response = "";
		if (accountNum > 30) {
			throw new IllegalArgumentException ("No account matches the account number provided\n");
		}
		int index = accountNum - 1;
		if (bank[index] != null) {
			response += bank[index];
			response += "\n";
			return response;
		}
		else {
			throw new IllegalArgumentException ("No account matches the account number provided\n");
		}
	}
	public String toString() {
		String response = "";
		
		for (int i = 0; i < bank.length; i++) {
			response += bank[i];
			response += "\n";
		}
		
		return response;
	}
}
