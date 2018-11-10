package Tetris;

public class Constants{
	public static final int FRAME_WIDTH = 600;
	public static final int FRAME_HEIGHT = 900;
	public static final int SQUARE_WIDTH = 30;
	
	public static final int[][] SQUARE = {{270,0},{300,0},{270,30},{300,30}};
	public static final int[][] RIGHT_L = {{270,0},{270,30},{270,60},{300,60}};
	public static final int[][] LEFT_L = {{300,0},{300,30},{300,60},{270,60}};
	public static final int[][] LINE = {{270,0},{270,30},{270,60},{270,90}};
	public static final int[][] T = {{270,0},{300,0},{330,0},{300,30}};
	public static final int[][] S = {{270,30},{300,30},{300,0},{330,0}};
	public static final int[][] Z = {{270,0},{300,0},{300,30},{330,30}};
		/**
		1) figure out coordinates of each piece
		2) 2 arrays in Piece class: 2D for coordinates, 1D for squares
		3) method that sets the coordinates of each square (for loop)
		4) switch statement that generates random number and cases
		each case calls 3 and passes in a constant
		
		*/
	}


