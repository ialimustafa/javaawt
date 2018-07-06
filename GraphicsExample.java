import java.awt.*;    
import java.awt.event.*;
import java.awt.Graphics.*;
public class GraphicsExample extends Frame implements MouseMotionListener{   
    int x,y; 
      
    GraphicsExample(){
             //----------------------------This Piece of Code is For Closing the Window
addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we)
    {
    System.exit(0);
    }
   });
  addMouseMotionListener(this); //---------------------Code Ends
   setSize(400,400);  
   setLayout(null);  
   setVisible(true);            
   

}
public void mouseDragged(MouseEvent e) { }  
public void mouseMoved(MouseEvent e) {
    x = e.getX();
    y = e.getY();
    repaint();

}  
public void paint(Graphics g) 
{
    g.drawString("Mouse Moved " + " at " + x + "," + y, 263, 46);
    setBackground(Color.black);
    setForeground(Color.green);
    g.drawLine(110,110 , 150, 150);  //drawLine (int x1, int y1, int x2, int y2)

    g.drawRect(40, 40, 100, 50); // g.drawRect(x1,y1,Width,Height)
    g.fillRect(40, 40, 100, 50); //same as DrawRect
    g.drawOval(160,160 , 80, 80); //drawOval(int x, int y, int width, int height)
    g.fillOval(160,160 , 80, 80);
    g.drawArc(220,220, 70, 70, 0, 75); //drawArc (int x, int y, int width, int height, int startAngle, int arcAngle)
    g.fillArc(220,220, 70, 70, 0, 75);
    int xpoints[] = {280, 400, 280, 400, 280}; //5 Point Polygon
    int ypoints[] = {280, 280, 400, 400, 280};
    int num = 5; 
    g.drawPolygon(xpoints, ypoints, num);
}
public static void main(String args[])
{
    GraphicsExample ge=new GraphicsExample();
}
}              