package it.polito.tdp.alien;

import java.net.URL;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXMLController {
AlienDictionary dizionario= new AlienDictionary();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;


    @FXML
    private Button btnTranslate;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    		dizionario.cancellaTutto();
    		txtResult.setText("Dizionario cancellato ");
    	 }

    @FXML
    void doTranslate(ActionEvent event) {
    	String stringa= txtWord.getText();
    	
    	
    	if(stringa.isEmpty()) {
    		txtResult.setText("Riga non valida");
    		return;
    	}
    	
    	if(stringa.contains(" ")){
    		stringa.toLowerCase();
        	String[] parts = stringa.split(" ");
        	String part1 = parts[0]; 
        	String part2 = parts[1];
        	if(part1.matches("^[a-zA-Z]*$") && part2.matches("^[a-zA-Z]*$")) {
        	txtResult.setText(part1+part2);
        	Word parola= new Word(part1, part2);
        	if(dizionario.esisteParola(parola)){
        		txtResult.setText("Esiste");
        		}
        	else {
        	dizionario.addWord(part1, part2);
        	txtResult.setText(dizionario.toString());
        	}
        }
        	else {
        		txtResult.setText("Parola scritta male");
        	}
    	}
    	else {
    		 if(stringa.matches("^[a-zA-Z]*$")) {
    			 stringa.toLowerCase();
    			 txtResult.setText("La traduzione è : "+dizionario.translateWord(stringa));
    		 }
    		 else {
    			 txtResult.setText("Parola scritta male ");
    		 }
    		
    	}
   }
    	

    @FXML
    void initialize() {
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
