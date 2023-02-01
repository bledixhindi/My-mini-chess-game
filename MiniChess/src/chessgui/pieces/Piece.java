package chessgui.pieces;

import chessgui.Board;

public class Piece {
    protected int x;
    protected int y;
    final private boolean is_white;
    private String file_path;
    public Board board;
    
    public Piece(int x, int y, boolean is_white, String file_path, Board board)
    {
    	
    	/*
    	 * This is the code for the Piece class in a game of chess. The Piece class has the following instance variables:
    	 * x, y: the coordinates of the piece on the chessboard
    	 * is_white: a boolean to indicate whether the piece is white or black
    	 * file_path: a string representing the file path of the image that represents the piece
    	 * board: an instance of the Board class
    	 * It has the following methods:
    	 * getFilePath(): returns the file path of the piece
    	 * setFilePath(String path): sets the file path of the piece
    	 * isWhite(): returns a boolean indicating whether the piece is white
    	 * isBlack(): returns a boolean indicating whether the piece is black
    	 * setX(int x), setY(int y): set the x and y coordinates of the piece
    	 * getX(), getY(): get the x and y coordinates of the piece
    	 * canMove(int destination_x, int destination_y): returns false (as it will be implemented in child classes)
    	 * validateMove(Piece[][] board, int currentRow, int currentCol, int newRow, int newCol): returns false 
    	 * (as it will be implemented in child classes)
    	 * **/
        this.is_white = is_white;
        this.x = x;
        this.y = y;
        this.file_path = file_path;
        this.board = board;
    }
    
    public String getFilePath()
    {	
    	//This method returns the file path of the image of the piece.
        return file_path;
    }
    
    public void setFilePath(String path)
    {	
    	//This method sets the file path of the image of the piece.

        this.file_path = path;
    }
    
    public boolean isWhite()
    {
    	/*
    	 * This method returns a boolean value indicating the color of the piece. 
    	 * If the piece is white, it returns true, otherwise it returns false.
    	 * **/
        return is_white;
    }
    
    public boolean isBlack()
    {
    	/*
    	 * This code defines the isBlack() method which returns the opposite of
    	 *  the value of the is_white attribute.
    	 *   If is_white is true, then isBlack() returns false, and vice versa.
    	 * **/
        return !is_white;
    }
    
    public void setX(int x)
    {
    	//This method sets the x-coordinate of a Piece object.
        this.x = x;
    }
    
    public void setY(int y)
    {	
    	//This code sets the "y" instance variable of the Piece object to the input parameter "y".
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public boolean canMove(int destination_x, int destination_y)
    {
        return false;
    }

	public boolean validateMove(Piece[][] board, int currentRow, int currentCol, int newRow, int newCol) {
		/*
		 * This code defines a public method called "validateMove(Piece[][] board, 
		 * int currentRow, int currentCol, int newRow, int newCol)" that takes in a
		 *  2D array of Piece objects, representing a game board, and four integer 
		 *  values, representing the current position and the desired new position of a piece. 
		 *  The method simply returns "false", meaning that no move is considered valid by this implementation.
		 *   It is likely that this method is intended to be overridden or modified in a subclass to provide actual 
		 *   logic for validating a move.
		 * **/
		return false;
	}
}
