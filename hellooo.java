import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class hellooo extends JFrame implements ActionListener{
    JLabel name; JTextField fname;
    JLabel output; JTextField op;
    JButton click;
    hellooo (){
        name=new JLabel("Name");
        fname=new JTextField(20);
        output=new JLabel("output");
        op=new JTextField(20);
        click=new JButton("click");
        setSize (300, 300);
        setVisible (true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(name);add(fname);
        add(output);add(op);
        add(click);
        click.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String s = fname.getText();
        if(e.getSource() == click){
            op.setText("hello my name is .."+s);
        }
            }
            public static void main(String[] args) {
                new hellooo();
            }
        }