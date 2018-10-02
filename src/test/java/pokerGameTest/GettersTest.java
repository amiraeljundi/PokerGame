package pokerGameTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import game.Card;

public class GettersTest {
	


	@Test
	public void getSuitListTest() {
		List<String> suit = new ArrayList<String>();
		suit.add("*");
		suit.add("D");
		suit.add("C");
		suit.add("H");
		suit.add("S");
		
		Card card = new Card();
		card.bufferReadSuit();
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
		
		Card card = new Card();
		card.bufferReadRank();
		assertTrue(rank.equals(card.getRankList()));
	}
	
	@Test
	public void getSuitTest() {
		Card card = new Card();
		card.creatCard(3, 7);
		int ER = 3; 
		int AR = card.getSuit();
		assertEquals(ER, AR);
	}
	
	@Test
	public void getRankTest() {
		Card card = new Card();
		card.creatCard(3, 7);
		int ER1 = 7;
		int AR1 = card.getRank();
		assertEquals(ER1, AR1);
	}
	
//	@Test
//	public void suitStringTest() {
//		Card card = new Card(3,7);
//		
//		String ER = "H";
//		String AR = card.suitString();
//		assertEquals(ER, AR);
//	}

}
