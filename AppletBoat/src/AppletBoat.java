/*
 * Name:	Oisin Hennessy
 * IDno:	20063948
 * Date: 	2/2/2016
 * 
 * Applet Boat
 */


import javax.swing.JApplet;

import java.awt.Color;
import java.awt.Graphics;

public class AppletBoat extends JApplet
{
  public void paint( Graphics g )
  {
    super.paint( g );

    // variables for polygon
    int x[] = {25, 180, 155, 50};		//x coordinates
    int y[] = {260, 260, 310, 310};		//y coordinates
    int n = 4;		//number of points
    
    
    //Draw shapes
    
    g.drawLine(100, 100, 100, 250); //mast
    g.drawLine(100, 100, 20, 230); //sail
    g.drawLine(20, 230, 175, 230); //sail
    g.drawLine(100, 100, 175, 230); //sail
    
    g.setColor(Color.green);
    g.fillRect(60, 250, 80, 10); // fill space of upper deck	
    g.drawRect(60, 250, 80, 10); // outline upper deck
    
	g.setColor(Color.red);
    g.fillPolygon(x, y, n); //fill space of body using variables
    g.drawPolygon(x, y, n);	//outline body using variables
    
	g.setColor(Color.black);
    g.drawString("Boat Mobile", 100, 280);
    
    
    
    
  }
}