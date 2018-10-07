package pokerGameTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import game.Card;
import game.Deck;

public class DeckTest {

	@Test
	public void shuffleTest() {
		Deck deck = new Deck();
		Deck shuffleddeck = new Deck();
		shuffleddeck.shuffle();
		assertFalse(deck.equals(shuffleddeck));	
	}
	
	@Test
	public void deckSize() {
		Deck deck = new Deck();
		assertEquals(deck.getSize(), 52);

	}
	
	@Test
	public void suitsAreCorrectlyRanked() {
		Card card = new Card();
		card.bufferReadSuit();
		List<String> s = card.getSuitList();
		assertEquals(s.get(1), "C");
		assertEquals(s.get(2), "D");
		assertEquals(s.get(3), "H");
		assertEquals(s.get(4), "S");

	}
	
	@Test
	public void rankAreCorrectlyRanked() {
		Card card = new Card();
		card.bufferReadRank();
		List<String> r = card.getRankList();
		assertEquals(r.get(2), "2");
		assertEquals(r.get(3), "3");
		assertEquals(r.get(4), "4");
		assertEquals(r.get(5), "5");
		assertEquals(r.get(6), "6");
		assertEquals(r.get(7), "7");
		assertEquals(r.get(8), "8");
		assertEquals(r.get(9), "9");
		assertEquals(r.get(10), "10");
		assertEquals(r.get(11), "J");
		assertEquals(r.get(12), "Q");
		assertEquals(r.get(13), "K");
		assertEquals(r.get(14), "A");

	}
	

}
