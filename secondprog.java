import java.awt.*;
import java.awt.event.*;
public class secondprog extends Frame
{
  secondprog()
 {
       //Creating a frame.
       
  Label lb = new Label("Welcome to java AWT"); //Creating a label
  Button bn=new Button("Boom!");                    //Creating a Button
  TextField t1=new TextField("TextField.");  //Creating a Text Field
  TextArea area=new TextArea("TextArea",3,30);          //Creating a Text Area
  Checkbox checkbox1 = new Checkbox("Single Checkbox"); //Creating a Checkbox
  CheckboxGroup cbg = new CheckboxGroup();                      //Creating a Group For Radio Buttons
  Checkbox checkBox2 = new Checkbox("Radio Button1", cbg, false);     
   
  Checkbox checkBox3 = new Checkbox("Radio Button2", cbg, true);    
  Choice c=new Choice();               // Creating a Choice  
   
  c.add("Item 1");                      //Adding Items to Choice
  c.add("Item 2");  
  c.add("Item 3");  
  c.add("Item 4");  
  c.add("Item 5");  
    
  List l1=new List(5,true);                      //Creating a List
   
  l1.add("ListItem 1");  
  l1.add("ListItem 2");  
  l1.add("ListItem 3");  
  l1.add("ListItem 4");  
  l1.add("ListItem 5");      
          MenuBar mb=new MenuBar();                                      //Creat MenuBar 
         Menu menu=new Menu("Menu");                                //Create a Menu
         Menu submenu=new Menu("Sub Menu");                         //Create a SubMenu
         MenuItem i1=new MenuItem("Item 1");                      //main Menu Item
         MenuItem i2=new MenuItem("Item 2");                      //main Menu Item
         MenuItem i3=new MenuItem("Item 3");                      //main Menu Item
         MenuItem i4=new MenuItem("Item 4");              
         MenuItem i5=new MenuItem("Item 5");  
         menu.add(i1);              
         menu.add(i2);  
         menu.add(i3);  
         submenu.add(i4);  
         submenu.add(i5);  
         menu.add(submenu);  
         mb.add(menu);  
         setMenuBar(mb); 

  //WE Will Now Add All the Defined Components to our FRAME

  add(lb);                    //adding label to the frame.
  add(bn);		                //Adding Button
  add(t1);
  add(area);
  add(checkbox1);
  add(checkBox2);
  add(checkBox3);
  add(c);
  add(l1);
  setTitle("First Program");   //Set Title
  setSize(300, 300);
  setLayout(new FlowLayout(FlowLayout.CENTER));               //setting frame Layout.
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
  secondprog ta = new secondprog();
  
 }
}
