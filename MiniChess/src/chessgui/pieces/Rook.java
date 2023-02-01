package chessgui.pieces;

import chessgui.Board;

public class Rook extends Piece {

    public Rook(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y) {
    	/*
    	 * 
    	 * This code implements a method that determines whether a piece on a chessboard
    	 **/
    	
        if (destination_x < 0 || destination_x > 7 || destination_y < 0 || destination_y > 7) {
        	/*
        	 * This code checks if the destination position is within the boundaries of the chessboard.
        	 *  It returns false if the destination_x is less than 0 or greater than 7, or if destination_y
        	 *   is less than 0 or greater than 7. In other words, it returns false if the destination is
        	 *    outside of the 8x8 chessboard.
        	 * **/
            return false;
        }

        if (destination_x == getX() && destination_y == getY()) {
        	/*
        	 * This code checks if the destination position is the same as the current position of the piece.
        	 *  It returns false if both the x and y coordinates of the destination match the x and y coordinates
        	 *   of the current position, respectively. In other words, it returns false if the piece is trying
        	 *    to move to the same square it is already on.
        	 * ***/
            return false;
        }

        if (destination_x == getX() || destination_y == getY()) {
        	
        	/*
        	 * This code checks if the destination position is either vertically or
        	 *  horizontally aligned with the current position. If it is, it calculates 
        	 * **/
        	
            int x_direction = Integer.compare(destination_x, getX());
            /*
             * The code calculates the direction of movement as x_direction and y_direction. 
             * It uses the Integer.compare() method to compare the x and y coordinates of the
             *  destination and current positions. Integer.compare() returns a value of -1, 0, or 1 
             *  depending on whether the first argument is less than, equal to, or greater than the
             *  second argument, respectively. So, x_direction will be -1 if the destination_x is less than the current 
             *  x position, 0 if they are equal, and 1 if the destination_x is greater than the current x position. y_direction
             *  is calculated in the same way.**/
            int y_direction = Integer.compare(destination_y, getY());

            for (int i = 1; i < Math.max(Math.abs(destination_x - getX()), Math.abs(destination_y - getY())); i++) {
            	
            	/*
            	 * This code is checking if there is a piece on the path of a hypothetical move from
            	 *  (getX(), getY()) to (destination_x, destination_y) on a game board represented by
            	 *   the "getBoard()" method. It returns false if there is a piece on the path, otherwise
            	 *    the code continues to execute. The "x_direction" and "y_direction" variables represent
            	 *     the direction of the move, calculated as the difference between the destination coordinates
            	 *      and the starting coordinates, divided by the greater of the absolute values of the differences
            	 *       between the x or y coordinates. The loop increments by "i" in each iteration and continues 
            	 *       until "i" is less than the maximum absolute value of the differences between the x or y coordinates.
            	 * ***/
            	
                if (getBoard().getPiece(getX() + i * x_direction, getY() + i * y_direction) != null) {
                	
                	/*
                	 * This code checks if there is a piece at the location on the game 
                	 * board represented by "getBoard()" at coordinates (getX() + i * x_direction,
                	 *  getY() + i * y_direction). If there is a piece at that location, the function
                	 *   immediately returns false, otherwise the loop continues to execute.
                	 *    The coordinates of the location being checked in each iteration are 
                	 *    calculated by adding "i * x_direction" to the starting x coordinate
                	 *     (getX()) and "i * y_direction" to the starting y coordinate (getY()).
                	 * ***/
                	
                    return false;
                }
            }

            if (getBoard().getPiece(destination_x, destination_y) != null && getBoard().getPiece(destination_x, destination_y).isWhite() == isWhite()) {
            	
            	
            	/*
            	 * This code checks if there is a piece at the destination coordinates
            	 *  (destination_x, destination_y) on the game board represented by the
            	 *   "getBoard()" method, and if so, it then checks if the piece at the
            	 *    destination is the same color as the piece making the move. 
            	 *    If there is a piece at the destination and it is the same color,
            	 *     the function returns false. If there is no piece or if the piece 
            	 *     at the destination is a different color, the function returns true.
            	 *      If the destination coordinates are out of bounds, the function immediately returns false.
            	 * 
            	 * ****/
            	
                return false;
            }
            return true;
        }
        return false;
    }

	private Board getBoard() {
		
		/*
		 * This code defines a private method called "getBoard()" 
		 * that returns a "null" value. 
		 * **/
		return null;
	}
}
