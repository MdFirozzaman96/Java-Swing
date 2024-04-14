
package SWING;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

public class JOptionPaneExp extends WindowAdapter{
    
    JFrame fr;
    public JOptionPaneExp()
    {
        fr=new JFrame("JOptionPane's Methods.");
        fr.setSize(500,500);
        fr.setLayout(null);
        fr.setVisible(true);
        
        //JOptionPane.showMessageDialog(fr, "This is message dialog.");
        ImageIcon img=new ImageIcon("IMG_20200310_174516.jpg");
        JOptionPane.showMessageDialog(fr,"Message is updated","Title",JOptionPane.PLAIN_MESSAGE,img);
        String name=JOptionPane.showInputDialog(null,"Enter Name : ");
        JOptionPane.showMessageDialog(null, name);
        fr.addWindowListener(this);
    }
    @Override
    public void windowClosing(WindowEvent e)
    {
        int dec=JOptionPane.showConfirmDialog(fr,"Are you sure ?");
        if(dec==JOptionPane.YES_OPTION)
        {
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
        
        JOptionPaneExp obj = new JOptionPaneExp();
    }
    
}
