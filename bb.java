import javax.swing.*;
import java.awt.*;
public class bb extends JFrame{
    JLabel name,gender,country;
     JTextField n;
     JRadioButton m,f;
     ButtonGroup grp;
     JComboBox cb;
     JCheckBox mo,Ckt;
     JButton btn;
     public bb(){
        name=new JLabel("name");
        n=new JTextField(20);
        gender=new JLabel("gender");
        grp =new ButtonGroup();
        
       m=new JRadioButton("m");
        f=new JRadioButton("f");
        grp.add(m);
        grp.add(f);
        String country[]={"India","Aus","U.S.A","England","Newzealand"};        
 cb=new JComboBox(country);    
    cb.setBounds(50, 50,90,20);    
    f.add(cb);        
        //nepal=new JComboBox(nepal);
        //country=new JLabel("country");
        mo=new JCheckBox("mo");
        Ckt=new JCheckBox("ckt");
    btn=new JButton("submit");
    setSize(300, 300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(name);add(n);
    add(gender);
    add(m);
    add(f);
    add(cb);
    //add(country);
    add(mo);add(Ckt);
    add(btn);
     }
     public static void main(String[] args) {
        new bb();
     }
}