package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String translation;

	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
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

}
