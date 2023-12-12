public class PigPlayer {
    Die myDie = new Die(6);
    private int points, temp, result;
;
    
    public PigPlayer () {
        getScore();
        rollDice();
        fullClear();
        clear();
        
    }
    
    public int rollDice() {
        temp = myDie.roll();
        points += temp;
        
        return temp;
    }
    
    public int getScore () {
        result = points;
        return result;
        
    }
    
    public int keepScore (int pfinal) {
        points = pfinal;
        
        return points;
        
    }
    
    public void fullClear () {
        points = 0;
        temp = 0; 
        result = 0;
        
    }
    
    public void clear () {
        temp = 0;
        
    }
}
