
package SWING;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class JTextFieldExp extends JFrame{
    
    JTextField tf,tf1;
    Container c;
    Font f;
    public JTextFieldExp()
    {
        this.setSize(500,500);
        this.setTitle("JText Field Creation");
        this.setLocationRelativeTo(null);
        initComponent();
        initIcon();
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    private void initComponent()
    {
        c=this.getContentPane();
        this.setLayout(null); 
        c.setBackground(Color.GRAY);
        tf=new JTextField("Md.Firozzaman");
        tf.setBounds(100,100,200,50);
        tf.setForeground(Color.red);
        f=new Font("Times New Roman",Font.ITALIC+Font.BOLD,25);
        tf.setFont(f);
        tf.setBackground(Color.BLACK);
        
        tf1=new JTextField();
        tf1.setBounds(100,160,200,50);
        tf1.setFont(f);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setForeground(Color.RED);
        
        this.add(tf);
        this.add(tf1);
        
        tf.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent event)
            {
                String msg=tf.getText();
                if(msg.isEmpty()!=true)
                {
                    JOptionPane.showMessageDialog(null,"tf : "+msg);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"The text is empty.Please enter anything.");
                }
            }
        
        });
        tf1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent event)
            {
                String msg=tf1.getText();
                if(msg.isEmpty()!=true)
                {
                    JOptionPane.showMessageDialog(null,"tf1 : "+msg);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"The text is empty.Please enter anything.");
                }
            }
        
        });
        
    }
    private void initIcon()
    {
        ImageIcon img=new ImageIcon(getClass().getResource("Firoz_1.jpg"));
        setIconImage(img.getImage());
    }
    
    public static void main(String[] args) {
        
        JTextFieldExp  obj = new JTextFieldExp();
    }
    
}
