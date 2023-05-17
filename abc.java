
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class abc extends JFrame {
    JTextField text;
    JButton btn;
    abc(){
        text=new JTextField(20);
        btn=new JButton("click");
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* add(text,BorderLayout.NORTH);
        add(btn,BorderLayout.CENTER);
 */
add(text);
add(btn);
setLayout(new GridLayout(1, 2));
    }
    public static void main(String[] args) {
        new abc();
    }
}
