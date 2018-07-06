import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventHandling2 extends Frame {

	int x = 0, y = 0;
	String strEvent = "";

	EventHandling2() {
		
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
            System.exit(0);
            }
           });
           setTitle("Mouse Listener");
           
	
		setSize(300, 300);
        setVisible(true);
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
              x=e.getX();
              y=e.getY();
              strEvent="Mouse Clicked";
              repaint();
            }
            public void mouseReleased(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                strEvent="Mouse Released";
                repaint();
              }                   
         });
	}

	

	public void paint(Graphics g) {
		g.drawString(strEvent+ " at " + x + "," + y, 50, 50);
	}

	public static void main(String[] args) {
		EventHandling2 window = new EventHandling2();
	}

}

