
package LAYOUT_MANAGERS;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class SlideShowExp extends JFrame{
    
    JButton next,prev;
    BorderLayout bl;
    Panel pn;
    ImageIcon icon;
    JLabel lb;
    CardLayout card;
    public SlideShowExp()
    {
        createButton();
        createCursor();
        createLayout();
        createFrame();
        createPanel();
        setImage();
        addContainer();
    }
    public Font createFont(int size)
    {
        Font f=new Font("Times New Roman",Font.BOLD,size);
        return f;
    }
    
    private void createButton()
    {
        prev=new JButton("Previous");
        prev.setBounds(100,600,100,40);
        prev.setBackground(Color.RED);
        prev.setCursor(createCursor());
        prev.setFont(createFont(16));
        
        next=new JButton("Next");
        next.setBounds(600,600,100,40);
        next.setBackground(Color.RED);
        next.setCursor(createCursor());
        next.setFont(createFont(16));
        
    }
    private Cursor createCursor()
    {
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        return c;
    }
    private void createLayout()
    {
        card=new CardLayout();
    }
    private void createFrame()
    {
        this.setSize(800,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Slide Show");
        this.setLocationRelativeTo(null);
        //this.setLayout(null);
        this.setVisible(true);
        
    }
  
    private void createPanel()
    {
        pn=new Panel(card);
        pn.setBounds(100,50,600,500);
        pn.setBackground(Color.yellow);
    }
    private void setImage()
    {
        //String imageNames[]={"firoz1.jpg","firoz2.png","firoz3.jpg","firoz4.jpg","firoz5.jpg"};//,"firoz6.jpg","firoz7.jpg","firoz8.JPG","firoz9.JPG"
        //for(String name:imageNames)
        //{
            icon=new ImageIcon(getClass().getResource("firoz1.jpg"));
            lb=new JLabel(icon);
            pn.add(lb);
            
        //}
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        c.add(pn);
        c.add(prev);
        c.add(next);
        
    }
    public static void main(String[] args) {
        
        SlideShowExp obj=new SlideShowExp();
    }
    
}
