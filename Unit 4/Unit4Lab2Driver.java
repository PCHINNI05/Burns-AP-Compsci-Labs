import java.util.*;
public class Main {
    public static void main (String[] args) {
        
        Bulb kit = new Bulb();
        Bulb hall = new Bulb();
        Bulb bed = new Bulb();
        Bulb bath = new Bulb();
        Bulb den = new Bulb();
        
        Scanner bulbcheck = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);
        Scanner onoroff = new Scanner(System.in);
        
        String yesno = "yes";
        String roomname = "E";
        
        String kitonoff = "OFF";
        String hallonoff = "OFF";
        String bedonoff = "OFF";
        String bathonoff = "OFF";
        String denonoff = "OFF";
        
        while (!roomname.equalsIgnoreCase("exit")) {
        
        System.out.println("Which room switch do you want to go to? \nOptions :kitchen, hallway, bedroom, bathroom, and den\nType 'EXIT' to stop");
        roomname = bulbcheck.nextLine();
        
        if (roomname.equalsIgnoreCase("kitchen")) {
            System.out.println("Do you want to turn it off or on?");
            String onoff = onoroff.nextLine();
            
            if (onoff.equalsIgnoreCase("ON")) {
                kit.SwitchOn();
                kitonoff = "ON";
                
            }
            
            else {
                kit.SwitchOff();
                kitonoff = "OFF";
                
            }
        }
        
        else if (roomname.equalsIgnoreCase("hallway")) {
            System.out.println("Do you want to turn it off or on?");
            String onoff = onoroff.nextLine();
            
            if (onoff.equalsIgnoreCase("ON")) {
                hall.SwitchOn();
                hallonoff = "ON";
                
            }
            
            else {
                hall.SwitchOff();
                hallonoff = "OFF";
                
            }
        
            
        }
        
        else if (roomname.equalsIgnoreCase("bedroom")) {
            System.out.println("Do you want to turn it off or on?");
            String onoff = onoroff.nextLine();
            
            if (onoff.equalsIgnoreCase("ON")) {
                bed.SwitchOn();
                bedonoff = "ON";
                
            }
            
            else {
                bed.SwitchOff();
                bedonoff = "OFF";
                
            }
        
            
        }
        
        else if (roomname.equalsIgnoreCase("bathroom")) {
            System.out.println("Do you want to turn it off or on?");
            String onoff = onoroff.nextLine();
            
            if (onoff.equalsIgnoreCase("ON")) {
                bath.SwitchOn();
                bathonoff = "ON";
                
            }
            
            else {
                bath.SwitchOff();
                bathonoff = "OFF";
                
            }
        
            
        }
        
        else if (roomname.equalsIgnoreCase("den")) {
            System.out.println("Do you want to turn it off or on?");
            String onoff = onoroff.nextLine();
            
            if (onoff.equalsIgnoreCase("ON")) {
                den.SwitchOn();
                denonoff = "ON";
                
            }
            
            else {
                den.SwitchOff();
                denonoff = "OFF";
                
            }
        
            
        }
        
        System.out.println("\nStatus Check:");
        System.out.println("Kitchen: " + kitonoff);
        System.out.println("Hallway: " + hallonoff);
        System.out.println("Bedroom: " + bedonoff);
        System.out.println("Bathroom: " + bathonoff);
        System.out.println("Den: " + denonoff);
        
        System.out.println("");
        }
        
    }
    
}