package Lab2;
public class LG extends TVs {
	public String model; 
	public static final String brand = "LG ";
	
	public LG (double weight, double cost, String model, String deviceName, double screenSize, int hdmiPortCount, boolean aiCompatible) {
		super (weight, cost, model, deviceName, screenSize, hdmiPortCount, aiCompatible);
		
		this.model = model;
	}
	public String toString () {
		String call;
		if (super.getMovieStatus() == false) {
			call = "No movie running";
		}
		else {
			call = "A movie is currently running";
		}
		String response = brand + model + " " + super.getName() + ":\n"
						+ "Cost: " + super.getCost() + "\n"
						+ "Weight: " + super.weight + "\n"
						+ "Screen Size: " + super.screenSize + "\n"
						+ "HDMI port count: " + super.hdmiPortCount + "\n"
						+ "AI Compatible: " + super.getAICompatibility() + "\n\n"
						+ call + "\n"
						+ super.getMovieCount() + " total movies played";
		
		return response;
	}
}
