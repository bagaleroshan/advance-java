import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class a extends JFrame {
    JLabel t1,t2;
    JTextField b,b1;
    JPanel jp,jp1;
    JButton btn;
    JLabel l;
    a(){
        jp=new JPanel();
        jp.setSize(300, 300);
        jp.setLayout(new GridLayout(2, 2));
        t1=new JLabel("t1");
        t2=new JLabel("t2");
        b=new JTextField(20);
        b1=new JTextField(20);
        btn=new JButton("button");
        jp.add(t1);
        jp.add(b);
        jp.add(t2);
        jp.add(b1);
        jp.add(btn);
        jp1=new JPanel();
l=new JLabel("next");
jp1.add(l);
jp1.setSize(300,100);
add(jp,BorderLayout.NORTH);
add(jp1,BorderLayout.SOUTH);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//setLayout(new FlowLayout());

    }
    public static void main(String[] args) {
        new a();
    }
}
