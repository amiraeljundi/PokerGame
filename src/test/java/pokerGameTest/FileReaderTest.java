package pokerGameTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import game.Card;
import game.Deck;

public class FileReaderTest {

	@Test
	public void fileReaderSuitTest() {
		Card card = new Card(0,0);
		//card.bufferReadSuit();
		List<String> suit = new ArrayList<String>();
		suit.add("*");
		suit.add("C");
		suit.add("D");
		suit.add("H");
		suit.add("S");
		
		assertTrue(suit.equals(card.getSuitList()));
		//fail("Not yet implemented");
	}
	
	@Test
	public void fileReaderRankTest() {
		Card card = new Card(0,0);
		//card.bufferReadRank();
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
		
		assertTrue(rank.equals(card.getRankList()));
	}

}
