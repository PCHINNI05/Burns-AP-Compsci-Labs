import java.util.*; 
public class Bulb {
    
    private final String OFF = "OFF";
    private final String ON = "ON";
    
    private String status;
    
    public Bulb() {
        SwitchOn();
        SwitchOff();
        
    }
    
    public void SwitchOn() {
        status = "ON";
        
    }
    
    public void SwitchOff() {
        status = "OFF";
        
    }
    
    public boolean isOff() {
        return (status == OFF);
        
    }
    
    public String toString() {
        String statusname;
        if (status == OFF)
            statusname = "OFF";
        else 
            statusname = "ON";
        return statusname;
        
    }
}