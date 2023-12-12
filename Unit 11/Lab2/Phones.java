package Lab2;
public class Phones extends Electronics {
	public double screenSize;
	private double storage;
	public int cameraZoom;
	private boolean callActive;
	private int callsMade = 0;
	
	public Phones (double weight, double cost, String model, String deviceName, double screenSize, double storage, int cameraZoom) {
		super (weight, cost, model, deviceName);
		
		this.screenSize = screenSize;
		this.storage = storage;
		this.cameraZoom = cameraZoom;
	}
	public String getStorage () {
		return storage + " gigabytes of storage";
	}
	public boolean getCallStatus () {
		return callActive;
	}
	public int getCallCount () {
		return callsMade;
	}
	
	public String phoneCall () {
		if (callActive = false) {
			callsMade++;
			callActive = true;
			return "Started Call";
		}
		else {
			return "Call active already, end the current call before starting a new one";
		}
	}
	public String endCall () {
		if (callActive = false) {
			return "No call is active right now";
		}
		else {
			callActive = false;
			return "The call has ended";
		}
	}
}
