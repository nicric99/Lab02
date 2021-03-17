package it.polito.tdp.alien;
import java.util.*;



public class Word {
	private String alienWord;
	private String translation;
	//HashMap<String,String> traduzioni= new HashMap<String,String>()
	ArrayList<String> traduzioni= new ArrayList<String>();

	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
		ArrayList<String> traduzioni= new ArrayList<String>();
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public void addWord(String s) {
		this.traduzioni.add(s);
	}
	/*public String getTraduzioni(HashMap<String, String> traduzione) {
		for (Entry<Integer, String> entry : testMap.entrySet()) {
		if (entry.getValue().equals("c")) {
        System.out.println(entry.getKey());
    }
	}}*/

	/*public void setTraduzioni(HashMap<String, String> traduzioni) {
		this.traduzioni = traduzioni;
	}*/

	public boolean equals(Word s) {
		boolean b=false;
		if(s.getAlienWord().equals(this.alienWord)) {
			b=true;
			return b;
		}
		else {
		return b;}

	}
	public boolean equals(String s) {
		boolean b=false;
		if(s.equals(this.alienWord)) {
			b=true;
			return b;
		}
		else {
		return b;}
		
	}
	public String toString() {
		return "AlienWord "+ this.alienWord + " Translation " + this.translation;
	}
	/*public String stringTraduzioni() {
		for(String s:traduzioni)
		
	}*/

}
