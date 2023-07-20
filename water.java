 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 public class water extends JFrame implements ActionListener{
    JLabel l;
    JTextField tf,t;
    JButton btn;
    public water(){
        l=new JLabel("units");
        tf=new JTextField(20);
        t=new JTextField(20);
        btn=new JButton("calculate");
        setTitle("waterBill");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(l);add(tf);
        add(t);
        add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        double n=Double.parseDouble(tf.getText());
        if(ae.getSource()==btn){
        if(n<5){
            double price=n*0.07;
t.setText("no charge"+price);
        }
        if(n<200){
            double price =n*0.20;
            t.setText("charge rs 5"+price);
        }
        if(n<400){
            double price =n*0.24;
            t.setText("charge rs 10"+price);
        }
    }
}
    public static void main(String[] args) {
        new water();
    }
}
