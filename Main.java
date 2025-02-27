

import java.util.ArrayList; // Importing ArrayList to store the deck and player's cards


class Main {

    public static void main(String args[]) {

        // Creating an object of the Deck class
        Deck deck = new Deck();

        System.out.println("________Create Deck________");
        // This method creates a deck of 52 cards
        deck.createDeck();

        System.out.println("________Print Deck________");
        // This method displays all cards in the deck
        deck.displayDeck();

        System.out.println("########## Shuffle Deck #######");
        // This method shuffles the deck randomly
        deck.shuffleDeck();
        deck.displayDeck(); // Displaying shuffled deck

        System.out.println("########## Two Random Cards #######");
        // This method selects and displays 2 random cards from the deck
        deck.randomCards();

        System.out.println("########## Distribute Cards #######");
        // This method distributes cards among players
        // 3 players will receive 5 cards each
        ArrayList<ArrayList<Card>> playersHands = deck.distributeCards(3, 5);

        // Display each player's hand one by one
        for (int i = 0; i < playersHands.size(); i++) {
            System.out.println("Player " + (i + 1) + " Hand:");
            // Loop through each card in the player's hand
            for (Card card : playersHands.get(i)) {
                System.out.println(card); /
            }
            System.out.println(); 
        }
    }
}
