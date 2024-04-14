
package SWING;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LabelImage extends JFrame{
    
    private JLabel lb;
    private ImageIcon img;
    public LabelImage()
    {
        setSize(500,500);
        initComponent();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        add(lb);
    }
    private void initComponent()
    {
        lb=new JLabel();
        img=new ImageIcon(getClass().getResource("Firoz_1.jpg"));
        lb.setIcon(img);
        lb.setBounds(100,100,300,300);
    }
    
    public static void main(String[] args) {
        
        LabelImage obj = new LabelImage();
    }
    
}
