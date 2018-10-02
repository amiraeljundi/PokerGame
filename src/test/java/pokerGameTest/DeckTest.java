package pokerGameTest;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Deck;

public class DeckTest {

	@Test
	public void shuffleTest() {
		Deck deck = new Deck();
		Deck shuffleddeck = new Deck();
		shuffleddeck.shuffle();
		assertFalse(deck.equals(shuffleddeck));	
	}
	
	

}
