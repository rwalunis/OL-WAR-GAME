package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	/*
	 * Fields set for the player, their personal hand, score, and name.
	 */
	private List<Card> hand = new ArrayList<Card>(); //DOOOO THISSSSSSSSSSSSS*************
	private int score;
	private String playerName;
	/*
	 * Creating the getters and setters when the playerName and score are instantiated in the App class
	 */
	public Player(String playerName, int score) {
	//	this.setPlayerName(playerName);
	//	this.setScore(score);
		this.playerName = playerName;
		this.score = 0;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	/*
	 * Method used to print out the info about each player, their score, and each card in the hand list
	 * !!!!This method is currently only printing the first player's name!!!!!!!!
	 */
	public void describePlayer() {
		System.out.println(playerName + " has a score of " + score);
		//System.out.println(playerName + " has a score of " + score);
		for (Card card : hand) {
			card.describeCard();
		}
	}
	/*
	 * Method used for each player to flip the top card from the hand list to see, which will win in the war
	 */
	public Card flipCard() {
		Card flippedCard = this.hand.get(0);
		this.hand.remove(0);
		return flippedCard;
	}
	/*
	 * Method used to draw cards from the instantiated deck in the App class
	 */
	public void drawCard(Deck deck) {
		//this.hand.add(deck.drawCard());
		hand.add(deck.drawCard());
		}
	/*
	 * Method used to increment the score of the player who wins each round of War
	 */
	public void incrementScore(int score) {
		this.score += 1;
	}
}
