package Tetris;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TetrisSquare {
	private Rectangle _square;

	public TetrisSquare(Pane gamePane) {
		_square = new Rectangle();
		this.setWidth(50);
		this.setHeight(50);
		gamePane.getChildren().add(_square);
	
	}

	public Rectangle getTetrisSquaresRoot() {
		return _square;
	}
	


	public void setColor(Color color) {
		_square.setFill(color);
	}
	
	public void setWidth(int x) {
		_square.setWidth(x);
	}
	
	public void setHeight(int y) {
		_square.setHeight(y);
	}

	public void setLocation(double x, double y) {
		_square.setX(x);
		_square.setY(y);
	}
	
	public void setStroke(Color color) {
		_square.setStroke(color);
	}
	

}