import javax.swing.*;
import java.awt.*;
public class form extends JFrame{
    JLabel name,gender,country;
     JTextField n;
     JRadioButton m,f;
     ButtonGroup grp;
     //JComboBox nepal;
     JCheckBox mo,Ckt;
     JButton btn;
     public form(){
        name=new JLabel("name");
        n=new JTextField(20);
        gender=new JLabel("gender");
        grp =new ButtonGroup();
        m=new JRadioButton("m");
        f=new JRadioButton("f");
        
        //nepal=new JComboBox("nepal");
        country=new JLabel("country");
        mo=new JCheckBox("mo");
        Ckt=new JCheckBox("ckt");
    btn=new JButton("submit");
    setSize(300, 300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(name);add(n);
    add(gender);
    grp.add(m);
    grp.add(f);
    //add(nepal);
    add(m);add(f);
    add(country);
    add(mo);add(Ckt);
    
    add(btn);
     }
     public static void main(String[] args) {
        new form();
     }
}