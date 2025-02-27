// card.java

class Card{
	String rank;
	String suit;

	public Card(String rank,String suit){
		this.rank=rank;// Assigning rank to the card
		this.suit=suit;// Assigning suit to the card
	}

	public String toString(){
		return rank + " of " + suit;
	}
}
