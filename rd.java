import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;

public class rd extends JFrame {
    JRadioButton r1,r2;
    ButtonGroup grp;
    JButton btn;
    rd(){
        r1=new JRadioButton("cricket");
        r2=new JRadioButton("football");
        grp =new ButtonGroup();
        grp.add(r1);
        grp.add(r2);
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        add(r1);
        add(r2);
        /* btn.addActionListener(new ActionListener()) ;
    }
    public void actionPerformed(ActionEvent ae){
        System.out.println("hobby"+(r1.isSelected()"circket","football"));
    } */
}
public static void main(String[] args) {
    new rd();
}
}
