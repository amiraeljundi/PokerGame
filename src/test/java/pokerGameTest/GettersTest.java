package pokerGameTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import game.Card;
import game.Deck;
import game.Hand;
import game.Player;

public class GettersTest {
	


	@Test
	public void getSuitListTest() {
		List<String> suit = new ArrayList<String>();
		suit.add("*");
		suit.add("D");
		suit.add("C");
		suit.add("H");
		suit.add("S");
		
		Card card = new Card(0,0);
		assertTrue(suit.equals(card.getSuitList()));
	
	}
	
	@Test
	public void getRankListTest() {

		List<String> rank = new ArrayList<String>();
		rank.add("*");
		rank.add("*");
		rank.add("2");
		rank.add("3");
		rank.add("4");
		rank.add("5");
		rank.add("6");
		rank.add("7");
		rank.add("8");
		rank.add("9");
		rank.add("10");
		rank.add("J");
		rank.add("Q");
		rank.add("K");
		rank.add("A");
		
		Card card = new Card(0,0);
		assertTrue(rank.equals(card.getRankList()));
	}
	
	@Test
	public void getSuitTest() {
		Card card = new Card(3,7);
		int ER = 3; 
		int AR = card.getSuit();
		assertEquals(ER, AR);
	}
	
	@Test
	public void getRankTest() {
		Card card = new Card(3,7);
		int ER1 = 7;
		int AR1 = card.getRank();
		assertEquals(ER1, AR1);
	}
	
	@Test
	public void getSizeTestinHandClass() {
		Deck deck = new Deck();
		Hand hand = new Hand();
		hand.addCard(deck.deal());
		hand.addCard(deck.deal());
		hand.addCard(deck.deal());
		int EV = 3;
		int AV = hand.getSize();
		assertEquals(EV,AV);
			
	}
	
	@Test
	public void getCardTestinHandClass() {
		Deck deck = new Deck();
		Hand hand = new Hand();
		Card card1 = new Card(3,7);
		Card card2 = new Card(1,12);
		Card card3 = new Card(2,8);
		Card card4 = new Card(4,13);
		Card card5 = new Card(1,1);
		
		
		hand.addCard(card1);
		hand.addCard(card2);
		hand.addCard(card3);
		hand.addCard(card4);
		hand.addCard(card5);
		
		assertTrue(hand.getCard(0).equals(card1));
		assertTrue(hand.getCard(1).equals(card2));
		assertTrue(hand.getCard(2).equals(card3));
		assertTrue(hand.getCard(3).equals(card4));
		assertTrue(hand.getCard(4).equals(card5));
	}
	
	@Test
	public void getPlayerHandTest() {
		Hand hand = new Hand();
		Player player1 = new Player();
		
		Card card1 = new Card(3,7);
		Card card2 = new Card(1,12);
		Card card3 = new Card(2,8);
		Card card4 = new Card(4,13);
		Card card5 = new Card(1,1);
		
		
		player1.getHand().addCard(card1);
		player1.getHand().addCard(card2);
		player1.getHand().addCard(card3);
		player1.getHand().addCard(card4);
		player1.getHand().addCard(card5);
		
		hand.addCard(card1);
		hand.addCard(card2);
		hand.addCard(card3);
		hand.addCard(card4);
		hand.addCard(card5);
		
		List<Card> exp = new ArrayList<Card>();
		List<Card> act = new ArrayList<Card>();
		
		for(int i = 0; i<5; i++) {
			
			exp.add(hand.getCard(i));
			act.add(player1.getHand().getCard(i));
			
		}
		
		assertEquals(exp,act);	
	}

}
