import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;
public class grid extends JFrame {
JRadioButton one;
JRadioButton two;
JRadioButton three;
ButtonGroup grp;
Button click;
 grid(){
    one=new JRadioButton("one");
    two=new JRadioButton("two");
    three=new JRadioButton("three");
    grp=new ButtonGroup();
grp.add(one);
grp.add(two);
grp.add(three);
    click=new Button("click");
    setSize(200, 200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 3));
    add(one);
    add(two);
    add(three);
    add(click);
 }
 public static void main(String[] args) {
    new grid();
 }
    
}
