import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
public class panel extends JFrame {
    JLabel name;
    JLabel address;
    JTextField fname;
    JTextField fadd;
    JButton btn;
    panel(){
        name=new JLabel("name");
        fname=new JTextField(20);
        address=new JLabel("address");
        fadd=new JTextField(20);
        btn=new JButton("button");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        add(name,BorderLayout.NORTH);
        add(fname,BorderLayout.WEST);
        add(address,BorderLayout.SOUTH);
        add(fadd,BorderLayout.EAST);
        add(btn,BorderLayout.CENTER);
    }
public static void main(String[] args) {
    new panel();
}
}
