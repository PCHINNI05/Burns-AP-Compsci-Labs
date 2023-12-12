package Lab2;
public class iPhone extends Phones {
	public String model; 
	public static final String brand = "Apple ";
	
	public iPhone (double weight, double cost, String model, String deviceName, double screenSize, double storage, int cameraZoom) {
		super (weight, cost, model, deviceName, screenSize, storage, cameraZoom);
		
		this.model = model;
	}
	public String toString () {
		String call;
		if (super.getCallStatus() == false) {
			call = "No call active";
		}
		else {
			call = "A call is currently active";
		}
		String response = brand + model + " " + super.getName() + ":\n"
						+ "Cost: " + super.getCost() + "\n"
						+ "Weight: " + super.weight + "\n"
						+ "Screen Size: " + super.screenSize + "\n"
						+ "Storage: " + super.getStorage() + "\n"
						+ "Camera Zoom: " + super.cameraZoom + "x\n\n"
						+ call + "\n"
						+ super.getCallCount() + " total calls made";
		
		return response;
	}
}
