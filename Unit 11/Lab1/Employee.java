package Lab1;
public class Employee {
	public static int employeeCount = 0;
	private String name;
	private String type;
	
	public Employee (String name, String type) {
		employeeCount++;
		this.type = type;
		this.name = name;
	}
	public String getName () {
		return name;
	}
	public String getType () {
		return type;
	}
}
