package Lab2;
import java.util.Scanner;
public class Unit11Lab2Driver {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Laptops laptop;
		Phones phone;
		TVs tv;
		
		//Laptop creation
		System.out.println("Answer the following questions based on your laptop:\n");
		
		System.out.println("Is your laptop HP or Dell?");
		String HPDELL = sc.nextLine();
		if ((HPDELL.equalsIgnoreCase("HP") || HPDELL.equalsIgnoreCase("DELL")) == false) {
			System.out.println("INVAID MODEL");
			System.exit(0);
		}
		
		System.out.println("Enter the weight of your laptop");
		double lapWeight = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the cost of your laptop");
		double lapCost = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the model of your laptop");
		String lapModel = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter the screen size of your laptop");
		double lapScreenSize = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the type of processor your laptop has");
		String processor = sc.nextLine();
		
		System.out.println("Enter the amount of ram you have in gigabytes");
		int gbRam = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your name for the device");
		String lapDeviceName = sc.nextLine();
		
		if (HPDELL.equalsIgnoreCase("Dell")) {
			laptop = new Dell(lapWeight, lapCost, lapModel, lapDeviceName, lapScreenSize, processor, gbRam);
		}
		else {
			laptop = new HP(lapWeight, lapCost, lapModel, lapDeviceName, lapScreenSize, processor, gbRam);
		}
		
		
		
		//Phone creation
		System.out.println("Answer the following questions based on your phone:\n");
		
		System.out.println("Is your phone Apple or a Samsung?");
		String APPLESAMSUNG = sc.nextLine();
		if ((APPLESAMSUNG.equalsIgnoreCase("apple") || APPLESAMSUNG.equalsIgnoreCase("samsung")) == false) {
			System.out.println("INVAID MODEL");
			System.exit(0);
		}
		
		System.out.println("Enter the weight of your phone");
		double cellWeight = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the cost of your phone");
		double cellCost = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the model of your phone");
		String cellModel = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter the screen size of your phone");
		double cellScreenSize = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter your phone's zoom distance");
		int cameraZoom = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the amount of storage you have in gigabytes");
		int storage = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your name for the device");
		String cellDeviceName = sc.nextLine();
		
		if (APPLESAMSUNG.equalsIgnoreCase("apple")) {
			phone = new iPhone(cellWeight, cellCost, cellModel, cellDeviceName, cellScreenSize, storage, cameraZoom);
		}
		else {
			phone = new Galaxy(cellWeight, cellCost, cellModel, cellDeviceName, cellScreenSize, storage, cameraZoom);
		}
		
		
		
		//TV creation
		System.out.println("Answer the following questions based on your tv:\n");
		
		System.out.println("Is your tv LG or Samsung?");
		String LGSAMSUNG = sc.nextLine();
		if ((LGSAMSUNG.equalsIgnoreCase("lg") || LGSAMSUNG.equalsIgnoreCase("samsung")) == false) {
			System.out.println("INVAID MODEL");
			System.exit(0);
		}
		
		System.out.println("Enter the weight of your tv");
		double tvWeight = sc.nextDouble();
		sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter the cost of your tv");
		double tvCost = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the model of your tv");
		String tvModel = sc.nextLine();
		
		System.out.println("Enter the screen size of your tv");
		double tvScreenSize = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the amount of HDMI ports your tv has");
		int hdmiPortCount = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Is your tv aiCompatible?");
		String aiYESNO = sc.nextLine();
		boolean aiCompatible;
		if (aiYESNO.equalsIgnoreCase("yes")) {
			aiCompatible = true;
		}
		else {
			aiCompatible = false;
		}
		
		System.out.println("Enter your name for the device");
		String tvDeviceName = sc.nextLine();
		
		if (LGSAMSUNG.equalsIgnoreCase("lg")) {
			tv = new LG (tvWeight, tvCost, tvModel, tvDeviceName, tvScreenSize, hdmiPortCount, aiCompatible);
		}
		else {
			tv = new Samsung (tvWeight, tvCost, tvModel, tvDeviceName, tvScreenSize, hdmiPortCount, aiCompatible);
		}
		
		
		
		//Usage
		laptop.openSoftware();
		System.out.println(laptop);
		System.out.println();
		
		laptop.closeSoftware();
		System.out.println(laptop);
		System.out.println();
		
		System.out.println(phone.phoneCall());
		System.out.println(phone);
		System.out.println();
		
		System.out.println(phone.endCall());
		System.out.println(phone);
		System.out.println();
		
		tv.playMovie();
		System.out.println(tv);
		System.out.println();
		
		tv.endMovie();
		System.out.println(tv);
		System.out.println();
	}
}