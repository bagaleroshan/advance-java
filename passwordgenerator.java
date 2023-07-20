import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class passwordgenerator extends JFrame implements ActionListener{
    JLabel password;
    JTextField pa;
    JButton btn;
    
 passwordgenerator(){
password= new JLabel("password");
pa=new JTextField(10);
btn= new JButton("generate");
setSize(300, 300);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
add(password);
add(pa);
add(btn);
btn.addActionListener(this);
    }
    @Override
public void actionPerformed(ActionEvent e) {
    String s1= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String s2="abcdefghijklmnopqrstuvwxyz";
    String s3="<>?/!@#$%^&*";
    String s4="0123456789";
    String generate=s1+s2+s3+s4;
    int len=16;
    char[] password= new char[len];
    Random r = new Random(len);
    for(int i=1;i<len;i++){
     password[i]=generate.charAt(r.nextInt(generate.length()));

    }
//System.out.println("password generated is"+password);
pa.setText(""+password);
}
public static void main(String[] args) {
    new passwordgenerator();
}

}