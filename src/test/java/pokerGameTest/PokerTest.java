package pokerGameTest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import game.Card;
import game.Deck;
import game.Hand;
import game.Player;
import game.Poker;

public class PokerTest {

	@Test
	public void royalFlushtest() {
		Poker poker = new Poker();
		Player player = new Player();
		int j = 2;
		for(int i = 10; i<= 14; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(j, i);
			player.getHand().addCard(card);
		}
		
		poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.royalFlush(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);
		
		
	}
	
	@Test
	public void straightFlushtest() {
		Poker poker = new Poker();
		Player player = new Player();
		int j = 3;
		for(int i = 4; i<= 8; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(j, i);
			player.getHand().addCard(card);
		}
		
		poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.StraightFlush(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void fourOfAKindtest() {
		Poker poker = new Poker();
		Player player = new Player();
		for(int i = 1; i<=4; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(i, 11);
			player.getHand().addCard(card);
		}
		Card c = new Card();
		c.bufferReadRank();
		c.bufferReadSuit();
		c.creatCard(1, 7);
		player.getHand().addCard(c);
		
		poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.fourOfAKind(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void fullHouseTest() {
		Poker poker = new Poker();
		Player player = new Player();
		for(int i = 1; i<=3; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(i, 10);
			player.getHand().addCard(card);
		}
		for(int j = 1; j<=2; j++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(j, 9);
			player.getHand().addCard(card);
		}
		
		poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.fullHouse(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void flushTest() {
		Poker poker = new Poker();
		Player player = new Player();
		int j = 3;
		int k = 8;
		for(int i = 0; i<2; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(2, j+1);
			j= j+i+1;
			player.getHand().addCard(card);
		}
		for(int i = 0; i<3; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(2, k-i);
			
			player.getHand().addCard(card);
		}
		//poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.flush(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void straightTest() {
		Poker poker = new Poker();
		Player player = new Player();
		int j = 9;
		for(int i = 1; i<=4; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(i , j--);
			player.getHand().addCard(card);
			
		}
		
		Card c = new Card();
		c.bufferReadRank();
		c.bufferReadSuit();
		c.creatCard(1, 5);
		player.getHand().addCard(c);
		

		poker.sortByRank(player.getHand());
		//poker.sortBySuit(player.getHand());
		System.out.println(player.getHand().toString());
		boolean act = poker.flush(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}


}
