package game;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Deck {

	private List<Card> deckOfCards;
	public static final int nCards = 52;
	private int currentCard;
	
	public Deck() {
		
		deckOfCards= new ArrayList<Card>(nCards);
		int i = 0;
		for(int suit = Card.DIAMOND; suit <= Card.SPADE; suit++) {
			for(int rank = 2; rank <= 14; rank++) {
				Card card = new Card();
				card.bufferReadRank();
				card.bufferReadSuit();
				card.creatCard(suit, rank);
				//System.out.println(card.rankString());
				deckOfCards.add(i, card);
				//System.out.println(deckOfCards.get(i));
				i++;		
			}	
		}
		currentCard=0;
		//System.out.println(deckOfCards.size());
	}
	
	
	public void shuffle() {
		Card temp;
		for(int k=1; k<= 1000;k++) {
			int rand1 = (int) (nCards * Math.random());
			int rand2 = (int) (nCards * Math.random());
					 
			temp = deckOfCards.get(rand1);
			deckOfCards.set(rand1, deckOfCards.get(rand2));
			deckOfCards.set(rand2, temp);
		}
//		for (int i = 0; i< deckOfCards.size();i++) {
//			System.out.println(deckOfCards.get(i));
//		}
//		System.out.println();
//		System.out.println(deckOfCards.size());
		currentCard = 0;

	}
	
	public Card deal() {
		if( currentCard < nCards) {
			return (deckOfCards.get(currentCard++));
			
		}
		else {
			System.out.println("Out of cards");
			return null;
		}
	}
	
	public String toString() {
		String s = "";
		int k = 0;
		for(int i =0; i<4;i++) {
			for(int j=1; j<=13; j++) {
				s+= (deckOfCards.get(k++)+ " ");
			}
			s+= "\n";
		}
		
		return (s);
	}
	
	

}
	

	

