package ui;
	
import java.net.URL;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import game.NumberGame;
import game.CharinGame;
/**
 * Start JavaFX GUI for NumberGame
 * @author Charin Tantrakul.
 *
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		NumberGame game = new CharinGame(100);
		
		try {
			URL url = getClass().getResource("GuessingGameUI.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: GuessingGameUI.fxml");
				Platform.exit();
			}
			FXMLLoader loader = new FXMLLoader(url);
			Parent root = loader.load();	
			GuessingGameController controller = loader.getController();	
			controller.setGame(game);
			// Build and show the scene
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("GuessingGame");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			return;
		}
		GuessNumberView view = new GuessNumberView(game);
		game.addObserver(view);
		CounterView view2 = new CounterView(game);
		game.addObserver(view2);
		view.run();
		view2.run();
		
	}
	
	/**
	 * Start Application.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);	
	}
}
