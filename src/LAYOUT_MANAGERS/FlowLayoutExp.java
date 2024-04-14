
package LAYOUT_MANAGERS;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Container;

public class FlowLayoutExp extends JFrame{
    
    JButton bt1,bt2,bt3,bt4,bt5,bt6;
    FlowLayout fl;
    public FlowLayoutExp()
    {
        createLayout();
        createButton();
        createFrame();
        addContainer();
    }
    
    private void createButton()
    {
        bt1=new JButton("1");
        bt1.setBackground(Color.RED);
        
        bt2=new JButton("2");
        bt2.setBackground(Color.RED);
        
        bt3=new JButton("3");
        bt3.setBackground(Color.RED);
        
        bt4=new JButton("4");
        bt4.setBackground(Color.RED);
        
        bt5=new JButton("5");
        bt5.setBackground(Color.RED);
        
    }
    private FlowLayout createLayout()
    {
        fl=new FlowLayout(FlowLayout.LEFT,20,20);
        //fl.setHgap(10);
        //fl.setVgap(15);
        return fl;
    }
    private void createFrame()
    {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of FlowLayout");
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
        
        FlowLayoutExp obj=new FlowLayoutExp();
    }
    
}
