package game;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Card {
	
    public static final int SPADE   = 4;
    public static final int HEART   = 3;
    public static final int CLUB    = 2;
    public static final int DIAMOND = 1;
	
    private int cardSuit;
    private int cardRank; 
	
    private List<String> suit;
    private List<String> rank;
        
    public Card() {
    	suit = new ArrayList<String>();
    	rank = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
   
	public void bufferReadRank() {
    	StringBuilder sb = new StringBuilder();
		String strLine = "";
    	
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/amirajundi/Desktop/comp4004/pokerGame/rank.txt"));
			while(strLine != null) {
				strLine = br.readLine();
				sb.append(strLine);
				sb.append(System.lineSeparator());
				//strLine = br.readLine();
				if(strLine == null){
					break;
				}else {
					rank.add(strLine);
				}
			}
			//System.out.println(Arrays.toString(rank.toArray()));
			//System.out.println(rank.size());
			br.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("File not found");
		}catch(IOException e) {
			System.err.println("unable to read the file.");
		}
    }
    
    public void bufferReadSuit() {
    	
    	StringBuilder sb = new StringBuilder();
		String strLine = "";
    	
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/amirajundi/Desktop/comp4004/pokerGame/suit.txt"));
			while(strLine != null) {
				strLine = br.readLine();
				sb.append(strLine);
				sb.append(System.lineSeparator());
				//strLine = br.readLine();
				if(strLine == null){
					break;
				}else {
					suit.add(strLine);
				}
			}
			//System.out.println(Arrays.toString(suit.toArray()));
			//System.out.println(suit.size());
			br.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("File not found");
		}catch(IOException e) {
			System.err.println("unable to read the file.");
		}
    }
    
    public void creatCard(int s, int r) {
  
    	
    	if(r == 1) {
    		cardRank = 14;
    	}else
    	{
    		cardRank = r;
    		cardSuit = s;
    	}
    }
    
    public List<String> getSuitList(){
    	return suit;
    }
    
    public List<String> getRankList(){
    	return rank;
    }

    public int getSuit() {
    	return cardSuit;
    }
    
    public String suitString() {
    	return String.valueOf(suit.get(cardSuit));
    }
    
    public int getRank() {
    	return this.cardRank;
    }
    
    public String rankString() {
    	
    	return String.valueOf(rank.get(cardRank));
    }
    
    public String toString() {
    	return String.valueOf(rank.get(cardRank)) + String.valueOf(suit.get(cardSuit));
    }
}
