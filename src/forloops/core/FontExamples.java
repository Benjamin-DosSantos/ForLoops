package forloops.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Loops - Fonts, Colors, Random Values
 *	Project Description: a.	The Loop project creates 
 *	a random number of numbers, ranging from (26 - 1999), 
 *	at a random size between 100 – 800 size fonts. All of 
 *	the numbers to be drawn are of random color combinations.
 *  This loop is to be done 100 times.  
 * 
 **/

public class FontExamples extends Applet{

	Color bgcolor = Color.CYAN;
	
	int screen_width;
	int screen_height;
	
	Random ran = new Random();
	
	public void init(){ 
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screen_width = (int)(screenSize.getWidth());
		int screen_height = (int)(screenSize.getHeight());
		
		this.setSize(new Dimension(screen_width, screen_height));
		this.setBackground(bgcolor);
		
	}
	
	public static void main(String[] args){ }
	
	public void paint(Graphics g){ 	
		
			int letters_min = 26;
			int letters_max = 1999;
		
			int font_min = 100;
			int font_max = 800;
		
		for(int i = 0; i < 100; i++){

			int letter_x = ran.nextInt(1000);
			int letter_y = ran.nextInt(1000);	
			
			int displaynum = ran.nextInt(letters_max - letters_min) + letters_min;
			
			int fontsize = ran.nextInt(font_max - font_min) + font_min;
			
			int red = ran.nextInt(256);
			int green = ran.nextInt(256);
			int blue = ran.nextInt(256);
		
			Color fontColor = new Color(red, green, blue);
		
			Font font = new Font("Times Roman", Font.BOLD, fontsize);
			g.setFont(font);
			g.setColor(fontColor);
		
			g.drawString(displaynum + "", letter_x, letter_y);
				
		}
	}
}
