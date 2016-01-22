public class CardDeck {
	public Card[] cards; // korten
	public int current; // index för nästa kort
	java.util.Random rand = new java.util.Random();

	/**
	 * Skapar en kortlek
	 */
	public CardDeck() {
		cards = new Card[52]; // skapa vektorn

		// skapa korten, lägg in dem i vektorn
		int currentCard = 0; // tillfällig räknare
		for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for (int rank = 1; rank < 14; rank++) {
				cards[currentCard] = new Card(suit, rank);
				currentCard++;
			}
		}
		current = 0;
	}

	/**
	 * Blandar kortleken
	 */
	public void shuffle() {
		for (int i = 51; i > 1; i--) {
			int index = rand.nextInt(i + 1);
			Card tmp = cards[i];
			cards[i] = cards[index];
			cards[index] = tmp;
		}
		current = 0; //börjar på index 0
	}

	/**
	 * Undersöker om det finns fler kort i kortleken
	 */
	public boolean moreCards() {
		return (current < 52) ? true : false;
	}

	/**
	 * Drar det översta kortet i leken
	 */
	public Card getCard() {
		if (current < 52) { // finns fler kort
			Card val = cards[current];
			current++;
			return val;
		} else {
			return null;
		}
	}
}