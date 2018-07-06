import java.awt.*;
import java.awt.event.*;
public class simpleEventExample2 extends Frame implements ActionListener
{
  Button redBut, greenBut, blueBut, closeBut;
  public simpleEventExample2()
  {
    setLayout(new FlowLayout());
 
    redBut = new Button("RED");
    greenBut = new Button("GREEN");
    blueBut = new Button("BLUE");
    closeBut = new Button("CLOSE");
 
    redBut.addActionListener(this);
    greenBut.addActionListener(this);
    blueBut.addActionListener(this);
    closeBut.addActionListener(this);
     
    closeBut.setForeground(Color.red);
 
    add(redBut);
    add(greenBut);
    add(blueBut);
    add(closeBut);
 
    setTitle("Buttons in Action");
    setSize(300, 300);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    String str = e.getActionCommand();
 
    if(str.equals("RED"))
      setBackground(Color.red);
    else if(str.equals("GREEN"))
      setBackground(Color.green);
    else if(str.equals("BLUE"))
      setBackground(Color.blue);
    else if(str.equals("CLOSE"))
      System.exit(0);
   }
   public static void main(String args[])
  {
    new simpleEventExample2();
  }
}