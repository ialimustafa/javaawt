import java.awt.*;
import java.awt.event.*;
 
public class keyListenerExample2 extends Frame implements KeyListener  
{                       
  TextField tf;
  public keyListenerExample2()
  {
          //----------------------------This Piece of Code is For Closing the Window
addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we)
    {
    System.exit(0);
    }
   });
   //---------------------Code Ends      
    add(tf = new TextField(), "South");
    tf.setFont(new Font("Monospaced", Font.BOLD, 18));
 
    addKeyListener(this);
    setFocusable(true); 
 
    setSize(300,300);
    setVisible(true);
  }                    
                                 // override the 3 abstract methods of KeyListener
  public void keyPressed(KeyEvent e)  {  }
  public void keyReleased(KeyEvent e) {  }
  public void keyTyped(KeyEvent e)
  {
    char ch = e.getKeyChar();  
    tf.setText("You typed " + ch + " letter");
  }
  
  public static void main(String snrao[])
  {
    new keyListenerExample2();
  }                                    
}   