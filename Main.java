//Main java

import java.util.ArrayList;

import javax.smartcardio.Card;

class Main{

	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("________Create Deck________");
		deck.createDeck();
		System.out.println("________Print Deck________");
		deck.displayDeck();
		System.out.println("########## shuffle Deck #######");
		deck.shuffleDeck();
		deck.displayDeck();
		System.out.println("########## Two Random Card #######");
		deck.randomCards();
		deck.displayDeck();
		}
		ArrayList<ArrayList<Card>> playersHands = deck.distributeCards(3, 5);
        // Display each player's hand
        for (int i = 0; i < playersHands.size(); i++) {
            System.out.println("Player " + (i + 1) + " Hand:");
            for (Card card : playersHands.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }
        // Display remaining deck
        System.out.println("########## Remaining Deck #######");
        deck.displayDeck();
}
