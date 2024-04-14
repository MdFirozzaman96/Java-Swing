
package LOG_IN_FRAME;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class LogedInFrame extends JFrame{
    
    JTextArea ta;
    JScrollPane scroll;
    public LogedInFrame()
    {
        createFrame();
        makeFont();
        createTextArea();
        createScrollPane();
        addContainer();
    }
    private void createFrame()
    {
        this.setSize(500,500);
        this.setTitle("Successfully LognedIn");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private Font makeFont()
    {
        Font f=new Font("Times New Roman",Font.ITALIC,16);
        return f;
    }
    private void createTextArea()
    {
        ta=new JTextArea();
        //ta.setBounds(50,100,400,200);
        ta.setBackground(Color.LIGHT_GRAY);
        ta.setForeground(Color.BLACK);
        ta.setFont(makeFont());
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
    }
    private void createScrollPane()
    {
        scroll=new JScrollPane(ta);
        scroll.setBounds(50,100,400,200);
    }
    private void addContainer()
    {
        Container c;
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.add(scroll);
    }
    
    public static void main(String[] args) {
        
        LogedInFrame obj = new LogedInFrame();
    }
    
}
