package war;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to the game of war!");
		
		int numberOfCards = 52;
		Player playerUno = new Player("Jackie", 0);
			
	//	playerUno.describePlayer();
		Player playerDos = new Player("Daytona", 0);
		
			Deck deck = new Deck();
			deck.shuffle();
			
			for(int i = 0; i < 52; i++) {
				if(i % 2 == 0) {
					playerUno.drawCard(deck);
				}
				else {
					playerDos.drawCard(deck);
				}
			}
			
			playerDos.describePlayer();
			
		/*	for(int i = 0; i < 52; i++) {
				Card card = new Card(i);
				deck.addCard(card);
				card.describeCard();
			}*/
	
			
		
		//deck isn't shuffling
//		deck.shuffle();
		
		//Printing out PlayerUno twice
	//	playerUno.describePlayer();
		
		
			
		}
		
		
	}

