public class Roach {
    private final double sprayKill = 0.9;
    private int startpopulation, roachPop;
    
    public Roach (int StartPop) {
        waitForDoubling();
        Spray();
        Temp();
        
        startpopulation = StartPop;
        
    }
    
    public void waitForDoubling () {
        startpopulation *= 2;
        roachPop = startpopulation;
        
    }
    
    public void Spray () {
        startpopulation *= sprayKill;
        roachPop = startpopulation;
        
    }
    
    public int Temp () {
        return roachPop;
        
    }
    
    public String toString() {
        String result;
        
        result = "There are " + Integer.toString(roachPop) + " Roaches left";
        
        return result;
        
    }
    
}