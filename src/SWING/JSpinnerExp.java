
package SWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerExp extends JFrame implements ChangeListener{
    
    JSpinner spinner;
    JLabel label;
    public JSpinnerExp()
    {
        iconImage();
        createFrame();
        createSpinner();
        createLabel();
        addContainer();
        addAction();
    }
    public Font createFont(int size)
    {
        Font f=new Font("Times New Roman",Font.BOLD,size);
        return f;
    }
    
    private ImageIcon iconImage()
    {
        ImageIcon icon=new ImageIcon(getClass().getResource("Md_Firozzaman.png"));
        return icon;
    }
    private void createFrame()
    {
        this.setSize(1000,730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of JSpinner");
        this.setIconImage(iconImage().getImage());
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
    }
    private void createSpinner()
    {
        SpinnerModel v=new SpinnerNumberModel(10,-10,30,2);
        
        spinner=new JSpinner(v);
        spinner.setBounds(100,100,60,40);
        spinner.setFont(createFont(16));
        
        this.setVisible(true);
    }
    private void createLabel()
    {
        label=new JLabel("MD.FRIOZZAMAN");
        label.setBounds(300,100,300,50);
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        c.add(spinner);
        c.add(label);
    }
    
    private void addAction()
    {
       spinner.addChangeListener(this);
    }
    @Override
    public void stateChanged(ChangeEvent ce) {
        
        int x=(int)spinner.getValue();
        label.setFont(createFont(x));
    }
    public static void main(String[] args) {
        
        JSpinnerExp obj = new JSpinnerExp();
    }
    
}
