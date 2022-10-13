package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Field representing the cards in a deck
	 List<Card> deck;
	
	 public Deck() {  //DO THISSSSSSSSSSSSSSSS********CHANGE YOUR CONSTRUCTOR
			deck = new ArrayList<Card>();
			for (int i = 2; i < 15; i++) {
				Card card = new Card(i, "Diamonds");
				deck.add(card);
			}
			for (int i = 2; i < 15; i++) {
				Card card = new Card(i, "Hearts");
				deck.add(card);
			}
			for (int i = 2; i < 15; i++) {
				Card card = new Card(i, "Spades");
				deck.add(card);
			}
			for (int i = 2; i < 15; i++) {
				Card card = new Card(i, "Clubs");
				deck.add(card);
			}

		}
	
	//Method used to add the cards created under the Card class to the deck
	public void addCard(Card card) {
		this.deck.add(card);
	}
	//Method used to deal out the cards to the two players without giving identical cards
	public Card drawCard() {
	//	Card drawnCard = this.deck.get(0);
	//	this.deck.remove(drawnCard);
		Card drawnCard = deck.get(0);
		deck.remove(drawnCard);
		return drawnCard;
}
	//Simple method that will just shuffle the order of the deck
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
}

	
        

