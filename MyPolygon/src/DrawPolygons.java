/*
 * Name:	Oisin Hennessy
 * IDno;	20063948
 * Date:	6/2/20016
 * 
 * Polygon implementation program
 */
import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Polygon;
 
public class DrawPolygons extends JApplet
{
    //declare MyPolygon variables
    private MyPolygon poly1;
    private MyPolygon poly2;
    private MyPolygon poly3;
     
    // initialise objects
    public void init()
    {
        poly1 = new MyPolygon (); //default 
        poly2 = new MyPolygon (50,50,2); //with parameters
        poly3 = new MyPolygon (120,120,5);
    }
     
    public void paint( Graphics g )
    {
        super.paint( g );
         
        poly1.draw(g);    // draw polygons above
        poly2.draw(g);
        poly3.draw(g);
         
    }
}