package game;

import java.util.ArrayList;
import java.util.List;

public class Main {

		
	public static void main(String args[]) {
		
		System.out.println("comp 4004 poker Game.");
		Card card = new Card(4,3);
		card.bufferReadRank();
		card.bufferReadSuit();
		card.toString();
		System.out.println(card);
//		Deck deck = new Deck();
//		Hand hand = new Hand();
//		hand.dealAHand();
//		List<String> dcards = new ArrayList<String>();
//		
//		
	}
	
	
}
