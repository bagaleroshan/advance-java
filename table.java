import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class table extends JFrame {
    JTable tbl;
String [] cols={"name","address"};
String rows[][] ={
    {"Raj","ktm"},
    {"anita","pkr"}

};
  public table(){
    tbl=new JTable(rows,cols);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    setSize(500, 300);
    add(tbl);
  }  
  public static void main(String[] args) {
    new table();
  }
}
