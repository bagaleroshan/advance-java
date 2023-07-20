import javax.swing.JFrame;
import javax.swing.JTable;

import java.awt.*;
import java.awt.event.*;
public class table1 extends JFrame  {
    JTable tb;
    String[] cols={"id","name","salary"};
    String[][]rows={
{"101","amit","670000"},
{"102","shyam","34000"},
{"103","sita","55500"}
    };
    table1(){
        tb=new JTable(rows,cols);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(tb);
    }
    public static void main(String[] args) {
        new table1();
    }
}
