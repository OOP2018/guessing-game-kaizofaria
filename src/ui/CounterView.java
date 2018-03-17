package ui;


import java.util.Observable;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import game.NumberGame;

/**
 * A Controller for a window that shows the value of a Counter.
 * This has only one component (but you can add more components),
 * so write it in code instead of FXML.
 *
 */
public class CounterView implements java.util.Observer {
	private Stage stage;

	private Label label;
	
	private NumberGame game;
	
	/**
	 * Initialize a CounterView by add NumberGame that want to show how many time that user guess.
	 * @param game is NumberGame to show.
	 */
	public CounterView(NumberGame game) {
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
		stage.setTitle("Counter");
		stage.sizeToScene();
	}
	
	/** 
	 * Show the window and update the counter value. 
	 */
	public void run() {
		stage.show();
		showCount();
	}
	
	/**
	 * Set the Label when NumberGame update.
	 */
	public void showCount() {
		label.setText( String.format("%2d", game.getCount()));
	}

	@Override
	public void update(Observable o, Object arg) {
		showCount();
	}	
}

