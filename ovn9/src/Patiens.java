public class Patiens {

	public static void main(String[] args) {
		int times = 300000; //Kör 300 000 ggr
		int win = 0;
		for (int i = 0; i < times; i++){
			CardDeck deck = new CardDeck();
			deck.shuffle();
			boolean vinst = true;
			for(int x = 0; deck.moreCards(); x++){
				x = x % 3 + 1; //Räknaren går från 1-3
				if(deck.getCard().getRank() == x){ // Jämför kortet med räknaren
					vinst = false; //När det inte går ut
					
				}
			}
			if(vinst == true){ //Ifall det går ut
				win++;
			}
		}
		System.out.println((double)win/(double)times);
	}

}
