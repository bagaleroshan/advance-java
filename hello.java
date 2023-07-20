import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class hello extends JFrame{
    JLabel name;
JButton btn;
JTextField fname;

    hello(){
        name=new JLabel("Name");
        btn =new JButton(new ImageIcon("D:\\pp.jpg"));
        fname=new JTextField(20);
        btn.setBounds(200, 200, 200, 150);
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(name);
        add(fname);
        add(btn);
        }
    public static void main(String[] args) {
        new hello();
    }
}