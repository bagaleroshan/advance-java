 import javax.swing.*;
 import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 public class i extends JFrame implements ItemListener{
    JLabel l,ll;
    JCheckBox c,cb;
    public i(){
        l=new JLabel("1");
        ll=new JLabel("2");
        c=new JCheckBox("nepal");
        cb=new JCheckBox("china");
setSize(300, 300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
add(l);
add(c);
add(ll);
add(cb);

c.addItemListener(this);
cb.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
if(ie.getSource()==c){
    l.setText("you click first checkbox " +(ie.getStateChange()==1?"checked" : "unchecked"));
}
    if(ie.getSource()==cb){
ll.setText("you click second checkbox " +(ie.getStateChange()==1?"checked" : "unchecked"));
    }
}
    
    public static void main(String[] args) {
        new i();
    }
}
