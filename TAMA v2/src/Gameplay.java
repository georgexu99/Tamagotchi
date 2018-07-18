import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	private ImageIcon titleImage;
	private ImageIcon tama;
	
	
	private Timer timer;
	private int delay = 100;
	
	private int x = (850 / 2);
	private int y = (575/2);
	private int hl = 0;
	
	int SPEED = 1;
	int HUNGERLEVELMIN = 0;
	int HUNGERLEVELMAX = 100;
	
	public Gameplay()
	{
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay,this);
		timer.start();

	}
	
	public void paint (Graphics g)
	{
		
	
		// draw title image border
		g.setColor(Color.white);
		g.drawRect(24,10, 851, 55);
		
		
		// draw the title image
		titleImage = new ImageIcon("snaketitle.jpg");
		titleImage.paintIcon(this,  g,  24, 11);
		
		//draw border for gameplay
		g.setColor(Color.WHITE);
		g.drawRect(24, 74, 851, 577);
		
		//draw background for the gameplay
		g.setColor(Color.black);
		g.fillRect(25, 75, 850, 575);
		
		//draw the sprite for the gameplay
		tama = new ImageIcon("upmouth.png");
		tama.paintIcon(this, g, x, y);
		
		//draw the hunger level box 
		g.setColor(Color.white);
		g.fillRect((x-40), (y-50), 110, 20);
		
		//draw the hunger level
		g.setColor(Color.blue);
		g.setFont(new Font("arial",Font.PLAIN, 14));
		g.drawString("Hunger Level= " + String.valueOf(hl), x-40 , y-35);
		
			
		
		g.dispose();
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timer.start();
		if (hl < HUNGERLEVELMAX) {
			hl=hl+SPEED;
			}
		repaint();
		
		}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
			if(e.getKeyCode()== KeyEvent.VK_UP)
			{
				y= y-10;
			}
			if(e.getKeyCode()== KeyEvent.VK_DOWN)
			{
				y=y+10;
			}
			if(e.getKeyCode()== KeyEvent.VK_RIGHT)
			{
				x=x+10;
			}
			if(e.getKeyCode()== KeyEvent.VK_LEFT)
			{
				x= x-10;
			}
			if(e.getKeyCode()== KeyEvent.VK_SPACE)
			{
				if (hl <= 30) {
					hl = 0;
				}
				if (hl > 30) {
					hl= hl -30;
				}
				if (hl == 100) {
					SPEED = 0;
				}
				
			
			}
			if(e.getKeyCode()== KeyEvent.VK_R)
			{
				x=(850 / 2);
				y=(575/2);
				hl=0;
				SPEED = 1;
			}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
