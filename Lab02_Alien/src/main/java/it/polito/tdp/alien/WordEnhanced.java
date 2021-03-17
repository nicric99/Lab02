package it.polito.tdp.alien;
import java.util.*;

public class WordEnhanced {
	private String alienWord;
	private HashMap<String,String> traduzioni= new HashMap<String,String>();
	public WordEnhanced(String alienWord) {
		this.alienWord=alienWord;
	}
	public void addWord(String s) {
		this.traduzioni.put(s,this.alienWord);
	}
	
}
