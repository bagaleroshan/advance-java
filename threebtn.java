import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class threebtn extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JTextField o;
   public threebtn(){
b1=new JButton("b1");
b2=new JButton("b2");
b3=new JButton("b3");
o=new JTextField(20);
setSize(300,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
add(b1);
add(b2);
add(b3);
add(o);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            o.setText("hyy");
        }
    }
    public static void main(String[] args) {
        new threebtn();
    }
}
