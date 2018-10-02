package game;

import java.util.ArrayList;
import java.util.List;

public class Main {

		
	public static void main(String args[]) {
		
		System.out.println("comp 4004 poker Game.");

		
		//System.out.println(card.getRankList());
		
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck.toString());
		Player player1 = new Player();
		//Hand hand = new Hand();
		//hand.addCard(deck.deal());
		//System.out.println(hand.getSize());
		//hand.setCard(deck.deal(), 0);
		//System.out.println(hand.getCard(0));

		for(int i = 0; i<5; i++) {
			player1.getHand().addCard(deck.deal());
		}
		
		System.out.println(player1.getHand().toString());
		player1.getHand().setCard(deck.deal(), 0);
		System.out.println(player1.getHand().toString());
		 //System.out.println("player 1: " + player1.getHand());
		//deck.toString();
		//System.out.println(deck.getCard(1));
		
	}
	
	
}
