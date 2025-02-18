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
