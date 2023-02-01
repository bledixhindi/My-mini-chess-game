package chessgui.pieces;

import chessgui.Board;

public class Pawn extends Piece {

    private boolean has_moved;
    
    public Pawn(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
        has_moved = false;
        this.board = board;

    }
    
    public void setHasMoved(boolean has_moved)
    {
        this.has_moved = has_moved;
    }
    
    public boolean getHasMoved()
    {
        return has_moved;
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
    	
    	/*
    	 * This is a method to check if a pawn piece can move to a specific destination on a chess board. 
    	 * The method returns a boolean value of true if the move is valid, or false if it's not. 
    	 * The method checks if the destination is within the boundaries of the chess board (0 to 7), if the pawn is white 
    	 * or black, if the pawn is trying to move diagonally without capturing a piece, if the pawn is trying to move forward, 
    	 * if the pawn has moved before, if the pawn is moving two squares forward and if there is a piece blocking the path, 
    	 * and if the pawn is capturing a piece diagonally.
    	 * **/
    	
        if (destination_x < 0 || destination_x > 7 || destination_y < 0 || destination_y > 7) {
        	/*
        	 * This line checks if the destination coordinates (destination_x, destination_y) are within the boundaries 
        	 * of the chess board. If either the x or y coordinate is less than 0 or greater than 7, the method returns false, 
        	 * indicating that the move is not valid.
        	 * ***/
            return false;
        }
        // check if the pawn is white or black
        int direction = isWhite() ? 1 : -1; 
        /*
         * This line sets the value of "direction" based on the color of the pawn. If the pawn is white, 
         * "direction" will be set to 1, and if the pawn is black, "direction" will be set to -1. 
         * This value will be used later in the method to determine the direction that the pawn can move in.
         * **/

        if (destination_x != getX() && Math.abs(destination_x - getX()) != Math.abs(destination_y - getY()))
        	/*
        	 * This line checks if the pawn is trying to move diagonally without capturing a piece. 
        	 * If the x coordinate of the destination is not equal to the x coordinate of the current
        	 *  position (getX()) and the absolute 
        	 * difference between the x coordinates is not equal to the absolute difference between the y coordinates, 
        	 * then the method
        	 *  returns false, indicating that the move is not valid.
        	 *  In other words, this checks if the move is a diagonal move and if it is, it confirms that the pawn is 
        	 *  capturing a piece.
        	 * ***/
            return false;

       
        if (destination_x == getX()) {
            if (has_moved) {
            	/*
            	 * This block of code checks if the pawn is trying to move forward.
            	 *  If the x coordinate of the destination is equal to the x coordinate of the current position (getX()), 
            	 *  it means the pawn is moving vertically. If the pawn has already moved (as indicated by the "has_moved" flag),
            	 *   the method checks if the y coordinate of the destination is equal to the y coordinate 
            	 *   of the current position plus the "direction" value. If the y coordinate of the destination is 
            	 *   not equal to the expected value, the method returns false, indicating that the move is not valid.
            	 * **/
                if (destination_y != getY() + direction)
                    return false;
            } else {
            	
            	/*
            	 * This block of code is executed if the pawn has not moved before.
            	 *  The method checks if the y coordinate of the destination is equal to the y coordinate
            	 *   of the current position plus twice the "direction" value. This represents a move of 
            	 *   two squares forward for the pawn. If the y coordinate of the destination is not equal 
            	 *   to the expected value, the method returns false, indicating that the move is not valid. 
            	 *   Additionally, the method checks if there is a piece at the position that the pawn would
            	 *    be passing through, by calling "getBoard().getPiece(destination_x, getY() + direction)". 
            	 *    If there is a piece at that position, the method returns false, indicating that the move is not valid.
            	 * **/
                if (destination_y != getY() + (direction * 2))
                    return false;
                if (getBoard().getPiece(destination_x, getY() + direction) != null)
                    return false;
            }
        } else {
        	
        	/*
        	 * This block of code is executed if the pawn is trying to move diagonally. 
        	 * The method checks if the y coordinate of the destination is equal to the y coordinate of the 
        	 * current position plus the "direction" value. This represents a move of one square diagonally for the pawn.
        	 *  If the y coordinate of the destination is not equal to the expected value, the method returns false, 
        	 *  indicating that the move is not valid. Additionally, the method checks if there is a piece at the destination 
        	 *  position, by calling "getBoard().getPiece(destination_x, destination_y)". If there is no piece at that position,
        	 *   the method returns false, indicating that the move is not valid, as the pawn can
        	 *    only move diagonally to capture a piece. If all of the checks have passed, the method returns true,
        	 *     indicating that the move is valid.
        	 * **/
            if (destination_y != getY() + direction)
                return false;
            if (getBoard().getPiece(destination_x, destination_y) == null)
                return false;
        }

        return true;
    }

	private Board getBoard() {
		
		/*
		 * This is a private method named "getBoard()". It returns the "board" object, 
		 * which is a member of the class that contains this method. The implementation details of the "board" object
		 *  and how it is used in the class are not given in this code snippet,
		 *   but it can be assumed that it represents a chessboard and is used to keep track of the 
		 *   positions of pieces on the board. The method returns the "board" object, which can then be
		 *    used to access its other methods or members. The comment "// TODO Auto-generated method stub" is a
		 *     placeholder and typically used by development tools to indicate that the method needs to be implemented.
		 * **/
		// TODO Auto-generated method stub
		return board;
	}
}
