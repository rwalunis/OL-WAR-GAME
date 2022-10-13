package war;

public class Card {
	//These are the fields of Card: value can be seen as rank hierarchy, and the name are just the suits of the card.
	private int value;
	private String name; //DO/UPDATE THISSSSSSSSSSSSS*********
	
	/*Since, there is 52 cards in a deck, you can divide by 13, which will give you the 4 suits, the operand
	 * operates in the same manner, except prints out the index of the array in a circular manner.
	 */
	public Card(int value, String suit) { //DO THISSSSSSSSS*********CHANGE YOUR CONSTRUCTOR

		switch (value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;

		}
		name += " of " + suit;
		this.value = value;
	}
	//Method used to get the suits
	public String getName() { //DO THISSSSSSSSSSSSSSSSSSSSSSSSSSS
		return name;
	}
	//Method used to get the rank
	public int getValue() {
		return value;
	}
	//I am able to use this toString method to print out the 26 cards of a hand, and was originally being used for the describe()**
	/*public String toString() {
		String [] names = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		return "This card is the: " + values[this.getValue()] + " of " + names[this.getName()];
}*/
	
//	public void describeCard() {
//		String [] names = {"Clubs", "Spades", "Diamonds", "Hearts"};
//		String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//		System.out.println("This card is the: " + values[this.getValue()] + " of " + names[this.getName()]);
//	} DOOOOO THISSS COMMENT IT OUTTTTTTTTTTTTTT
	
//DO/UPDATE AND CHANGE THISSSSSSSSSSSSSSSS	
	public void describeCard() {
		System.out.println("Card name: " + getName() + ", Card Value: " + getValue());
	}
	
}
