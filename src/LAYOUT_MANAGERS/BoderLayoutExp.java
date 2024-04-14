
package LAYOUT_MANAGERS;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

public class BoderLayoutExp extends JFrame{
    
    JButton bt1,bt2,bt3,bt4,bt5,bt6;
    BorderLayout bl;
    public BoderLayoutExp()
    {
        createLayout();
        createButton();
        createFrame();
        addContainer();
    }
    
    private void createButton()
    {
        bt1=new JButton("NORTH");
        bt1.setBackground(Color.RED);
        
        bt2=new JButton("SOUTH");
        bt2.setBackground(Color.RED);
        
        bt3=new JButton("EAST");
        bt3.setBackground(Color.RED);
        
        bt4=new JButton("WEST");
        bt4.setBackground(Color.RED);
        
        bt5=new JButton("CENTER");
        bt5.setBackground(Color.RED);
        
    }
    private BorderLayout createLayout()
    {
        bl=new BorderLayout();
        bl.setHgap(10);
        bl.setVgap(15);
        return bl;
    }
    private void createFrame()
    {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of Border Layout");
        this.setLocationRelativeTo(null);
        this.setLayout(createLayout());
        this.setVisible(true);
        
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        c.add(bt1,BorderLayout.NORTH);
        c.add(bt2,BorderLayout.SOUTH);
        c.add(bt3,BorderLayout.EAST);
        c.add(bt4,BorderLayout.WEST);
        c.add(bt5,BorderLayout.CENTER);
        
    }
    public static void main(String[] args) {
        
        BoderLayoutExp obj=new BoderLayoutExp();
    }
    
}
