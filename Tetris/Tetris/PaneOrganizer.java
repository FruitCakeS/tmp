package Tetris;



import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class PaneOrganizer {
	private BorderPane _root;
	private Game _game;
	
	
	public PaneOrganizer() {
		_root = new BorderPane();
		_game = new Game();
		
		Button quit = new Button ("quit!");
		quit.setOnAction(new QuitButtonHandler());
		
		_root.setBottom(quit);
		_root.setCenter(_game.getGameRoot());
	}
	
	public BorderPane getRoot() {
		return _root;
	}
	
	private class QuitButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent e) {
			Platform.exit();
		}

	}
}