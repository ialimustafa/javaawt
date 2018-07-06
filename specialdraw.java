import java.awt.*;  
import java.awt.event.*;  
public class specialdraw extends Frame implements MouseMotionListener,ActionListener{ 
    Button b1;
    Checkbox c1; 
    int eraser_mode=0;
    specialdraw(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
            System.exit(0);
            }
           });
           c1=new Checkbox("Eraser Mode",false);
           c1.setBounds(40,160,50,50);
           b1=new Button("Clear");
           b1.setBounds(40,40, 50, 50);
           add(c1);
           add(b1);
        addMouseMotionListener(this);
        b1.addActionListener(this);  
         c1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                eraser_mode=(e.getStateChange()==1?1:0);
            }  
         });   
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        Graphics g=getGraphics();  
        g.clearRect(0, 0,2000,2000);  
    }  

public void mouseDragged(MouseEvent e) {  
    Graphics g=getGraphics();
    if(eraser_mode==0)
    {  
        
    g.setColor(Color.BLUE);  
    g.fillOval(e.getX(),e.getY(),20,20);  
    }
    else if(eraser_mode==1)
    {
        g.clearRect(e.getX(),e.getY(),20,20);
    }
}  
public void mouseMoved(MouseEvent e) {}  
  
public static void main(String[] args) {  
    new specialdraw();  
}  
}  