import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.*;
import java.awt.event.*;
public class mywindow extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file,edit,view;
    JMenuItem nnew,open,cut,copy,paste;
    public mywindow(){
        mb=new JMenuBar();
        file=new JMenu("file");
        edit=new JMenu("Edit");
        view=new JMenu("view");
    nnew=new JMenuItem("nnew");
open=new JMenuItem("OPen");
cut=new JMenuItem("Cut");
copy=new JMenuItem("Copy");
paste=new JMenuItem("paste");
file.add(nnew);
file.add(open);
edit.add(cut);
edit.add(copy);
view.add(paste);
mb.add(file);
mb.add(edit);
mb.add(view);
add(mb);
setSize(300, 300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
open.addActionListener(this);
nnew.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
    JFrame f =new JFrame();
    f.setSize(200, 200);
    f.setVisible(false);
}
public static void main(String[] args) {
    new mywindow();
}
}
