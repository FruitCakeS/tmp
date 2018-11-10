package Tetris;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Piece {
	private TetrisSquare _tetrisSquare;
	private TetrisSquare[] _squares;
	private Pane _gamePane;

	public Piece(Pane gamePane) {
		_tetrisSquare = new TetrisSquare(gamePane);
		_squares = new TetrisSquare[4];
		_gamePane = gamePane;
		
		this.randSquare();
		
	}

	public void randSquare() {
		int rand = (int) (Math.random() * 7);
		switch (rand) {
		case 0:
			this.setCoord(Constants.SQUARE);
			_tetrisSquare.setColor(Color.YELLOW);
			break;
		case 1:
			this.setCoord(Constants.LEFT_L);
			_tetrisSquare.setColor(Color.ORANGE);
			break;
		case 2:
			this.setCoord(Constants.RIGHT_L);
			_tetrisSquare.setColor(Color.CORNFLOWERBLUE);
			break;
		case 3:
			this.setCoord(Constants.S);
			_tetrisSquare.setColor(Color.GREENYELLOW);
			break;
		case 4:
			this.setCoord(Constants.T);
			_tetrisSquare.setColor(Color.MEDIUMPURPLE);
			break;
		case 5:
			this.setCoord(Constants.Z);
			_tetrisSquare.setColor(Color.RED);
			break;
		case 6:
			this.setCoord(Constants.LINE);
			_tetrisSquare.setColor(Color.TURQUOISE);
			break;
		default:
			break;
		}

	}

	public void setCoord(int[][] coord) {
		for (int i = 0; i < _squares.length; i++) {
			_squares[i] = new TetrisSquare(_gamePane);
			_squares[i].setLocation(coord[i][0], coord[i][1]);
		}
	}

}