import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class copytext extends JFrame implements ActionListener{
JTextField t1,t2;
JButton btn;
public copytext(){
    t1=new JTextField(20);
    t2=new JTextField(20);
    btn=new JButton("click");
    setSize(300,300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(t1);
    add(t2);
    add(btn);
    btn.addActionListener(this);
}
    public void actionPerformed(ActionEvent ae){
String s=t1.getText();
t2.setText(s);
t1.setText("");
    }
    public static void main(String[] args) {
        new copytext();
    }
}
