import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class password extends JFrame implements ActionListener {
    JLabel pass,repass;
    JTextField p,r;
    JButton btn;
    password(){
        pass=new JLabel("pass");
        repass=new JLabel("repass");
        p=new JTextField(20);
        r=new JTextField(20);
        btn=new JButton("click");
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(pass);
        add(p);
        add(repass);
        add(r);
        add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(p.getText().equals(r.getText() )){
            btn.setText("welcome");
        }else{
            btn.setText("wrong");
        }
    }
    public static void main(String[] args) {
        new password();
    }
}
