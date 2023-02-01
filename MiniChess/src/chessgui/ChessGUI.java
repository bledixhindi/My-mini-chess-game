package chessgui;

public class ChessGUI {
    
    public BoardFrame boardframe;
    public static void main(String[] args) {
    	
    	/*
    	 * This is the main class of a chess game GUI program in Java. The class ChessGUI contains a single
    	 *  instance of a BoardFrame object, boardframe.
    	 *  and sets its visibility to true to display the frame on the screen. 
    	 *  The program starts by executing the main method and displays the chess board on the screen.
    	 * **/
        ChessGUI gui = new ChessGUI();
        gui.boardframe = new BoardFrame();
        gui.boardframe.setVisible(true);
        
    }
}
