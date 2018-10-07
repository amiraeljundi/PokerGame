package game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		public void shuffle() {
			Card temp;
			for(int k=1; k<= 50;k++) {
				int rand1 = (int) (5 * Math.random());
				int rand2 = (int) (5 * Math.random());
						 
				temp = hand.get(rand1);
				hand.set(rand1, hand.get(rand2));
				hand.set(rand2, temp);
			}
		}
	}
