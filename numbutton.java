import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
public class numbutton extends JFrame implements ActionListener {
    JLabel display;
    JTextField d;
    JButton num1,num5,num6,num7,num8,num9,num0;
    JButton num2;
    JButton num3;
    JButton num4;
    numbutton(){
        display =new JLabel("Display");
        d=new JTextField(20);
        num1=new JButton ("1");
        num2=new JButton("2");
        num3=new  JButton("3");
        num4 =new JButton("4");
        num5=new JButton("5");
        num6=new JButton("6");
        num7=new JButton("7");
        num8=new JButton("8");
        num9=new JButton("9");
        num0=new JButton("0");
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(display,BorderLayout.CENTER);add(d);
        add(num1);
        add(num2);
        add(num3);
        add(num4);
        add(num5);
        add(num6);
        add(num7);
        add(num8);
        add(num9);
        add(num0);
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[] args) {
       new numbutton(); 
    }
}
