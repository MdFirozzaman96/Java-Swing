
package LAYOUT_MANAGERS;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExp extends JFrame implements ActionListener{
    
    JButton bt1,bt2,bt3,bt4;
    Container c;
    CardLayout card;
    public CardLayoutExp()
    {
        createLayout();
        createButton();
        createFrame();
        addContainer();
        addAction();
    }
    
    private void createButton()
    {
        bt1=new JButton("Am");
        bt1.setBackground(Color.RED);
        
        bt2=new JButton("Jam");
        bt2.setBackground(Color.RED);
        
        bt3=new JButton("Kathal");
        bt3.setBackground(Color.RED);
        
        bt4=new JButton("Lichu");
        bt4.setBackground(Color.RED);
        
    }
    private CardLayout createLayout()
    {
        card=new CardLayout(40,20);
        return card;
    }
    private void createFrame()
    {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of CardLayout");
        this.setLocationRelativeTo(null);
        this.setLayout(createLayout());
        this.setVisible(true);
        
    }
    private void addContainer()
    {
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        c.add("A",bt1);
        c.add("B",bt2);
        c.add("C",bt3);
        c.add("D",bt4);
        
    }
    
    private void addAction()
    {
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        card.next(c);
    }
    public static void main(String[] args) {
        
        CardLayoutExp obj=new CardLayoutExp();
    }
    
}