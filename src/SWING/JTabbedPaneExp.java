
package SWING;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class JTabbedPaneExp extends JFrame{
    
    ImageIcon frameIcon,redIcon,greenIcon,blueIcon;
    JTabbedPane tp;
    JPanel pn1,pn2,pn3;
    JLabel red,green,blue;
    
    public JTabbedPaneExp()
    {
        createFrame();
        getIcon();
        createLabel();
        createPanel();
        createTabbedPane();
        addContainer();
    }
    
    private void createFrame()
    {
        this.setSize(1000,700);
        this.setTitle("A Simple Example of JTabbedPane");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    private void getIcon()
    {
        frameIcon=new ImageIcon(getClass().getResource("Firoz.jpg"));
        this.setIconImage(frameIcon.getImage());
        
        redIcon=new ImageIcon("Firoz.jpg");
        //greenIcon=new ImageIcon("src/Images/fiorz1.jpg");
        //blueIcon=new ImageIcon("src/Images/fiorz6.jpg");
    }
    private void createLabel()
    {
        red=new JLabel("RED");
        green=new JLabel("GREEN");
        blue=new JLabel("BLUE");
    }
    private void createPanel()
    {  
        pn1=new JPanel();
        pn2=new JPanel();
        pn3=new JPanel();
        
        pn1.add(red);
        pn2.add(green);
        pn3.add(blue);
        
        pn1.setBackground(Color.RED);
        pn2.setBackground(Color.GREEN);
        pn3.setBackground(Color.BLUE);
        
    }
    private void createTabbedPane()
    {
        tp=new JTabbedPane();
        tp.setBounds(100,100,800,500);
        
        tp.addTab("RED",redIcon,pn1);
        tp.addTab("GREEN",pn2);
        tp.addTab("BLUE",pn3);
        
        //tp.setTabPlacement(JTabbedPane.LEFT);
    }
    
    private void addContainer()
    {
        Container c=this.getContentPane();
        
        c.add(tp);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        
        JTabbedPaneExp obj = new JTabbedPaneExp();
    }
    
}
