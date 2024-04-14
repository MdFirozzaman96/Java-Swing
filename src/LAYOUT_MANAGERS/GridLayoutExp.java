
package LAYOUT_MANAGERS;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;

public class GridLayoutExp extends JFrame{
    
    JButton bt[];
    GridLayout grid;
    public GridLayoutExp()
    {
        createLayout();
        createButton();
        createFrame();
        addContainer();
    }
    
    private void createButton()
    {
       bt=new JButton[10];
       for(int i=0;i<10;i++)
       {
            bt[i]=new JButton(""+(i+1));
            bt[i].setBackground(Color.RED);
       }
    }
    private GridLayout createLayout()
    {
        grid=new GridLayout(5,2,10,10);
        //grid.setHgap(10);
        //grid.setVgap(15);
        return grid;
    }
    private void createFrame()
    {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of GridLayout");
        this.setLocationRelativeTo(null);
        this.setLayout(createLayout());
        this.setVisible(true);
        
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        
        for(int i=0;i<10;i++)
        {
            c.add(bt[i]);
        }
        
    }
    public static void main(String[] args) {
        
        GridLayoutExp obj=new GridLayoutExp();
    }
    
}
