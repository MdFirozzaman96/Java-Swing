
package SWING;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class ContainerExp extends JFrame{
    
    private Container c;
    private JLabel lb1;
    private Font f;
    public ContainerExp()
    {
        c=getContentPane();
        setLayout(null);
        setSize(500,500);
        c.setBackground(new Color(200,80,50));
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        
        f=new Font("Times New Roman",Font.ITALIC,20);
        
        lb1=new JLabel();
        lb1.setFont(f);
        lb1.setText("MD.FIROZZAMAN");
        lb1.setToolTipText("This is my name.");
        lb1.setBounds(100,100,200,50);
        lb1.setForeground(Color.WHITE);
        lb1.setOpaque(true);
        lb1.setBackground(Color.BLACK);
        
        setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(this, lb1.getToolTipText(),"Operation of getToolTipText()",JOptionPane.PLAIN_MESSAGE);
        c.add(lb1);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        ContainerExp obj = new ContainerExp();
    }
    
}
