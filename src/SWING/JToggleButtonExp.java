
package SWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;


public class JToggleButtonExp extends JFrame{
    
    JToggleButton tb;
    JLabel label;
    public JToggleButtonExp()
    {
        createFrame();
        createCursor();
        createToggle();
        createLabel();
        addContainer();
        addAction();
    }
    public Font createFont(int size)
    {
        Font f=new Font("Times New Roman",Font.BOLD,size);
        return f;
    }
    private void createFrame()
    {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of ToggleButton");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        
    }
    private Cursor createCursor()
    {
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        return c;
    }
    private void createToggle()
    {
        tb=new JToggleButton("ON");
        tb.setBounds(100,100,70,40);
        tb.setCursor(createCursor());
    }
    
    private void createLabel()
    {
        label=new JLabel();
        label.setBounds(100,150,300,50);
        label.setFont(createFont(18));
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);

        c.add(tb);
        c.add(label);
       
    }
    
    private void addAction()
    {
        tb.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent event)
            {
                if(tb.isSelected())
                {
                    tb.setText("OFF");
                    label.setText("The Toggle Button Is Active.");
                }
                else
                {
                    label.setText("");
                    tb.setText("OFF");
                }
            }
        });
    }
    public static void main(String[] args) {
        
        JToggleButtonExp obj = new JToggleButtonExp();
    }
    
}
