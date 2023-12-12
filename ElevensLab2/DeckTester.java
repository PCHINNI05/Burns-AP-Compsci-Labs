package ElevensLab2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"Orange", "Apple", "Banana"};
		String[] ranks2 = {"Rank1", "Rank2", "Rank3"};
		String[] ranks3 = {"Hamburger", "Sliced", "Baguette"};
		
		String[] suits1 = {"Ripe", "Unripe", "Moldy"};
		String[] suits2 = {"Suit1", "Suit2", "Suit3"};
		String[] suits3 = {"Fresh", "Stale"};
		
		int[] values1 = {1, 5, 10};
		int[] values2 = {1, 2, 3};
		int[] values3 = {3, 7, 10};
		
		Deck deck1 = new Deck(ranks1, suits1, values1);
		Deck deck2 = new Deck(ranks2, suits2, values2);
		Deck deck3 = new Deck(ranks3, suits3, values3);
		
		System.out.println(deck1.toString());
		System.out.println();
		
		System.out.println(deck2.toString());
		System.out.println();
		
		System.out.println(deck3.toString());
		System.out.println();
		
		System.out.println(deck1.deal());
		System.out.println(deck2.deal());
		System.out.println(deck3.deal());
		
		System.out.println();
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck2.isEmpty());
		System.out.println(deck3.isEmpty());
	}
}
