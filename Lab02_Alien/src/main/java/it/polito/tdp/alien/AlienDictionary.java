package it.polito.tdp.alien;

import java.util.*;


public class AlienDictionary {
	private List<Word> dizionario;
//	private Map<String,Word> dizionario;

	public AlienDictionary() {
		this.dizionario= new ArrayList<>();
	}
	public void addWord(String alienWord,String translation) {
		Word parola= new Word(alienWord,translation);
		dizionario.add(parola);
	}
public boolean esisteParola(Word p) {
		boolean trovato=false;
		for(Word parola: this.dizionario) {
			if(p.equals(parola)) {
				trovato=true;
				break;
			}
		}
		return trovato;
		
	}
public void clearWord(Word p) {
	for (Word v:this.dizionario) {
		if(p.equals(v)) {
			this.dizionario.remove(v);
		}
	}
}
public String translateWord(String alienWord) {
	for (Word v:this.dizionario) {
		if(v.getAlienWord().equals(alienWord)) {
		return v.getTranslation();
		}
	}
	return(" Parola non ancora inserita ");
}
public void cancellaTutto() {
		dizionario.clear();
	
}
@Override
public String toString() {
	// posso direttamente chiamare il metodo to string della lista che è già implementata
	String s="";
	for (Word v:this.dizionario) {
		s=s+v.toString()+"\n";
	}
	return s;

}
}