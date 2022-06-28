import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	GamePanel panel;
	
	GameFrame(){
		
		 panel = new GamePanel();
		 this.add(panel);
		 this.setTitle("Ping Pong Game");
		 this.setResizable(false);
		 this.setBackground(Color.black);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.pack(); // It causes the window to be sized to fit the preferred size and layout of its subcomponents OR fits accordingly to the Game panel
		 this.setVisible(true);
		 this.setLocationRelativeTo(null);
		 
		 
		
	}

}
