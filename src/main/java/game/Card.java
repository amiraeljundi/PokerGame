package game;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Card {
	
    private byte cardSuit;
    private byte cardRank; 
	
    private List<String> suit;
    private List<String> rank;
   
    
    public Card(int s, int r) {
    	
    	suit = new ArrayList<String>();
    	rank = new ArrayList<String>();
    	
    	if(r == 1) {
    		cardRank = 14;
    	}else
    	{
    		cardRank =(byte) r;
    		cardSuit =(byte) s;
    	}
    }
        
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
			System.out.println(Arrays.toString(rank.toArray()));
			System.out.println(rank.size());
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
			System.out.println(Arrays.toString(suit.toArray()));
			System.out.println(suit.size());
			br.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("File not found");
		}catch(IOException e) {
			System.err.println("unable to read the file.");
		}
    }
    
    public List<String> getSuitList(){
    	return suit;
    }
    
    public List<String> getRankList(){
    	return rank;
    }

    public int getSuit() {
    	return this.cardSuit;
    }
    
    public String suitString() {
    	return this.suit.get(this.cardSuit);
    }
    
    public int getRank() {
    	return this.cardRank;
    }
    
    public String rankString() {
    	
    	return this.rank.get(this.cardRank);
    }
    
    public String toString() {
    	return this.rank.get(cardRank)+ this.suit.get(cardSuit);
    }
}
