package ui;

import game.NumberGame;
import java.util.Observable;
import java.util.Observer;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * GuessNumberView that show the current number that user input in NumberGame.
 * @author Charin Tantrakul
 *
 */
public class GuessNumberView implements Observer{
		
		private Stage stage;
		
		private Label label;
		
		private NumberGame game;
		
		private int userNumber;
		
		/**
		 * Initialize a GuessingNumberView by add NumberGame that want to show current guess number.
		 * @param game is NumberGame to show.
		 */
		public GuessNumberView(NumberGame game) {
			this.game = game;
			initComponents();
		}
		
		/**
		 * Create Stage or widow of JavaFX
		 */
		private void initComponents() {
			stage = new Stage();
			HBox root = new HBox();
			root.setPadding(new Insets(40));
			root.setAlignment(Pos.CENTER);
			label = new Label("");
			label.setPrefWidth(144);
			label.setFont(new Font("Angsana New", 80.0));
			label.setAlignment(Pos.CENTER);
			root.getChildren().add(label);
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("GuessNumber");
			stage.sizeToScene();
		}
		
		/**
		 * Run the JavaFX to show guess number
		 */
		public void run() {
			stage.show();
			showNumber();
		}
		
		/**
		 * Set number to label
		 */
		public void showNumber() {
			label.setText(String.format("%d", userNumber));
		}
		

	@Override
	public void update(Observable o, Object arg) {
		userNumber = (int) arg;
		showNumber();
	}

}
