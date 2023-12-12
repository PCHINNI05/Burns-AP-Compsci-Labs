package ChallengeLab1;
import java.security.SecureRandom;
import java.util.ArrayList;
public class DeckofCards {
    private Card[] deck;
    private ArrayList<Card> dealt = new ArrayList<Card>();
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    public DeckofCards () {
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }
    public void shuffle () {
        currentCard = 0;
        
        for (int firstCard = 0; firstCard < deck.length; firstCard++) {
            int secondCard = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            Card temp = deck[firstCard];
            deck[firstCard] = deck[secondCard];
            deck[secondCard] = temp;
        }
    }
    public Card deal () {
    	Card temp;
        if (currentCard < deck.length) {
        	dealt.add(deck[currentCard]);
        	temp = deck[currentCard];
        	deck[currentCard++] = null;
            return temp;
        }
        else {
            return null;
        }
    }
    public void resetPosition () {
        currentCard = 0;
    }
    public ArrayList<Card> returnDealt () {
    	return dealt;
    }
    public ArrayList<Card> returnRemaining () {
    	ArrayList<Card> cardsLeft = new ArrayList<Card>();
    	
    	for (int i = 0; i < deck.length; i++) {
    		if (deck[i] != null) {
    			cardsLeft.add(deck[i]);
    		}
    	}
    	
    	return cardsLeft;
    }
}