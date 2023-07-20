import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class threeRadio extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3;
    ButtonGroup grp;
    JButton btn;
   public threeRadio(){
    grp=new ButtonGroup();
       r1=new JRadioButton("ra1");
       r2=new JRadioButton("rd2");
     r3=new JRadioButton("ri3");
     btn=new JButton("Say ");
      grp.add(r1);
      grp.add(r2);
      grp.add(r3);
       setSize(300,300);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
add(r1);  
add(r2);
add(r3);
add(btn);
r1.addActionListener(this);
r2.addActionListener(this);    
r3.addActionListener(this);
}
   
public void  actionPerformed(ActionEvent ae){
    if(r1.isSelected()){
        btn.setText("hy");
    }
         if(r2.isSelected()){
            btn.setText("hi");
        }
        else if(r3.isSelected()){
            btn.setText("hello");
        }
        /* if(ae.getSource()==r1){
            btn.setText("hello");
        }
        if(ae.getSource()==r2){
            btn.setText("hi");
        }else if(ae.getSource()==r3){
            btn.setText("hy");
        } */
    }
public static void main(String[] args) {
    new threeRadio();
}
}

