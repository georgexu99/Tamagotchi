import java.awt.Color;

import javax.swing.JFrame;


public class Main {
	public static void main (String[] args) {
		JFrame obj = new JFrame();
		Gameplay gameplay = new Gameplay();
		
		obj.setBounds(10,10, 900, 900);
		//obj.setBackground(Color.blue);
		obj.setVisible(true);
		//obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		obj.add(gameplay);
		
	}

}
