
package LOG_IN_FRAME;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import MULTIPLICATION_TABLE.MultiplicationTable;

public class LogIn extends JFrame{
    
    JLabel userName,password;
    JTextField nameField;
    JPasswordField passwordField;
    JButton clear,login;
    public LogIn()
    {
        createFrame();
        createFont();
        clearIcon();
        loginIcon();
        createCursor();
        createLabel();
        createTextField();
        createPasswordField();
        createButton();
        
        addContainer();
        addAction();
    }
    private void createFrame()
    {
        this.setSize(600,500);
        this.setTitle("LogIn Frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    private void addContainer()
    {
        Container c;
        c=this.getContentPane();
        c.setBackground(Color.GRAY);
        c.add(userName);
        c.add(password);
        c.add(nameField);
        c.add(passwordField);
        c.add(clear);
        c.add(login);
    }
    private Font createFont()
    {
        Font f=new Font("Times New Roman",Font.BOLD+Font.ITALIC,17);
        return f;
    }
    private ImageIcon clearIcon()
    {
        ImageIcon img=new ImageIcon(getClass().getResource("clear.jpg"));
        return img;
    }
    private ImageIcon loginIcon()
    {
        ImageIcon img=new ImageIcon(getClass().getResource("login.png"));
        return img;
    }
    private Cursor createCursor()
    {
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        return c;
    }
    private void createLabel()
    {
        userName=new JLabel("Enter your user name :");
        userName.setBounds(40,40,180,40);
        userName.setFont(createFont());
        userName.setForeground(Color.CYAN);
        
        password=new JLabel("Enter your password :");
        password.setBounds(40,90,180,40);
        password.setFont(createFont());
        password.setForeground(Color.CYAN);
    }
    private void createTextField()
    {
        nameField=new JTextField();
        nameField.setBounds(220,45,230,30);
        nameField.setFont(createFont());
        nameField.setForeground(Color.RED);
    }
    private void createPasswordField()
    {
        passwordField=new JPasswordField();
        passwordField.setBounds(220,95,230,30);
        passwordField.setFont(createFont());
        passwordField.setForeground(Color.RED);
        passwordField.setEchoChar('*');
    }
    private void createButton()
    {
        clear=new JButton();
        clear.setBounds(375,145,75,30);
        clear.setIcon(clearIcon());
        clear.setCursor(createCursor());
        
        login=new JButton();
        login.setBounds(280,145,75,30);
        login.setIcon(loginIcon());
        login.setCursor(createCursor());
    }
    
    private void addAction()
    {
        ActionHandler action=new ActionHandler();
        clear.addActionListener(action);
        login.addActionListener(action);
        passwordField.addActionListener(action);
    }
    public static void main(String[] args) {
        
        LogIn obj = new LogIn();
    }
 
    class ActionHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==clear)
            {
                String str=nameField.getText();
                if(str.isEmpty()==true)
                {
                    JOptionPane.showMessageDialog(null, "You did not enter anythig.");
                }
                nameField.setText("");
                passwordField.setText("");
            }
            if(event.getSource()==passwordField)
            {
                String pass=passwordField.getText();
                JOptionPane.showMessageDialog(null,pass);
            }
            if(event.getSource()==login)
            {
                String userName,password;
                userName=nameField.getText();
                password=passwordField.getText();
                if(userName.equals("firoz96")&&password.equals("130"))
                {
                    JOptionPane.showMessageDialog(null,"Your are successfully loged in.");
                    dispose();
                    //LogedInFrame log=new LogedInFrame();
                    //log.setVisible(true);
                    MultiplicationTable MTable = new MultiplicationTable();
                    MTable.setVisible(rootPaneCheckingEnabled);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Wrong passowrd or username !");
                }
            }
        }
    }
    
}
