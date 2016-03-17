package forloops.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

public class PeerProgramming_Countdown extends Applet{

	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: Loops - Objects
	 *	Project Description: a.	This program is 
	 *  intended to make a countdown from 10 to 0
	 *  while halveing the font size after each number. 
	 *  The numbers are the same. This project also 
	 *  teaches the fundamentals of color objects, colors, 
	 *  and Fonts. 
	 * 
	 **/
	
	/**  
	 * 
	 * Display numbers 10 to 0 on the screen
	 * The font size should decrease as the numbers decrease
	 * this project is an applet
	 * the numbers can be in specific positions or in random locations
	 * each displayed value should be a different color
	 * Applet should be set to screen size 
	 * Use a loop
	 * 
	 * Display a value
	 * Change the position 
	 * 	set the random x and y value
	 * set the new font
	 * decrease the displayed value by 1
	 * change the font color
	 * set the new color
	 * 
	 * 
	 **/
	
	Color bgcolor = Color.ORANGE;
	Color fontcolor = Color.CYAN;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screen_width = (int)(screenSize.getWidth());
	int screen_height = (int)(screenSize.getHeight());
	
	public void init(){
		
		this.setSize(new Dimension(screen_width, screen_height));
		this.setBackground(bgcolor);
		
	}
	
	public void paint(Graphics g){
		
		int fontsize = 1024;
		int display_num = 10;
		
		for(display_num = 10; display_num >= 0; display_num--){
			
			
			Font font = new Font ("Times Roman", Font.BOLD, fontsize);
			
			g.setFont(font);
			g.setColor(fontcolor);
			
			g.drawString(display_num + "", 0, 800);
		
			
			try {
				Thread.sleep(2000);
				
				g.setColor(bgcolor);
				
				g.fillRect(0, 0, screen_width, screen_height);
				
				fontsize /= 2;
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.exit(0);
		
	}
	
}
