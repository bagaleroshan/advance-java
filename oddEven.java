import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class oddEven extends JFrame implements ActionListener{
    JLabel number,output;
    JTextField num,op;
    JButton btn;
    oddEven(){
        number=new JLabel("number");
    output =new JLabel("output");
    num=new JTextField(20);
    op=new JTextField(20);
    btn=new JButton("button");
    setSize(400, 200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(number);
    add(num);
    add(output);add(op);
    add(btn);
    btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
int x=Integer.parseInt(num.getText());
if(x%2 == 0){
    op.setText("even number is "+x);
}else{
    op.setText("odd number is "+x);
}
    }
public static void main(String[] args) {
    new oddEven();
}
}
