
package SWING;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

public class JTableExp2 extends JFrame{
    
    public JTableExp2()
    {
        setTitle("JTable with action Listener.");
        setSize(500,500);
        
        String column[]={"Id","Name","Salary"};
        String data[][]={{"101","Ripon","15000"},{"102","Apon","17000"},{"103","Milon","20000"}};
        
        JTable tb = new JTable(data,column);
        tb.setCellSelectionEnabled(true);
        ListSelectionModel select=tb.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane sp=new JScrollPane(tb);    
        add(sp);  
        setVisible(true);  
    }
    
    public static void main(String[] args) {
        
        JTableExp2 obj=new JTableExp2();
    }
    
}
