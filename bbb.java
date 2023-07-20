import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class bbb extends JFrame implements ActionListener{
    JButton p,f,m;
   public bbb(){
        p=new JButton("open panel");
        f=new JButton ("open frame");
m=new JButton("open message");
setSize(300, 300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
add(p);
add(f);
add(m);
p.addActionListener(this);
f.addActionListener(this);

    }    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==p){
JPanel pe=new JPanel();
 /* pe.setSize(250, 250);
pe.setVisible(true);
pe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
pe.setLayout(new FlowLayout());
 */ 
add(pe);
        }
        else{
            if(ae.getSource()==f){
            JFrame fe=new JFrame();
            fe.setSize(200, 200);
            fe.setVisible(true);
            fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fe.setLayout(new FlowLayout());
add(fe);
            }
        }
    }
    public static void main(String[] args) {
        new bbb();
    }
}