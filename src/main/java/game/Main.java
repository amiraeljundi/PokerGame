package game;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	

		
	public static void main(String args[]) {
		
		System.out.println("comp 4004 poker Game.");
		
		Poker poker = new Poker();
		Player player1 = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck.toString());
		
		for(int i = 0; i<5; i++) {
			player1.getHand().addCard(deck.deal());
			
		}
		
	}
	
	
}
