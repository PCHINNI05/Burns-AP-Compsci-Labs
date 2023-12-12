package Lab2;
public class Laptops extends Electronics {
	public double screenSize;
	private String processor;
	private int gbRam;
	public int softwaresOpen = 0;
	
	public Laptops (double weight, double cost, String model, String deviceName, double screenSize, String processor, int gbRam) {
		super (weight, cost, model, deviceName);
		
		this.screenSize = screenSize;
		this.processor = processor;
		this.gbRam = gbRam;
	}
	public String getProcessor () {
		return processor;
	}
	public String getRam () {
		return gbRam + " gigabytes of RAM";
	}
	
	public String openSoftware () {
		softwaresOpen++;
		return "A new software has been opened, there are now " + softwaresOpen + " softwares open";
	}
	public String closeSoftware () {
		if (softwaresOpen > 0) {
			softwaresOpen--;
			return "A software has been closed, there are now " + softwaresOpen + " softwares open";
		}
		else {
			return "No softwares open";
		}
	}
}
