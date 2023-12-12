package Lab2;
import java.text.NumberFormat;
public class Electronics {
	public double weight;
	private double cost;
	public String model;
	private String deviceName;
	
	public Electronics (double weight, double cost, String model, String deviceName) {
		this.weight = weight;
		this.cost = cost;
		this.model = model;
		this.deviceName = deviceName;
	}
	public String getName () {
		return deviceName;
	}
	public String getCost () {
		return NumberFormat.getCurrencyInstance().format(cost);
	}
}
