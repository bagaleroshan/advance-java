import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class hello extends JFrame{
    JLabel lblname;
JButton btn;
JTextField fname;

    hello(){
        lblname=new JLabel("Name");
        btn =new JButton("Button");
        fname=new JTextField(20);

        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lblname);
        add(btn);
        add(fname);
        }
    public static void main(String[] args) {
        new hello();
    }
}