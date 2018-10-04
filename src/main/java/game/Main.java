package game;

import java.util.ArrayList;
import java.util.List;

public class Main {

		
	public static void main(String args[]) {
		
		System.out.println("comp 4004 poker Game.");
		Deck deck = new Deck();
		Poker poker = new Poker();
		deck.shuffle();
		System.out.println(deck.toString());
		Player player1 = new Player();
		for(int i = 0; i<5; i++) {
			player1.getHand().addCard(deck.deal());
			
		}
		
		//System.out.println(player1.getHand().getCard(x));
		
		System.out.println(player1.getHand().toString());
		player1.getHand().setCard(deck.deal(), 0);
		System.out.println(player1.getHand().toString());
		poker.sortByRank(player1.getHand());
		System.out.println(player1.getHand().toString());
		
	
	}
	
	
}
