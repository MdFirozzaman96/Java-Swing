
package SWING;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonIcon extends JFrame{
    
    public ButtonIcon()
    {
        
        setTitle("Displaying Image on The Button.");
        
        JButton b=new JButton(new ImageIcon("C:\\Users\\HP\\Downloads\\360_F_294619296_5vqYj1CaPI4D2UtdzX6iwGiLOLFBeEnZ.jpg"));
        
        b.setBounds(100,100,100,40);
        
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    public static void main(String[] args) {
        
        new ButtonIcon();
    }
    
}
