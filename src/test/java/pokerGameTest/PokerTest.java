package pokerGameTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
			Card card = new Card(j, i);
			player.getHand().addCard(card);
		}
		player.getHand().shuffle(); //shuffle the hand of the player then test to see it 
		//poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.royalFlush(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void straightFlushtest() {
		Poker poker = new Poker();
		Player player = new Player();
		Deck deck = new Deck();
		int j = 3;
		for(int i = 4; i<= 8; i++) {
			Card card = new Card(j, i);
			player.getHand().addCard(card);
		}
		player.getHand().shuffle(); //to shuffle the order of the cards then test
		//poker.sortByRank(player.getHand());
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
			Card card = new Card(i, 11);
			player.getHand().addCard(card);
		}
		Card c = new Card(1,7);
		player.getHand().addCard(c);
		player.getHand().shuffle(); //to shuffle the order of the cards then test
		//poker.sortByRank(player.getHand());
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
			Card card = new Card(i,10);
			player.getHand().addCard(card);
		}
		for(int j = 1; j<=2; j++) {
			Card card = new Card(j,9);
			player.getHand().addCard(card);
		}
		player.getHand().shuffle();
		//poker.sortByRank(player.getHand());
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
			Card card = new Card(2, j+1);
			j= j+i+1;
			player.getHand().addCard(card);
		}
		for(int i = 0; i<3; i++) {
			Card card = new Card(2, k-i);
			player.getHand().addCard(card);
		}
		player.getHand().shuffle();
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
			Card card = new Card(i, j--);
			player.getHand().addCard(card);
			
		}
		
		Card c = new Card(1,5);
		player.getHand().addCard(c);
		player.getHand().shuffle();
		//poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.Straight(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void threeOfAKindTest() {
		Poker poker = new Poker();
		Player player = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		
		for(int i = 1; i<4; i++) {
			Card card = new Card(i, 7);
			player.getHand().addCard(card);	
		}
		for(int i = 0; i<2; i++) {
			player.getHand().addCard(deck.deal());	
		}
		player.getHand().shuffle();
		//poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.threeOfAKind(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void twoPairTest() {
		Poker poker = new Poker();
		Player player = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		for(int i = 0; i<2; i++) {
			Card card = new Card(i+1, 4);
			player.getHand().addCard(card);	
		}
		for(int i = 1; i<3; i++) {
			Card card = new Card(i+1, 3);
			player.getHand().addCard(card);		
		}
		player.getHand().addCard(deck.deal());
		//poker.sortByRank(player.getHand());
		player.getHand().shuffle();
		//System.out.println(player.getHand().toString());
		boolean act = poker.twoPair(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}

	@Test
	public void pairTest() {
		Poker poker = new Poker();
		Player player = new Player();
	
		for(int i = 0; i<2; i++) {
			Card card = new Card(i+2,14);
			player.getHand().addCard(card);	
		}
		Card c = new Card(1,7);
		player.getHand().addCard(c);
		
		Card c1 = new Card(2,2);
		player.getHand().addCard(c1);
		
		Card c2 = new Card(3,9);
		player.getHand().addCard(c2);
		player.getHand().shuffle();
		//poker.sortByRank(player.getHand());
		//System.out.println(player.getHand().toString());
		boolean act = poker.pair(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);

	}
	
	@Test
	public void strategy27() {
		Poker poker = new Poker();
		Player player = new Player();
		int j = 2;
		for(int i = 11; i<= 14; i++) {
			Card card = new Card(j, i);
			player.getHand().addCard(card);
		}
		Card c = new Card(3,3);
		player.getHand().addCard(c);
		//poker.sortByRank(player.getHand());
		player.getHand().shuffle();
		//System.out.println(player.getHand().toString());
		boolean act = poker.oneAwayFromRoyalFlush(player.getHand());
		boolean ans = true;
	}
	
	@Test
	
	public void strategy29() {
		Poker poker = new Poker();
		Player player = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		for(int i = 1; i<4; i++) {
			Card card = new Card(i, 9);
			player.getHand().addCard(card);	
		}
		for(int i = 0; i<2; i++) {
			player.getHand().addCard(deck.deal());	
		}
		player.getHand().shuffle();
		//System.out.println(player.getHand());
		boolean act = poker.oneCardAwayFromFourOfAKind(player.getHand());
		boolean ans = true;
		assertEquals(ans,act);
	}
	
	
	@Test
	
	public void strategy33() {
		Poker poker = new Poker();
		Player player = new Player();
		Deck deck = new Deck();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		deck.shuffle();
		for(int i = 4; i<7; i++) {
			Card card = new Card(2, i);
			player.getHand().addCard(card);	
		}
		for(int j = 8; j<10; j++) {
			Card card = new Card(3, j);
			player.getHand().addCard(card);
		}
		player.getHand().shuffle();
		for(int k=0; k <= 4; k++) {
			if(player.getHand().getCard(k).getSuit() == 1) {
				count1 = count1 + 1;
			}
			if(player.getHand().getCard(k).getSuit() == 2) {
				count2 = count2 + 1;	
			}
			if(player.getHand().getCard(k).getSuit() == 3) {
				count3 = count3 + 1;	
			}
			if(player.getHand().getCard(k).getSuit() == 4) {
				count4 = count4 + 1;	
			}
		}
		
		int act;
		if(count1 == 3) {
			act = count1;
		}else if(count2 == 3) {
			act = count2;
		}else if(count3 == 3) {
			act = count3;
		}else {
			act = count4;
		}
		int ans = 3;
		assertEquals(act, ans);
				
	}
	
	@Test
	public void strategy34() {
		
		Poker poker = new Poker();
		Player player = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		for(int i = 1; i< 4; i++) {
			Card card = new Card(i, 7);
			player.getHand().addCard(card);	
		}
		Card card = new Card(3, 10);
		Card card1 = new Card(2, 4);
		player.getHand().addCard(card);
		player.getHand().addCard(card1);
		player.getHand().shuffle();
		
		int counter = 0;
			for(int i = 0; i< player.getHand().getSize(); i++) {
				counter=0;
				while(counter < 3) {
				for(int j = 0; j<player.getHand().getSize(); j++) {
					if(player.getHand().getCard(j).getRank() == player.getHand().getCard(i).getRank()) {
						counter++;
					}	
				}
			}
		}
		int act = 0;
		if(counter == 3) {
			act = counter;
		}
		int ans = 3;
		assertEquals(act, ans);
	
		}
	
	@Test
	public void strategy35() {
		Poker poker = new Poker();
		Player player = new Player();
		Deck deck = new Deck();
		deck.shuffle();
		int j = 4;
		for(int i = 2; i< 5; i++) {
			Card card = new Card(j-1, i);
			player.getHand().addCard(card);	
			j = j -1;	
		}
		int count = 0 ;
		Card card = new Card(3, 10);
		Card card1 = new Card(2, 5);
		player.getHand().addCard(card);
		player.getHand().addCard(card1);
		for(int k =0; k< 4; k++) {
			if( (player.getHand().getCard(k).getRank() +1) == player.getHand().getCard(k+1).getRank()){
				count = count +1;	
			}
		}
		int act = 0;
		if(count == 2) {
			act = count;
		}
		int ans = 2;
		assertEquals(act, ans);
	}








}
