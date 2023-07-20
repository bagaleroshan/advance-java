import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ttabbedpane extends JFrame implements KeyListener{
    JPanel jp1,jp2;
    static JPanel jp3;
    JTabbedPane jtp;
    JButton btn1,btn2;
    JTextField t1,t2;
    
    public ttabbedpane(){
        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();
        btn1=new JButton("pane one");
        btn2=new JButton("pane two");
        t1=new JTextField(40);
        t2=new JTextField(40);
        jp1.add(t1);
        jp2.add(t2);
        jp1.add(btn1);
        jp2.add(btn2);
        jtp=new JTabbedPane();
        jtp.add("paneOne",jp1);
        jtp.add("panetwo",jp2);
        jtp.add("panethree",jp3);
        add(jtp);
        setSize(600, 300);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        t1.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke){
    btn1.setText(""+ke.getKeyCode());
 ImageIcon ic=new ImageIcon("ugc_logo_title.jpg");
 JLabel lbl=new JLabel("e dekoo bigyapan",ic,JLabel.RIGHT);
 jp1.add(lbl);
 if(ke.getKeyCode()==50){
    JPanel jp4= new JPanel();
    jtp.add("panefour",jp4);
 
}
}
public void keyReleased(KeyEvent ke){
if(ke.getKeyCode()==ke.VK_ENTER||ke.getKeyCode()==50){
    JButton rb=new JButton("animal");
    jp3.add(rb);
}
}
public void KeyTyped(KeyEvent ke){
    JOptionPane jop=new JOptionPane();
    jop.showMessageDialog(this,ke.getKeyChar());
}
public static void main(String[] args) {
    new ttabbedpane();
    JRadioButton[] rb=new JRadioButton[10];
    int i=0;
    for(i=0;i<rb.length;i++){
        rb[i]=new JRadioButton("choice:"+1);
        jp3.add(rb[i]);
    }
}
}
