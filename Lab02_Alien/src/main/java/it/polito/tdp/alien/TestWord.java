package it.polito.tdp.alien;
import java.util.*;
public class TestWord {

	public static void main(String[] args) {
		// prova per il metodo equals di word
		 Word p= new Word("Alla","Fine");
		 Word s= new Word ("Allaa","meme");
		 if(p.equals(s))
			 System.out.println("Sono parole uguali");
		 
		AlienDictionary dizionario= new AlienDictionary();
		dizionario.addWord("Alla", "Dine");
		dizionario.addWord("aba", "err");
		Word pi= new Word("Alla", "Dine");
		System.out.println(dizionario.toString());
		dizionario.clearWord(pi);
		System.out.println(dizionario.toString());
	
	}
}
