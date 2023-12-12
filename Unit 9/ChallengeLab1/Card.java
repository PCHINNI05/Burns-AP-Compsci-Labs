package ChallengeLab1;
public class Card {
    private final String face;
    private final String suit;
    
    public Card (String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    public String faceReveal () {
        return face;
    }
    public String toString () {
        String card = face + " of " + suit;
        return card;
    }
}