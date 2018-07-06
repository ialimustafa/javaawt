import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventHandling extends Frame implements MouseListener,MouseMotionListener {

	int x = 0, y = 0;
	String strEvent = "";

	EventHandling(String title) {
		super(title);
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
            System.exit(0);
            }
           });
        addMouseListener(this);
        addMouseMotionListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		strEvent = "MouseClicked";
		x = e.getX();
		y = e.getY();
		repaint();
	}

	public void mousePressed(MouseEvent e) {
		strEvent = "MousePressed";
		x = e.getX();
		y = e.getY();
		repaint();

	}

	public void mouseReleased(MouseEvent e) {
		strEvent = "MouseReleased";
		x = e.getX();
		y = e.getY();
		repaint();

	}

	public void mouseEntered(MouseEvent e) {
		strEvent = "MouseEntered";
		x = e.getX();
		y = e.getY();
		repaint();

	}

	public void mouseExited(MouseEvent e) {
		strEvent = "MouseExited";
		x = e.getX();
		y = e.getY();
		repaint();

    }
    public void mouseDragged(MouseEvent e) {    //From MouseMotion Listener
		strEvent = "MouseDragged";
		x = e.getX();
		y = e.getY();
		repaint();

    }
    public void mouseMoved(MouseEvent e) {    //From MouseMotion Listener
		strEvent = "MouseMoved";
		x = e.getX();
		y = e.getY();
		repaint();

	}

	public void paint(Graphics g) {
		g.drawString(strEvent + " at " + x + "," + y, 50, 50);
	}

	public static void main(String[] args) {
		EventHandling window = new EventHandling("Mouse Event");
	}

}

