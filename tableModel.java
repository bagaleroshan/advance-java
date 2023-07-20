import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
public class tableModel  extends JFrame implements ActionListener{
JTable tb,tb1;
JButton btn,btn1;
DefaultTableModel dtm;
String[]cols={"name","add"};
String[][]recs={
    {"subanu","NAxal"},
    {"sheetal","sheetalDev"}
};
public tableModel(){
    dtm=new DefaultTableModel(recs, cols);
    tb=new JTable(dtm);
    String[][] r={{"Huma ","Naxal"},{"Brad","Kuleshwor"}};
dtm.addRow(r[1]);
JScrollPane jsp=new JScrollPane(tb);
setSize(600, 500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
jsp.setBounds(0, 0, 200, 150);
add(jsp);
btn=new JButton("change");btn.setBounds(0, 170, 100, 24);
btn1=new JButton("delete");btn1.setBounds(220, 170, 100, 24);
add(btn);
add(btn1);
btn.addActionListener(this);
btn1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==btn){
        btn.setText("hello");
        //System.out.println("hello");
        recs[0][1]= "Taxal";
        dtm.addRow(recs[0]);
        dtm.setValueAt("Taxal", 0, 1);
    }else{
        dtm.removeRow(3);
    }
}
public static void main(String[] args) {
    new tableModel();
}
}
