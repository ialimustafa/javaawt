import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
public class simpleEventExample extends Frame implements ActionListener
{
    String msg="";
  public simpleEventExample()
  {
     
//----------------------------This Piece of Code is For Closing the Window
addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we)
    {
    System.exit(0);
    }
   });
   //---------------------Code Ends      
    setLayout(new FlowLayout());
    Button okay=new Button("Okay");
    Button nokay=new Button("Not Okay");
   

     
    okay.setForeground(Color.blue);
    nokay.setForeground(Color.red);
 
    add(okay);
    add(nokay);
    okay.addActionListener(this);
    nokay.addActionListener(this);
    setTitle("Buttons in Action");
    setSize(300, 300);
    setVisible(true);
    setResizable(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    String str = e.getActionCommand();
 
    if(str.equals("Okay"))
       {
           msg="Okay"; 
        repaint();
       }
    else if(str.equals("Not Okay"))
    {
        msg="Not Okay";
        repaint();
    }
    
   }
   public void paint(Graphics g) {
    g.drawString(msg + " Button Pressed",90,90);
}
   public static void main(String args[])
  {
   simpleEventExample se= new simpleEventExample();
  }
}