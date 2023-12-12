import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner S1 = new Scanner(System.in);
	    Scanner S2 = new Scanner(System.in);
	    Scanner S3 = new Scanner(System.in);
	    Scanner S4 = new Scanner(System.in);
	    Scanner S5 = new Scanner(System.in);
	    Scanner S6 = new Scanner(System.in);
	    
	    int gas;
	    int x = 1;
	    
	    System.out.println("What is the make of your car?");
	    String make = S1.nextLine();
	    
	    System.out.println("What is the model of your car?");
	    String model = S2.nextLine();
	    
	    System.out.println("How much mileage does your car get?");
	    int mileage = S3.nextInt();
	    
	    Car myCar = new Car(make, model, mileage, 0);
	    
	    String ask = "";
	    
	    System.out.println("\nCongrats on your new " + make + " " + model + "!");
	    
	    while (!ask.equalsIgnoreCase("park")){
	        System.out.println("\nWhat would you like to do with your new car? For a list of commands, type 'help'");
	        while (x == 1) {
	        System.out.println("Remember, you have no gas");
	        x = 0;
	        }
	        
	        ask = S4.nextLine();
	        
	        System.out.print("\n");
	        
	        if (ask.equals("Drive")) {
	            System.out.println("How far do you want to go? Type '0' to go back");
	            int driveask = S5.nextInt();
	            
	            if (driveask == 0) {
	            }
	            
	            else {
	            myCar.drive (driveask);
	            gas = myCar.drive(driveask);
	            System.out.println("You arrived at your destination " + driveask + " miles away");
	            System.out.println("You have " + gas + " gallons of gas left");
	            
	            if (gas < 0) {
	                System.out.println("You ran out of gas on the middle of the road and due to the lack of insurance, your car was claimed");
	                System.exit(0);
	            }
	            else if (gas < 5) {
	                System.out.println("I suggest you refuel, you are running low on fuel");
	            }
	            }
	        }
	        
	        else if (ask.equals("getGas")) {
	            System.out.println(myCar.getGas());
	            
	        }
	        
	        else if (ask.equals("addGas")) {
	            System.out.println("How much gas do you want to add? Type '0' to go back");
	            int gasask = S6.nextInt();
	            System.out.println("You added " + gasask + " gallons of gas to your tank");
	            
	            if (gasask == 0) {
	            }
	            
	            else if (gasask > 20) {
	                System.out.println("You overfilled your tank and created a oil spill. Due to the lack of insurance, your car was claimed");
	                System.exit(0);
	            }
	            
	            else 
	            myCar.addGas (gasask);
	        }
	        
	        else if (ask.equals("park")) {
	            System.out.println("You found a great parking spot and your journey on foot begins\nYour car awaits when you are ready");
	            myCar.park ();
	            
	        }
	        
	        else if (ask.equalsIgnoreCase("help")) {
	            System.out.println(myCar.help());
	            
	        }
	        
	        else 
	        System.out.println("That is not an opton, type 'help' to see a list of commands");
	        
	    }
	        
	    
	}
}
