package Lab5;
import java.text.NumberFormat;
public class Account {
	private static int accountCount = 0;
	private final int accountNum;
	private String balance;
	private double dBal;
	private String firstName;
	private String lastName;
	
	public Account (String firstName, String lastName, double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException ("Balance cannot be less than 0");
		}
		
		accountCount++;
		accountNum = accountCount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = NumberFormat.getCurrencyInstance().format(balance);
		dBal = balance;
	}
	public String getFirstName()  {
		return firstName;
	}
	public String getLastName()  {
		return lastName;
	}
	public String getBal() {
		return NumberFormat.getCurrencyInstance().format(balance);
	}
	public double getDoubleBal() {
		return dBal;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public String toString() {
		return String.format("%s %s's Account:\nAccount Number:%d\nBalance:%s",
							 firstName,
							 lastName,
							 accountNum,
							 balance);
	}
}
