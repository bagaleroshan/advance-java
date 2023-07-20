import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
public class hellooutput extends JFrame implements ActionListener{
    JLabel name; JTextField fname;
    JLabel output; JTextField op;
    JButton click;
    hellooutput(){
        name=new JLabel("NAme");
        fname=new JTextField(20);
        output=new JLabel("OUTPUT");
        op=new JTextField(20);
        click=new JButton("CLICK");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(name);add(fname);
        add(output);add(op);
        add(click);
        click.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String s=fname.getText();
if(ae.getSource()==click){
    op.setText("hello my name is"+s);
}
    }
public static void main(String[] args) {
   hellooutput h= new hellooutput();
}
}
