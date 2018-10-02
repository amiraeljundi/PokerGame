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
	
	protected  List<String> cards;
	
	public Deck() {
		
		cards = new ArrayList<String>();
		
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/amirajundi/Desktop/comp4004/pokerGame/deck.txt"));
			while(strLine != null) {
				strLine = br.readLine();
				sb.append(strLine);
				sb.append(System.lineSeparator());
				//strLine = br.readLine();
				if(strLine == null){
					break;
				}else {
					cards.add(strLine);
				}
			}
			System.out.println(Arrays.toString(cards.toArray()));
			System.out.println(cards.size());
			br.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("File not found");
		}catch(IOException e) {
			System.err.println("unable to read the file.");
		}
	}
	
	public List<String> getDeckList(){
		
		return cards;
	}
	

		
}
