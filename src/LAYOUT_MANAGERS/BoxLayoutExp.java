
package LAYOUT_MANAGERS;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;

public class BoxLayoutExp extends JFrame{
    
    JButton bt1,bt2,bt3,bt4,bt5,bt6;
    BoxLayout bx;
    public BoxLayoutExp()
    {
        createLayout();
        createButton();
        createFrame();
        addContainer();
    }
    
    private void createButton()
    {
        bt1=new JButton("Button1");
        bt1.setBackground(Color.RED);
        
        bt2=new JButton("Button2");
        bt2.setBackground(Color.RED);
        
        bt3=new JButton("Button3");
        bt3.setBackground(Color.RED);
        
        bt4=new JButton("Button4");
        bt4.setBackground(Color.RED);
        
        bt5=new JButton("Button5");
        bt5.setBackground(Color.RED);
        
    }
    private BoxLayout createLayout()
    {
        bx=new BoxLayout(this,BoxLayout.X_AXIS);
        //fl.setHgap(10);
        //fl.setVgap(15);
        return bx;
    }
    private void createFrame()
    {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of BoxLayout");
        this.setLocationRelativeTo(null);
        this.setLayout(createLayout());
        this.setVisible(true);
        
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        c.add(bt1);
        c.add(bt2);
        c.add(bt3);
        c.add(bt4);
        c.add(bt5);
        
    }
    public static void main(String[] args) {
        
        BoxLayoutExp obj = new BoxLayoutExp();
    }
    
}
