
package SWING;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JMenuExp extends JFrame implements ActionListener{
    
    private MenuBar menuBar;
    private Menu file,edit,view,refactor;
    private MenuItem newFrame,newProject,openFile,save,saveAs,exit,cut,copy,Copy,paste,rename,move,safelyDelete;
    
    public JMenuExp()
    {
        iconImage();
        createMenuItem();
        createMenu();
        createMenuBar();
        createFrame();
        addAction();
    }
    private ImageIcon iconImage()
    {
        ImageIcon icon=new ImageIcon(getClass().getResource("Md_Firozzaman.png"));
        return icon;
    }
    private void createMenuItem()
    {
        newFrame=new MenuItem("New Frame");
        newProject=new MenuItem("New Project");
        openFile=new MenuItem("Open File");
        save=new MenuItem("Save");
        saveAs=new MenuItem("Save As");
        exit=new MenuItem("Exit");
        
        cut=new MenuItem("Cut");
        copy=new MenuItem("Copy");
        paste=new MenuItem("Paste");
        
        rename=new MenuItem("Rename");
        move=new MenuItem("Move");
        Copy=new MenuItem("Copy");
        safelyDelete=new MenuItem("Safely Delete");
    }
    private void createMenu()
    {
        file=new Menu("File");
        file.add(newFrame);
        file.add(newProject);
        file.add(openFile);
        file.add(save);
        file.add(saveAs);
        file.add(exit);
        
        edit=new Menu("Edit");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        
        view=new Menu("View");
        
        refactor=new Menu("Refactor");
        refactor.add(rename);
        refactor.add(move);
        refactor.add(Copy);
        refactor.add(safelyDelete);
        
    }
    private void createMenuBar()
    {
        menuBar=new MenuBar();
        
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        menuBar.add(refactor);
    }
    private void createFrame()
    {
        this.setSize(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("An Example of Menu");
        this.setIconImage(iconImage().getImage());
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        this.setMenuBar(menuBar);
        
        this.setVisible(true);
        
    }
    
    private void addAction()
    {
        newFrame.addActionListener(this);
        exit.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==exit)
        {
            System.exit(0);
        }
        else if(event.getSource()==newFrame)
        {
            JFrame f=new JFrame("This Is A New Frame");
            
            f.setBounds(50,50,600,500);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setIconImage(iconImage().getImage());
            f.setLayout(null);
            f.setBackground(Color.yellow);
            f.getContentPane().setBackground(Color.GRAY);
            f.setVisible(true);
        }
    }
    public static void main(String[] args) {
        
        JMenuExp obj=new JMenuExp();
    }
    
}
