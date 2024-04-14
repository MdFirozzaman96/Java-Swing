
package MULTIPLICATION_TABLE;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MultiplicationTable extends JFrame{
    
    JLabel lb,lb1,image;
    JTextArea ta;
    JTextField number;
    JButton clear,X;
    ImageIcon labelImage,clearImage,multiplyImage;
    public MultiplicationTable()
    {
        createFrame();
        getIcon();
        getLabelImage();
        getClearImage();
        getMultiplyImage();
        //makeFont(int x);
        createLabel();
        createTextArea();
        createTextField();
        createCursor();
        createButton();
        addContainer();
        addActionListener();
    }
    private Font makeFont(int fontSize)
    {
        Font f=new Font("Times New Roman",Font.ITALIC+Font.BOLD,fontSize);
        return f;
    }
    private void createFrame()
    {
        this.setSize(700,700);
        this.setTitle("MULTIPLICATION TABLE");
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
    private ImageIcon getLabelImage()
    {
        labelImage=new ImageIcon(getClass().getResource("multiplication.jpg"));
        return labelImage;
    }
    private ImageIcon getClearImage()
    {
        clearImage=new ImageIcon(getClass().getResource("clear.jpg"));
        return clearImage;
    }
    private ImageIcon getMultiplyImage()
    {
        multiplyImage=new ImageIcon(getClass().getResource("mul.jpg"));
        return multiplyImage;
    }
    
    private void createLabel()
    {
        lb=new JLabel("MULTIPLICATION  TABLE");
        lb.setBounds(400,210,250,50);
        lb.setForeground(Color.RED);
        lb.setFont(makeFont(20));
        
        image=new JLabel();
        image.setBounds(40,10,600,200);
        image.setIcon(getLabelImage());
        
        lb1=new JLabel("ENTER AN INTEGER NUMBER :");
        lb1.setBounds(5,250,300,50);
        lb1.setFont(makeFont(20));
        lb1.setForeground(Color.DARK_GRAY);
    }
    private void createTextField()
    {
        number=new JTextField();
        number.setBounds(110,320,200,80);
        number.setForeground(Color.RED);
        number.setFont(makeFont(75));
    }
    private Cursor createCursor()
    {
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        return c;
    }
    private void createButton()
    {
        clear=new JButton();
        clear.setBounds(230,450,100,50);
        clear.setCursor(createCursor());
        clear.setIcon(getClearImage());
        
        X=new JButton();
        X.setBounds(90,445,85,60);
        X.setCursor(createCursor());
        X.setIcon(getMultiplyImage());
    }
    private void createTextArea()
    {
        ta=new JTextArea();
        ta.setBounds(370,250,300,400);
        ta.setBackground(Color.LIGHT_GRAY);
        ta.setForeground(Color.RED);
        ta.setFont(makeFont(25));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
    }
    private void addContainer()
    {
        Container c=this.getContentPane();
        c.setBackground(Color.CYAN);
        c.add(lb);
        c.add(ta);
        c.add(image);
        c.add(lb1);
        c.add(number);
        c.add(clear);
        c.add(X);
    }
    private void addActionListener()
    {
        ActionHandler action=new ActionHandler();
        X.addActionListener(action);
        clear.addActionListener(action);
    }
    public static void main(String[] args) {
        
        MultiplicationTable obj = new MultiplicationTable();
    }
    
    class ActionHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==X)
            {
                String x=number.getText();
                int n=Integer.parseInt(x);
                String txt,I,mul;
                for(int i=1;i<=13;i++)
                {
                    I=String.valueOf(i);
                    mul=String.valueOf(n*i);
                    txt="          "+n+"   X   "+I+"  ="+"  "+mul+"\n";
                    ta.append(txt);
                    //System.out.println(txt);
                    //System.out.println("Md.Firozzaman");
                }
            }
            if(event.getSource()==clear)
            {
                number.setText("");
                ta.setText("");
            }
        }
    }
    
}
