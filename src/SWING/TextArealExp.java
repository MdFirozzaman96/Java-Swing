
package SWING;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextArealExp extends JFrame implements ActionListener{
    
    JTextField tf1,tf2;
    JLabel lb;
    JButton add,sub,mul,div,mod;
    public TextArealExp()
    {
        setTitle("An example of JLabel.");
        
        tf1=new JTextField();
        tf1.setBounds(50,50,100,30);
        tf2=new JTextField();
        tf2.setBounds(50,100,100,30);
        
        lb=new JLabel();
        lb.setBounds(50,160,100,40);
        
        add=new JButton("+");
        add.setBounds(50,300,50,50);
        add.addActionListener(this);
        
        sub=new JButton("-");
        sub.setBounds(110,300,50,50);
        sub.addActionListener(this);
        
        mul=new JButton("*");
        mul.setBounds(170,300,50,50);
        mul.addActionListener(this);
        
        div=new JButton("/");
        div.setBounds(230,300,50,50);
        div.addActionListener(this);
        
        mod=new JButton("%");
        mod.setBounds(290,300,50,50);
        mod.addActionListener(this);
        
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        
        add(tf1);
        add(tf2);
        add(lb);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent obj)
    {
        String s1,s2;
        s1=tf1.getText();
        s2=tf2.getText();
        
        int x,y,z;
        x=Integer.parseInt(s1);
        y=Integer.parseInt(s2);
        
        if(obj.getSource()==add)
        {
            z=x+y;
        }
        else if(obj.getSource()==sub)
        {
            z=x-y;
        }
        else if(obj.getSource()==mul)
        {
            z=x*y;
        }
        else if(obj.getSource()==div)
        {
            z=x/y;
        }
        else
        {
            z=x%y;
        }
        
        String result=String.valueOf(z);
        lb.setText("Result : "+result);
    }
    
    public static void main(String[] args) {
        
        TextArealExp obj = new TextArealExp();
    }
    
}
