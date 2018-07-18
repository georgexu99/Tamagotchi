import java.awt.event.KeyEvent;
//tamagochi is creature (x , y, hl);
	//                        int int int
	//x is creature's x position
	//y is creature's y position
	//hl is creature's hungerlevel
	
	
public class Creature{
	int x;
	int y;
	int hl;
	int SPEED = 1;
	int HUNGERLEVELMIN = 0;
	int HUNGERLEVELMAX = 100;
	
	
	public Creature(int x, int y, int hl) {
		this.x = x;
		this.y = y;
		this.hl = hl;
		
		
		
	}
	public void move(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_UP)
		{
			y++;
		}
		if(e.getKeyCode()== KeyEvent.VK_DOWN)
		{
			y--;
		}
		if(e.getKeyCode()== KeyEvent.VK_RIGHT)
		{
			x++;
		}
		if(e.getKeyCode()== KeyEvent.VK_LEFT)
		{
			x--;
		}
		if(e.getKeyCode()== KeyEvent.VK_SPACE)
		{
			hl = hl - 10;
		}
		if(e.getKeyCode()== KeyEvent.VK_R)
		{
			x=200;
			y=300;
			hl=0;
		}
	}
	//hunger increase function
	//Creature -> Creature
		//produce next creature and increase hl by SPEED
	public void increaseHunger() {
		if (hl < HUNGERLEVELMAX) {
			hl=hl+SPEED;
		} 
		
		
	}
		
	}