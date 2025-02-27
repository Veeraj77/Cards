# Cards
This project simulates a deck of cards with the following functionalities:

Creating a deck of 52 cards

Shuffling the deck

Displaying the deck

Selecting two random cards

Distributing cards to multiple players

Files Description


    1. Card.java

The Card class represents a single playing card.

  Attributes:

String rank : Stores the rank of the card (2, 3, ..., J, Q, K, A)

String suit : Stores the suit of the card (Spades, Hearts, Diamonds, Clubs)

  Methods:

Card(String rank, String suit) : Constructor to initialize card with rank and suit.

toString() : Returns the card's rank and suit in a readable format (e.g., "10 of Spades").





    2. Deck.java

The Deck class represents a deck of 52 cards.

  Attributes:

ArrayList<Card> deck : Stores the list of cards in the deck.

  Methods:

Deck() : Constructor to initialize an empty deck.

createDeck() : Creates a deck of 52 cards with different ranks and suits.

displayDeck() : Displays all cards in the deck.

shuffleDeck() : Shuffles the deck randomly.

randomCards() : Selects and displays two random cards from the deck.

distributeCards(int players, int cardsPerPlayer) : Distributes cards among players.

Parameters: Number of players and number of cards per player.

Returns: A list of player hands containing cards.






    3. Main.java

The Main class is the driver program to execute the functionality of the cards game.

Main Steps:

Create Deck

Display Deck

Shuffle Deck

Display Two Random Cards

Distribute Cards to Players
