
package SWING;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;

public class JFrameIcon extends JFrame{
    
    Container c;
    public JFrameIcon()
    {
        IconInit();
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("MD.FIROZAMAN SARKER");
        c=this.getContentPane();
        c.setBackground(new Color(180,50,40));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void IconInit()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("Firoz_1.jpg"));
        setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        
        JFrameIcon obj = new JFrameIcon();
    }
    
}
