package it.polito.tdp.alien;
import java.util.*;
public class TestWord {

	public static void main(String[] args) {
		// prova per il metodo equals di word
		 Word p= new Word("Alla","Fine");
		 Word s= new Word ("Allaa","meme");
		 Word r= new Word("Alla","Betto");
		 if(p.equals(s))
			 System.out.println("Sono parole uguali");
		 
		AlienDictionary dizionario= new AlienDictionary();
		dizionario.addWord("Alla", "Dine");
		dizionario.addWord("aba", "err");
		Word pi= new Word("Alla", "Diner");
		System.out.println(dizionario.toString());
		dizionario.clearWord(pi);
		System.out.println(dizionario.toString());
		
		System.out.println("Traduzione "+dizionario.translateWord("aba"));
		System.out.println(dizionario.esisteParola(pi));
		dizionario.addWord(p);
		p.addWord(p.getTranslation());
		dizionario.multipleTranslation(pi);
		System.out.println(p.traduzioni.toString());
		//p.addWord();
		//s.addWord();
		//System.out.println(s.getTraduzioni());
		
		/*dizionario.multipleTranslation(s);
		dizionario.multipleTranslation(p);
		dizionario.multipleTranslation(r);
		Word parola= new Word("All", "gore");
		System.out.println(dizionario.multipleTranslation(s));*/
		
	
	}
}
