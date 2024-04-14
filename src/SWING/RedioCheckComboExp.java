
package SWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.FocusListener;

public class RedioCheckComboExp extends JFrame{
    
    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JButton click,confirm;
    JCheckBox cb1,cb2,cb3,cb4;
    JComboBox combo;
    JLabel radioLabel,boxLabel,comboLabel;
    JTextField tf;
    
    public RedioCheckComboExp()
    {
        
        createFrame();
        getIcon();
        getImage();
        createCursor();
        createLabel();
        createRadioButton();
        createCheckBox();
        createComboBox();
        createButtonGroup();
        createButton();
        createTextField();
        addContainer();
        addAction();
    }
    public Font getFont(int fontSize)
    {
        Font f=new Font("Times New Roman",Font.ITALIC+Font.BOLD,fontSize);
        return f;
    }
    private void createFrame()
    {
        this.setSize(1000,700);
        this.setTitle("JRadioButton");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setIconImage(getIcon().getImage());
        this.setVisible(true);
    }
    private ImageIcon getIcon()
    {
        ImageIcon img=new ImageIcon(getClass().getResource("Firoz.jpg"));
        return img;
    }
    private ImageIcon getImage()
    {
        ImageIcon img=new ImageIcon(getClass().getResource("click.png"));
        return img;
    }
    private Cursor createCursor()
    {
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        return c;
    }
    private void createLabel()
    {
        radioLabel=new JLabel("JRadioButton :");
        radioLabel.setBounds(100,10,200,50);
        radioLabel.setForeground(Color.RED);
        radioLabel.setFont(getFont(25));
        
        boxLabel=new JLabel("JCheckBox :");
        boxLabel.setBounds(350,10,150,50);
        boxLabel.setForeground(Color.RED);
        boxLabel.setFont(getFont(25));
        
        comboLabel=new JLabel("JComboBox :");
        comboLabel.setBounds(600,10,150,50);
        comboLabel.setForeground(Color.RED);
        comboLabel.setFont(getFont(25));
    }
    private void createRadioButton()
    {
        rb1=new JRadioButton("Male");
        rb1.setBounds(100,60,200,80);
        rb1.setBackground(Color.CYAN);
        rb1.setFont(getFont(20));
        //rb1.setEnabled(false);
        
        rb2=new JRadioButton("Female");
        rb2.setBounds(100,110,200,80);
        rb2.setBackground(Color.CYAN);
        rb2.setFont(getFont(20));
        //rb2.setSelected(true);
    }
    private void createCheckBox()
    {
        cb1=new JCheckBox();
        cb1.setText("C");
        cb1.setBounds(350,70,100,40);
        cb1.setFont(getFont(20));
        cb1.setBackground(Color.CYAN);
        
        cb2=new JCheckBox();
        cb2.setText("C++");
        cb2.setBounds(350,110,100,40);
        cb2.setFont(getFont(20));
        cb2.setBackground(Color.CYAN);
        
        cb3=new JCheckBox();
        cb3.setText("Java");
        cb3.setBounds(350,150,100,40);
        cb3.setFont(getFont(20));
        cb3.setSelected(true);
        cb3.setBackground(Color.CYAN);
        
        cb4=new JCheckBox();
        cb4.setText("Python");
        cb4.setBounds(350,190,100,40);
        cb4.setFont(getFont(20));
        cb4.setBackground(Color.CYAN);
    }
    private void createComboBox()
    {
        String lang[]={"C","C++","Java","Python","R","C#","Kotlin"};
        combo=new JComboBox(lang);
        combo.setBounds(600,70,80,30);
        combo.setFont(getFont(20));
        combo.setBackground(Color.CYAN);
        combo.setSelectedIndex(2);
        combo.addItem("Assembly");
        combo.addItem("Munna");
        combo.removeItem("Munna");
        combo.removeItemAt(0);
        combo.getItemCount();
        //combo.removeAllItems();
        
    }
    private void createButtonGroup()
    {
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        bg.add(cb1);
        bg.add(cb2);
    }
    private void createButton()
    {
        click=new JButton();
        click.setBounds(100,250,120,40);
        click.setIcon(getImage());
        click.setCursor(createCursor());
        
        confirm=new JButton("Confirm");
        confirm.setBounds(350,250,120,40);
        confirm.setCursor(createCursor());
        confirm.setBackground(Color.RED);
        confirm.setForeground(Color.WHITE);
        Font f=new Font("Times New Roman",Font.BOLD,23);
        confirm.setFont(f);
    }
    private void createTextField()
    {
        tf=new JTextField("Focus Listener");
        tf.setBounds(830,5,150,70);
        tf.setFont(getFont(20));
        tf.setForeground(Color.BLUE);
        tf.setBackground(Color.PINK);
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        c.add(rb1);
        c.add(rb2);
        c.add(click);
        c.add(radioLabel);
        c.add(boxLabel);
        c.add(comboLabel);
        c.add(combo);
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);
        c.add(cb4);
        c.add(confirm);
        c.add(tf);
    }
    private void addAction()
    {
        ActionHandler action=new ActionHandler();
        click.addActionListener(action);
        confirm.addActionListener(action);
        combo.addActionListener(action);
        
        FocusHandler focus=new FocusHandler();
        click.addFocusListener(focus);
        confirm.addFocusListener(focus);
        combo.addFocusListener(focus);
    }
    
    class ActionHandler implements ActionListener{
        
        @Override
            public void actionPerformed(ActionEvent event)
            {
                if(event.getSource()==click)
                {
                    if(rb1.isSelected())
                    {
                        JOptionPane.showConfirmDialog(null, "Are You "+rb1.getText()+"?");
                    }
                    else
                    {
                        JOptionPane.showConfirmDialog(null, "Are You "+rb2.getText()+"?");
                    }
                }
                else if(event.getSource()==confirm)
                {
                    String select="";
                    if(cb1.isSelected())
                    {
                        select+=(cb1.getText()+",");
                    }
                    if(cb2.isSelected())
                    {
                        select+=(cb2.getText()+",");
                    }
                    if(cb3.isSelected())
                    {
                        select+=(cb3.getText()+",");
                    }
                    if(cb4.isSelected())
                    {
                        select+=(cb4.getText()+",");
                    }
                    
                    JOptionPane.showMessageDialog(null,"Your Have Selected : "+select);
                }
                else if(event.getSource()==combo)
                {
                    String msg=combo.getSelectedItem().toString();
                    JOptionPane.showMessageDialog(null,"You have selected "+msg);
                }
                
            }
        
    }
    
    class FocusHandler implements FocusListener{

        @Override
        public void focusGained(FocusEvent fe) {
            
            tf.setText("");
            tf.setText("Focus Gained");
        }

        @Override
        public void focusLost(FocusEvent fe) {
            tf.setText("");
            tf.setText("Focus Lost");
        }    
        
    }
    
    public static void main(String[] args) {
        
        RedioCheckComboExp obj = new RedioCheckComboExp();
    }
    
    
}
