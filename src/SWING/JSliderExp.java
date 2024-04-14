
package SWING;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;


public class JSliderExp extends JFrame{
    
    JSlider slider;
            
    public JSliderExp()
    {
        createFrame();
        createSlider();
        addContainer();
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
    private void createSlider()
    {
        slider=new JSlider(-50,50,0);
        slider.setBounds(100,100,300,50);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBackground(Color.CYAN);
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        c.add(slider);
       
    }
    
    public static void main(String[] args) {
        
        JSliderExp obj = new JSliderExp();
    }
}
