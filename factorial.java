import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class factorial extends JFrame implements ActionListener{
    JLabel number,factorial;
    JTextField num,f;
    JButton btl;

    factorial(){
        number=new JLabel("Number");
        num=new JTextField(20);
        factorial=new JLabel("Factorial");
        f=new JTextField(20);
        btl=new JButton("Display");
    setSize(300, 400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new FlowLayout());
    add(number);add(num);
    add(factorial);add(f);
    add(btl);
    btl.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        int a=Integer.parseInt(num.getText());
       int result=1;
       for(int i=1;i<(a+1);i++){
        result=(result*i);

       }
       f.setText("factorial is "+result);
        
    }
public static void main(String[] args) {
    new factorial();
}
}
