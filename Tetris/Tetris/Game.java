package Tetris;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Game {

	private Pane _game;
	private Piece _piece;
	private TetrisSquare[][] _board;

	public Game() {
		_game = new Pane();
		_piece = new Piece(_game);
		_board = new TetrisSquare[20][30];

		for (int col = 0; col<20; col++) {
			for (int row = 0; row < 30; row++) {
				TetrisSquare s = new TetrisSquare(_game);
				s.setLocation(col * 30, row * 30);
				s.setColor(Color.WHITE);
				s.setStroke(Color.BLACK);
				_board[col][row] = s;
			}
		}
		
	}
			

	public Pane getGameRoot() {
		return _game;
	}


}
