import java.util.*; // Importing required libraries


class Deck {

    ArrayList<Card> deck; // List to store deck of cards

    // Constructor to initialize deck
    public Deck() {
        deck = new ArrayList<>();
    }

    
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"}; // Ranks of cards
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; // Suits of cards

        // Nested loop to generate all 52 cards (13 ranks × 4 suits)
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit)); // Adding each card to the deck
            }
        }
    }

   
    public void displayDeck() {
        for (Card card : deck) { // Loop through all cards
            System.out.println(card); // Print each card
        }
    }

    /**
     * Method to shuffle the deck randomly using Collections.shuffle().
     */
    public void shuffleDeck() {
        Collections.shuffle(deck); // Shuffling deck
    }

   
    public void randomCards() {
        Random random = new Random(); // Random object for generating random numbers
        Card card1 = deck.get(random.nextInt(deck.size())); // Select first random card
        Card card2 = deck.get(random.nextInt(deck.size())); // Select second random card
        System.out.println("Random Card 1: " + card1); // Print first card
        System.out.println("Random Card 2: " + card2); // Print second card
    }

  
    public ArrayList<ArrayList<Card>> distributeCards(int players, int cardsPerPlayer) {
        ArrayList<ArrayList<Card>> playersHands = new ArrayList<>(); // List of player hands

        // Initializing each player's hand with an empty list
        for (int i = 0; i < players; i++) {
            playersHands.add(new ArrayList<>());
        }

        // Distribute cards to players
        for (int i = 0; i < cardsPerPlayer; i++) { // Loop through cards per player
            for (int j = 0; j < players; j++) { // Loop through players
                if (!deck.isEmpty()) { // Check if deck is not empty
                    playersHands.get(j).add(deck.remove(0)); // Assign card to player and remove from deck
                }
            }
        }

        return playersHands; 
    }
}


