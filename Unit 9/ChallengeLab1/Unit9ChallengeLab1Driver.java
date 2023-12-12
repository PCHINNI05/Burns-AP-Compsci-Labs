package ChallengeLab1;
public class Unit9ChallengeLab1Driver {
	public static void main(String[] args) {
		DeckofCards deck = new DeckofCards();
		
		System.out.println(deck.returnRemaining());
		
		deck.shuffle();
		
		System.out.println(deck.returnRemaining());
		System.out.println(deck.deal());
		System.out.println(deck.returnRemaining());
		
		for (int i = 0; i < 30; i++) {
			deck.deal();
		}
		
		System.out.println(deck.returnRemaining());
	}

}
