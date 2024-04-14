
package SWING;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JTableExp1 extends JFrame{
    
    public JTableExp1()
    {
        setSize(500,500);
        setTitle("Table Construction.");
        
        String column[]={"Id","Name","Salary"};
        String data[][]={{"101","Ripon","15000"},{"102","Apon","17000"},{"103","Milon","20000"}};
        JTable tb=new JTable(data,column);
        tb.setBounds(200,200,200,300);
        JScrollPane scroll = new JScrollPane(tb);
        add(scroll);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        JTableExp1 obj = new JTableExp1();
    }
    
}
