package Lab1;
import java.util.ArrayList;
public class Administrator extends Employee {
	public static ArrayList<String> policies;
	private int policyCount;
	
	public Administrator (String name) {
		super (name, "Administrator");
		policies = new ArrayList<String>();
	}
	public String makePolicy (String policyName, String policy) {
		String response = "Your policy has been created:\n\n";
		response += policyName + "\n";
		response += policy;
		
		String formattedPolicy = policyName + ":" + policy;
		policies.add(formattedPolicy);
		policyCount++;
		
		return response;
	}
	public String toString () {
		String response = super.getName() + ":\n";
		response += policyCount + " policies creted";
		
		return response;
	}
}
