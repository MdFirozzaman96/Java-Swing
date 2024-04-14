
package SWING;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class MultipleActionListener extends JFrame{
    
    private Container c;
    static JTextField tf;
    static JPasswordField pass;
    static JButton bt;
    
    public MultipleActionListener()
    {
        setJFrame();
        initFont();
        initJTextField();
        initPasswordField();
        createButton();
        createCursor();
        getIcon();
        addContainer();
        addAction();
    }
    private void setJFrame()
    {
        this.setSize(600,500);
        this.setLayout(null);
        this.setTitle("Multiple Action Listener");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private Font initFont()
    {
        Font f;
        f=new Font("Times New Roman",Font.BOLD+Font.ITALIC,25);
        return f;
    }
    
    private void initJTextField()
    {
        tf=new JTextField();
        tf.setBounds(100,100,200,40);
        tf.setFont(initFont());
        tf.setForeground(Color.RED);
    }
    
    private void initPasswordField()
    {
        pass=new JPasswordField();
        pass.setBounds(100,150,200,40);
        pass.setEchoChar('*');
        pass.setFont(initFont());
        pass.setForeground(Color.BLUE);
    }
    private void createButton()
    {
        bt=new JButton(getIcon());
        bt.setBounds(100,210,100,50);
        bt.setCursor(createCursor());
    }
    private Cursor createCursor()
    {
        Cursor cr=new Cursor(Cursor.HAND_CURSOR);
        return cr;
    }
    private ImageIcon getIcon()
    {
        ImageIcon img=new ImageIcon(getClass().getResource("clear.jpg"));
        return img;
    }
    private void addContainer()
    {
        c=this.getContentPane();
        c.setBackground(Color.GRAY);
        c.add(tf);
        c.add(pass);
        c.add(bt);
    }
    
    private void addAction()
    {
        ActionHandler action = new ActionHandler();
        tf.addActionListener(action);
        pass.addActionListener(action);
        bt.addActionListener(action);
    }
    
    public static void main(String[] args) {
        
        MultipleActionListener obj = new MultipleActionListener();
    }  
      
}

class ActionHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==MultipleActionListener.tf)
        {
            String msg=MultipleActionListener.tf.getText();
            if(msg.isEmpty()!=true)
            {
                JOptionPane.showMessageDialog(null,"tf : "+msg );
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You Did Not Enter Anything." );
            }
        }
        if(event.getSource()==MultipleActionListener.pass)
        {
            String msg=MultipleActionListener.pass.getText();
            if(msg.isEmpty()!=true)
            {
                JOptionPane.showMessageDialog(null,"pass : "+msg );
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You Did Not Enter Anything." );
            }
        }
        if(event.getSource()==MultipleActionListener.bt)
        {
            MultipleActionListener.tf.setText("");
            MultipleActionListener.pass.setText("");
        }
    }
    
}