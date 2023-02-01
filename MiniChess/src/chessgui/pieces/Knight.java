package chessgui.pieces;

import chessgui.Board;

public class Knight extends Piece {

    public Knight(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    public boolean canMove(int destination_x, int destination_y) {
    	
    	/*
    	 * Yes, this code implements the canMove method for a knight in the game of chess. 
    	 * The knight moves in an L-shape, two squares in one direction and then one square in a perpendicular direction. 
    	 * The method checks if the destination is either two squares away in the x-direction
    	 *  and one square away in the y-direction, 
    	 * or vice versa. If the destination meets this criteria, the method returns true, indicating that the move is valid. 
    	 * If the destination is not two squares away in one direction and one square away in the other, the method returns false,
    	 *  indicating an invalid move.
    	 * **/
        int x_diff = Math.abs(destination_x - this.x);
        /*
         * These two lines of code calculate the difference between the current x and y coordinates
         *  of the piece and the destination x and y coordinates. The Math.abs method returns the absolute value 
         *  of a number, which means that it removes the sign of the number.
         * **/
        int y_diff = Math.abs(destination_y - this.y);

        if ((x_diff == 2 && y_diff == 1) || (x_diff == 1 && y_diff == 2)) {
        	
        	/*
        	 * This code checks if a knight chess piece is moving in a valid "L" shape. 
        	 * If the difference between the starting and ending positions on the x-axis is 2 and the difference
        	 *  on the y-axis is 1, or if the difference on the x-axis is 1 and the difference on the y-axis is 2,
        	 *   then the function returns true, meaning the move is valid. Otherwise, the function returns false,
        	 *    indicating an invalid move.
        	 * **/
        	
            return true;
        } else {
            return false;
        }
    }
}
