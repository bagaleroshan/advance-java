import javax.swing.*;
import java.awt.*;
public class borderlayout extends JFrame {
    JButton b1,b2,b3,b4,b5;
    public borderlayout(){
        b1=new JButton("B1");
        b2=new JButton("B2");
        b3=new JButton("B3");
        b4=new JButton("B4");
        b5=new JButton("B5");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,0,30,50));
        setLayout(new BorderLayout());
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new borderlayout();
    }
}
