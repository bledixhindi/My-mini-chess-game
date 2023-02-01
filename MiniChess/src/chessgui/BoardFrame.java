package chessgui;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;

public class BoardFrame extends JFrame {
	/*
	 * This is a Java class BoardFrame that extends the JFrame class and represents a GUI window for a chess game.
	 * The class has a constructor that sets the default close operation of the frame to DISPOSE_ON_CLOSE, meaning that when 
	 * the close button is clicked, the frame will be disposed and its resources will be released. The title of the frame is set
	 * to "Chess" and the resizability of the frame is set to false.
	 * A Board component is created and added to the frame using the add method, with the BorderLayout.CENTER layout specified
	 * , meaning that the component will be centered within the frame. The location of the frame is set to (200, 50) and the pack 
	 * method is called to size the frame based on its components.
	 * Finally, the visibility of the frame is set to true to make it visible on the screen.
	 * **/
    Component component;
    public BoardFrame()
    {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Chess");
        this.setResizable(true);
        component = new Board();
        this.add(component, BorderLayout.CENTER);
        
        this.setLocation(200, 50);
        this.pack();
        this.setVisible(true);
    }
}
