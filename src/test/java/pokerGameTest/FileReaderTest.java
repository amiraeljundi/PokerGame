package pokerGameTest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import game.Deck;

public class FileReaderTest {

	@Test
	public void fileReaderTest() {
		Deck deck= new Deck();
		List<String> dcards = new ArrayList<String>();
		dcards.add("SK");
		dcards.add("SQ");
		dcards.add("SJ");
		dcards.add("S10");
		dcards.add("S9");
		dcards.add("S8");
		dcards.add("S7");
		dcards.add("S6");
		dcards.add("S5");
		dcards.add("S4");
		dcards.add("S3");
		dcards.add("S2");
		dcards.add("SA");
		dcards.add("CK");
		dcards.add("CQ");
		dcards.add("CJ");
		dcards.add("C10");
		dcards.add("C9");
		dcards.add("C8");
		dcards.add("C7");
		dcards.add("C6");
		dcards.add("C5");
		dcards.add("C4");
		dcards.add("C3");
		dcards.add("C2");
		dcards.add("CA");
		dcards.add("HK");
		dcards.add("HQ");
		dcards.add("HJ");
		dcards.add("H10");
		dcards.add("H9");
		dcards.add("H8");
		dcards.add("H7");
		dcards.add("H6");
		dcards.add("H5");
		dcards.add("H4");
		dcards.add("H3");
		dcards.add("H2");
		dcards.add("HA");
		dcards.add("DK");
		dcards.add("DQ");
		dcards.add("DJ");
		dcards.add("D10");
		dcards.add("D9");
		dcards.add("D8");
		dcards.add("D7");
		dcards.add("D6");
		dcards.add("D5");
		dcards.add("D4");
		dcards.add("D3");
		dcards.add("D2");
		dcards.add("DA");
		
		assertTrue(dcards.equals(deck.getDeckList()));
		
		
		//fail("Not yet implemented");
	}

}
