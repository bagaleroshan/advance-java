import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class prime extends JFrame implements ActionListener{
    JLabel number;
    JTextField num;
    JLabel output;
    JTextField o;
    JButton click;

    prime (){
        number=new JLabel("number");
        num=new JTextField(20);
        output=new JLabel("output");
        o=new JTextField(20);
        click=new JButton("click");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(number);
        add(num);
        add(output);
        add(o);
        add(click);
        click.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        int x=Integer.parseInt(num.getText());
    int c=0;
    for(int i=1;i<=x;i++) {      
 if(x%i==0){
 c++;
    }
}
if(c<=2){
o.setText("prime number is"+x);
}else{
    o.setText("not prime number is"+x);
}
}
    public static void main(String[] args) {
        new prime();
    }
}
