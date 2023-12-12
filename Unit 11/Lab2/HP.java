package Lab2;
public class HP extends Laptops {
	public String model;
	public static final String brand = "HP ";
		
		public HP (double weight, double cost, String model, String deviceName, double screenSize, String processor, int gbRam) {
			super (weight, cost, model, deviceName, screenSize, processor, gbRam);
			
			this.model = model;
		}
		public String toString () {
			String response = brand + model + " " + super.getName() + ":\n"
							+ "Cost: " + super.getCost() + "\n"
							+ "Weight: " + super.weight + "\n"
							+ "Screen Size: " + super.screenSize + "\n"
							+ "Processor: " + super.getProcessor() + "\n"
							+ "RAM: " + super.getRam() + "\n\n"
							+ "Softwares Open: " + super.softwaresOpen;
			
			return response;
		}
}
