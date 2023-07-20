
import javax.swing.*;
import java.awt.*;
//import  java.awt.event.*;
public class menuBar extends JFrame {
JMenuBar mb;
JMenu file,help,edit;
JMenuItem nw,same;
    public menuBar(){
        mb=new JMenuBar();
        file=new JMenu("file");
        help=new JMenu("help");
        edit=new JMenu("edit");
        nw=new JMenuItem("new");
        same=new JMenuItem("same");
        file.add(nw);
        file.add(same);
        mb.add(file);
        mb.add(help);
        mb.add(edit);
        add(mb);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        /* nw.addActionListener(this);
        same.addActionListener(this);
     */
    }
    /* public void actionPerformed(ActionEvent ae){
        JFrame f=new JFrame();
        f.setSize(200,200);
        f.setVisible(false);
    } */
    public static void main(String[] args) {
        new menuBar();
    }
}
