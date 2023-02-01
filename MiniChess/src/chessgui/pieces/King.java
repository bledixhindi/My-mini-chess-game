package chessgui.pieces;

import chessgui.Board;

public class King extends Piece {

    public King(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y) {
    	/*
    	 * This code is checking if the move is a valid one-square diagonal move for a piece in a chess game.
    	 *  The method takes in two arguments, destination_x and destination_y, which represent the destination coordinates
    	 *   the piece is trying to move to. The method calculates the difference between the destination and current coordinates
    	 *    (xDiff and yDiff) and checks if both differences are less than or equal to 1. If both conditions are true, the method
    	 *     returns true, indicating that the move is valid. 
    	 * If either of the conditions is false, the method returns false, indicating that the move is invalid.
    	 * **/
        int xDiff = Math.abs(destination_x - this.x);
        /*
         * This code calculates the difference between the current x and y coordinates of the piece and the
         *  destination_x and destination_y arguments passed to the method.
         *   The Math.abs method is used to get the absolute value of the difference, 
         *   which is necessary because the difference could be negative if the piece is moving to a lower coordinate. 
         *   The calculated differences are stored in the xDiff and yDiff variables, respectively.
         * **/
        int yDiff = Math.abs(destination_y - this.y);

        if (xDiff <= 1 && yDiff <= 1) {
        	/*
        	 * This code checks if the difference between the current x and destination_x (stored in xDiff) is 
        	 * less than or equal to 1, and the difference between the current y and destination_y (stored in yDiff) is
        	 *  less than or equal to 1. If both conditions are true, it returns true indicating that the piece can move
        	 *   to the destination. If either of the conditions is false, it returns false, indicating that the piece 
        	 *   cannot move to the destination.
        	 * **/
            return true;
        }
        return false;
    }
}
