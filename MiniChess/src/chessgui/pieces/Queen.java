package chessgui.pieces;

import chessgui.Board;

public class Queen extends Piece {
	public Queen(int x, int y, boolean is_white, String file_path, Board board)
	{
	    super(x,y,is_white,file_path, board);
	}

	@Override
	public boolean canMove(int destination_x, int destination_y) {
		
		/*
		 * This code defines a public method called "canMove(int destination_x, int destination_y)"
		 *  which takes two integer arguments, destination_x and destination_y, representing a desired 
		 *  destination on a game board. The method returns "true" if the destination is either:
		 * in the same column as the current position and the row is different,
		 * in the same row as the current position and the column is different,
		 * or the absolute difference in the x and y coordinates is equal (indicating a diagonal move).
		 * Otherwise, the method returns "false".
		 * **/
		
	    if(destination_x == this.getX() && destination_y != this.getY()) {
	    	/*
	    	 * This code checks if the destination_x is equal to the current x 
	    	 * position of the piece (represented by "this.getX()") and the destination_y is 
	    	 * not equal to the current y position of the piece (represented by "this.getY()").
	    	 *  If both conditions are true, the method returns "true". This means that the piece
	    	 *   can move vertically (along the y-axis) to the destination.
	    	 * **/
	        return true;
	    }
	    else if(destination_y == this.getY() && destination_x != this.getX()) {
	    	/**
	    	 * This code checks if the destination_y is equal to the current y
	    	 * position of the piece (represented by "this.getY()") and the destination_x is 
	    	 * not equal to the current x position of the piece (represented by "this.getX()"). 
	    	 * If both conditions are true, the method returns "true". This means that the piece
	    	 * can move horizontally (along the x-axis) to the destination.
	    	 * **/
	        return true;
	    }
	    else if(Math.abs(destination_x - this.getX()) == Math.abs(destination_y - this.getY())) {
	    	
	    	/*
	    	 * This code checks if the absolute difference between the destination_x 
	    	 * and the current x position of the piece (represented by "this.getX()") 
	    	 * is equal to the absolute difference between the destination_y and the 
	    	 * current y position of the piece (represented by "this.getY()"). If this 
	    	 * is true, the method returns "true". This means that the piece can move diagonally
	    	 *  to the destination, as the absolute difference in x and y must be equal for a diagonal move. 
	    	 *  If the first two conditions are not true, the method returns "false", meaning the piece cannot
	    	 *   move to the destination.
	    	 * **/
	        return true;
	    }
	    return false;
	}
}
