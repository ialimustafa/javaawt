import java.awt.*;
import java.awt.event.*;
public class firstprog extends Frame
{
  firstprog()
 {
       //Creating a frame.
       
  Label lb = new Label("Welcome to java graphics"); //Creating a label
  Button bn=new Button("Boom!");
                              
  add(lb);                    //adding label to the frame.
  add(bn);		              
  setTitle("First Program");   //Set Title
  setSize(300, 300);
  setLayout(new FlowLayout(FlowLayout.RIGHT));               //setting frame Layout.
  setVisible(true);
  setResizable(true);
  addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we)
    {
    System.exit(0);
    }
   });
  
              //set frame visibilty true.
 }
 public static void main(String args[]) throws InterruptedException
 {
  firstprog ta = new firstprog();
  
 }
}
