package game;

public class Poker {

	
	public Poker() {
	
	}

	public void sortBySuit(Hand h) {
		
		int i, j, min_j;
		
		for( i= 0; i<h.getSize(); i++) {
			min_j = i;
			for( j = i+1; j<h.getSize(); j++) {
				if(h.getCard(j).getSuit()< h.getCard(min_j).getSuit()) {
					min_j = j;
				}
			}
			
		Card help = h.getCard(i);
		h.setCard(h.getCard(min_j), i);
		h.setCard(help, min_j);
		}
		
	}
	
	public void sortByRank(Hand h) {
		int i, j, min_j;	
		
		for ( i = 0 ; i < h.getSize() ; i ++ )
	      {
	         min_j = i;  
	         for ( j = i+1 ; j < h.getSize() ; j++ )
	         {
	            if ( h.getCard(j).getRank() > h.getCard(min_j).getRank() )
	            {
	               min_j = j; 
	            }
	         }
	         
	         Card help = h.getCard(i);
	 		h.setCard(h.getCard(min_j), i);
			h.setCard(help, min_j);
			}
	}
	
	public boolean royalFlush(Hand h) {
		for(int i =0; i< h.getSize(); i++) {
			if(h.getCard(i).getSuit() == h.getCard(i+1).getSuit()) {
				if(h.getCard(i).getRank() >= 10) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean StraightFlush(Hand h) {
		for(int i = 0; i <= h.getSize(); i++) {
			if(h.getCard(i).getSuit() == h.getCard(i+1).getSuit()) {
				for(int j =0; j< h.getSize(); j++) {
					if( Math.abs( h.getCard(j).getRank() - h.getCard(j+1).getRank() ) <=4 ) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean fourOfAKind(Hand h) {
		
		int counter = 0;
		for(int i = 0; i< h.getSize(); i++) {
			counter = 0;
			for(int j = 0; j<h.getSize(); j++) {
				if(h.getCard(j).getRank() == h.getCard(i).getRank()) {
					counter++;
				}
			}
			if(counter >= 4) {
				return true;
			}
		}
		return false;
	}
		
	public boolean fullHouse(Hand h) {
		
		if(threeOfAKind(h) == true && pair(h) == true) {
			return true;
		}
		else {
			return false;
		}
	
	}

	public boolean flush(Hand h) {
		
		for(int i = 1; i<h.getSize(); i++) {
			if(h.getCard(0).getSuit() != h.getCard(i).getSuit()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean Straight(Hand h) {
		
	for(int i = 0; i <= h.getSize(); i++) {
		
			for(int j =0; j< h.getSize(); j++) {
				if( Math.abs( h.getCard(j).getRank() - h.getCard(j+1).getRank() ) <=4 ) {
					return true;
			
			}
		}
	}
	return false;
}
	
	public boolean threeOfAKind(Hand h) {
		
		int counter = 0;
		for(int i = 0; i< h.getSize(); i++) {
			counter = 0;
			for(int j = 0; j<h.getSize(); j++) {
				if(h.getCard(j).getRank() == h.getCard(i).getRank()) {
					counter++;
				}
			}
			if(counter >= 3) {
				return true;
			}
		}
		return false;
	}
	
	public boolean twoPair(Hand h) {
		
		int counter = 0;
		for(int i = 0; i< h.getSize(); i++) {
			counter = 0;
			for(int j = 0; j<h.getSize(); j++) {
				if(h.getCard(j).getRank() == h.getCard(i+1).getRank()) {
					counter++;
				}
			}
			if(counter == 2 ) {
				return true;
			}
		}
		return false;
	}
	
	public boolean pair(Hand h) {
		
		int counter = 0;
		for(int i = 0; i< h.getSize(); i++) {
			counter = 0;
			for(int j = 0; j<h.getSize(); j++) {
				if(h.getCard(j).getRank() == h.getCard(i).getRank()) {
					counter++;
				}
			}
			if(counter == 2) {
				return true;
			}
		}
		return false;
	}

	public boolean oneAwayFromRoyalFlush(Hand h) {
		int count = 0;
		for(int i =0; i< h.getSize(); i++) {
			if(h.getCard(0).getSuit() == h.getCard(i).getSuit()) {
				if(h.getCard(i).getRank() >= 10) {
					count = count + 1;
				}
			}
		
		}
		if(count == 3) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean oneCardAwayFromFourOfAKind(Hand h) {
		if(threeOfAKind(h)== true) {
			System.out.println("you are one card away from four of a kind.");
			return true;
		}
		else {
			return false;
		}
		
	}

	
}