/*
 * Name:	Oisin Hennessy
 * IDno: 	20063948	
 * Date: 	6/2/2016
 * 
 * My Polygon shape class
 */

import java.awt.Graphics;
import java.awt.Polygon;

public class MyPolygon
{
		private int sX;
		private int sY;
		private double scale;
		
		public MyPolygon() //default parameters
		{
			sX = 0;
			sY = 0;
			scale = 1.0;
		}
		
		public MyPolygon(int startX, int startY, double startScale)
		{
			sX = startX;
			sY = startY;
			scale = startScale;
		}

		
		public void draw(Graphics g)
		{	
			//Chosen polygon is a rhombus
			Polygon myPolygon = new Polygon( );
			myPolygon.addPoint( sX, sY );
			myPolygon.addPoint( sX + (int) (50*scale), sY );
			myPolygon.addPoint( sX + (int) (50*scale)+ (int) (10*scale), sY + (int) (25*scale) ); //bottom points are shifted right for rhombus
			myPolygon.addPoint( sX + (int) (10*scale), sY + (int) (25*scale) );
			
			g.drawPolygon ( myPolygon );
		}
}