import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tab extends JFrame {

 JTabbedPane tb;
 
 JPanel p,p1;
      
    tab(){  
        tb=new JTabbedPane();
        p=new JPanel();
p1=new JPanel();
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(tb);
       tb.add(p);
        tb.add(p1);
    }  
    public void actionPerformed (ActionEvent ae){
        JPanel p=new JPanel();
        p.setSize(200,200);
        p.setVisible(true);
        p.setLayout(new FlowLayout());
        add(p);
    }
    public static void main(String[] args) {  
        new tab();  
    }}  

