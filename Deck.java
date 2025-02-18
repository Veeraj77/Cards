// Deck.java

import java.util.*;

import javax.smartcardio.Card;
class Deck{
	ArrayList<Card> deck;
	public Deck(){
		deck=new ArrayList<>();
	}
	public void createDeck(){
		String[] ranks={"2","3","4","5","6","7","8","9","10","J","K","Q","A"};
		String[] suits={"Spades","Hearts","Diamonds","Clubs"};


		for(String rank : ranks){
			for (String suit : suits){
					deck.add(new Card(rank,suit));
			}
		}
	}
	public void displayDeck(){
		for (Card card :deck){
			System.out.println(card);
		}
	}

	public void shuffleDeck(){
		Collections.shuffle(deck);

	}
	public void randomCards(){
	Random random = new Random();
    	Card card1 = deck.get(random.nextInt(deck.size()));
    	Card card2 = deck.get(random.nextInt(deck.size()));
	System.out.println("Random Card 1: " + card1);
    	System.out.println("Random Card 2: " + card2);
	}
	 public ArrayList<ArrayList<Card>> distributeCards(int players, int cardsPerPlayer) {
        ArrayList<ArrayList<Card>> playersHands = new ArrayList<>();

        // Initialize each player's hand
        for (int i = 0; i < players; i++) {
            playersHands.add(new ArrayList<>());
        }
}

