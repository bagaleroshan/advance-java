import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class converson extends JFrame implements ActionListener{
    JLabel distance;
    JTextField dis;
    JRadioButton miles,km,cm;
    JLabel output;
    
    JTextField op;
    JButton convert;
    converson(){
        distance=new JLabel("Distance");
        output=new JLabel("Output");
        dis=new JTextField(20);
        
        miles=new JRadioButton("Miles");
        km=new JRadioButton("KM");
        cm=new JRadioButton("CM");
        op=new JTextField(20);
        convert=new JButton("Convert");
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        add(distance);add(dis);
        add(output);
        
        add(op);
        add(miles);
        add(km);
        add(cm);
        add(convert);
        convert.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
int x=Integer.parseInt(dis.getText());
if(miles.isSelected()){
double miles=0.000062875*x;
op.setText(miles+"miles");

    }else if(km.isSelected()){
double km=0.001*x;
op.setText(km+"km");
    }else if(cm.isSelected()){
        double cm=100*x;
        op.setText(cm+"cm");
    }
    }
    public static void main(String[] args) {
        converson s =new converson();
    }
    
}
