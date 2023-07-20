import java.util.Random;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RockPaperScissors extends JFrame implements ActionListener {
    JLabel l ,c;
    JRadioButton r,p,s;
    ButtonGroup grp;
JTextField cc,o;
    public RockPaperScissors(){
        l=new JLabel("You");
        grp=new ButtonGroup();
        r=new JRadioButton("r");
        p=new JRadioButton("p");
        s=new JRadioButton("s");
        grp.add(r);grp.add(p);grp.add(s);
        c=new JLabel("computer");
        cc=new JTextField(20);
        o=new JTextField(20);
        setTitle("RockPaperScissors");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(l);add(r);add(p);add(s);
        add(c);add(cc);
        add(o);
        r.addActionListener(this);
        p.addActionListener(this);
        s.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String[]rps={"r","p","s"};
String com[]=rps[new Random().nextInt(rps.length)];
Scanner s=new Scanner(System.in);
if(ae.getSource()==r){
    if(com.getText()==p){
o.setText("you win");
}
}
if(ae.getSource()==p){
    if(com.getText()==s){
    o.setText("you lose");
}
}
if(ae.getSource()==s){
    if(com.getText()==s){
    o.setText("draw");
}
if(ae.getSource()==s){
    if(com.getText()==r){
        o.setText("computer win");
    }
}
}
    }
public static void main(String[] args) {
    new RockPaperScissors();
}
}
