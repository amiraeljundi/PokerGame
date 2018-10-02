package game;

import java.util.ArrayList;
import java.util.List;

public class Hand {

		private List<Card> hand;
		public static final int handSize = 5;
		
		public Hand() {
			
			hand = new ArrayList<Card>(handSize);
			
		}
		
		public int getSize() {
			return hand.size();
		}
		
		public void addCard(Card c) {
			hand.add(c);
		}
		
		public Card getCard(int x) {
			return hand.get(x);
		}
		
		public void setCard(Card y,int x) {
			 hand.set(x, y);
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (Card s : hand)
			{
			    sb.append(s);
			    //sb.append(System.lineSeparator());
			    sb.append(" ");
			}
			return sb.toString();
		}
}
