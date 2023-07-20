import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pin extends JFrame implements  ActionListener {
    JLabel l,m;
    JTextField tf,o;
    JButton btn;
    public pin(){
        l=new JLabel("number ");
        m=new JLabel("message");
        tf=new JTextField(20);
        o= new JTextField(20);
        btn=new JButton("click");
setTitle("Phone Pin");
setSize(300, 300);   
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
add(l);add(tf);
add(m);add(o);
add(btn);
btn.addActionListener(this);
}  
public void actionPerformed(ActionEvent ae){
int n=Integer.parseInt(tf.getText());
if(ae.getSource()==btn){


if(n==1234){
o.setText("welcome");
} 

if(n!=1234){
    o.setText("wrong");
}
}
}
public static void main  (String[] args){
    new pin();
}
}
