package ui;

import java.util.Observable;
import game.NumberGame;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller of GuessingGameUI that handle button and text fields events.
 * @author Charin Tantrakul 
 *
 */
public class GuessingGameController{
	@FXML
    Button  enterBT;
	@FXML
	Button clearBT;
	@FXML
	TextField Textfield;
	@FXML
	Label hints;

	private NumberGame game;
	public int userNumber;
	
	/**
	 * Add NumberGame to GUI.
	 * @param game NumberGame that want to use.
	 */
	public void setGame(NumberGame game){
		this.game = game;
	}
	
	/**
	 * Perform action to enter button. 
	 * @param event
	 */
	public void handleEnter(ActionEvent event) {
		try{
		userNumber = Integer.parseInt(Textfield.getText().trim());
		game.guess(userNumber);
		hints.setText(game.getMessage());
		}
		catch(NumberFormatException e) {
			hints.setText("Please put the number");
		}
		
	}
	
	/**
	 * Perform action to clear button.
	 * @param event
	 */
	public void handleClear(ActionEvent event) {
		Textfield.clear();
	}
}
