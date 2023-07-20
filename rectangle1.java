import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rectangle1 extends JFrame implements ActionListener{
    JLabel length;;JTextField l;
    JLabel breadth; JTextField b;
    JLabel height; JTextField h;
    JRadioButton area,perimeter, volume;
    ButtonGroup grp;
    JButton calculate;
    JLabel output;JTextField o;
    rectangle1(){
        length = new JLabel("length");
        l = new JTextField(20);
        breadth = new JLabel("breadth");
        b = new JTextField(20);
        height = new JLabel("height");
        h = new JTextField(20);
        area=new JRadioButton("area");
        perimeter = new JRadioButton("perimeter");
        volume = new JRadioButton("volume");
        grp=new ButtonGroup();
        grp.add(area);
        grp.add(perimeter);
        grp.add(volume);
        calculate = new JButton("calculate");
        output=new JLabel("output");
        o = new JTextField(20);
        setSize(300, 400);
        setVisible (true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout());
        add(length);add(l);
        add(breadth);add(b);
        add(height);add(h);
        add(area);add(perimeter);add(volume);
        add(calculate);
        add(output);add(o);
        calculate.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
    int length =Integer.parseInt(l.getText());
    int breadth =Integer.parseInt(b.getText());
    int height =Integer.parseInt(h.getText());
    if(area.isSelected()){
        int area=length*breadth;
        o.setText("area is "+area);
    }else if(perimeter.isSelected()){
    int perimeter=(2*(length+breadth));
        o.setText("perimeter is"+perimeter);
    }else if (volume.isSelected()){
        int volume = length*breadth*height;
        o.setText("volume is"+volume);
    }
}
public static void main(String[] args){
 new rectangle1();
}
}