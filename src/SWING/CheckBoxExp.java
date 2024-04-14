
package SWING;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class CheckBoxExp extends JFrame implements ActionListener{
    
    JCheckBox cha,cofee,singara;
    JLabel lb;
    JButton bt;
    public CheckBoxExp()
    {
        setSize(500,500);
        setTitle("Food Order");
        
        cha=new JCheckBox("Cha 10 Tk");
        cofee=new JCheckBox("Cofee 20 Tk");
        singara=new JCheckBox("Singara 10 Tk");
        
        lb=new JLabel();
        lb.setText("Order Your Food : ");
        lb.setBounds(100,60,150,20);
        
        cha.setBounds(100,100,100,20);
        cofee.setBounds(100,140,100,20);
        singara.setBounds(100,180,150,20);
        
        bt=new JButton("Order");
        bt.setBounds(105,230,70,30);
        
        bt.addActionListener(this);
        
        setLayout(null);
        setVisible(true);
        
        add(cha);
        add(cofee);
        add(singara);
        add(lb);
        add(bt);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent obj)
    {
        float price=0;
        String msg="";
        if(cha.isSelected())
        {
            price+=10;
            msg+="Cha : 10 Tk\n";
        }
        if(cofee.isSelected())
        {
            price+=20;
            msg+="Cofee : 20 Tk\n";
        }
        if(singara.isSelected())
        {
            price+=10;
            msg+="Singara : 10 Tk";
        }
        
        msg+="\n-----------------\n";
        
        JOptionPane.showMessageDialog(this, msg+"Total : "+price+" Tk");
    }
    
    public static void main(String[] args) {
        
        CheckBoxExp obj = new CheckBoxExp();
    }
    
}
