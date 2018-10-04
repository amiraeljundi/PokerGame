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
		//Deck deck = new Deck();
		Poker poker = new Poker();
		Player player = new Player();
		//System.out.println(deck.toString());
		
		
		int j = 2;
		for(int i = 10; i<= 14; i++) {
			Card card = new Card();
			card.bufferReadRank();
			card.bufferReadSuit();
			card.creatCard(j, i);
			player.getHand().addCard(card);
		}
		
		poker.sortByRank(player.getHand());
		
		System.out.println(player.getHand().toString());
		
		boolean act = poker.royalFlush(player.getHand());
		boolean ans = true;
		
		assertEquals(ans,act);
		
		
	}

}
