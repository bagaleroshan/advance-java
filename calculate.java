import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class calculate extends JFrame implements ActionListener{
    JLabel num1;
    JLabel num2;
    JButton Calculate;
    JTextField fnum1;
    JTextField fnum2;
    JRadioButton r1,r2,r3,r4;

    calculate(){
num1=new JLabel("num1");
num2=new JLabel("num2");
r1=new JRadioButton("add");
r2=new JRadioButton("sub");
r3=new JRadioButton("prod");
r4=new JRadioButton("divided");
fnum1=new JTextField(20);
fnum2=new JTextField(20);
//r1.addActionListener(this);
//r2.addActionListener(this);
Calculate =new JButton("calculate");
setTitle("calculate");
setSize(400,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
add(num1);add(fnum1);
add(num2);add(fnum2);
add(r1);
add(r2);
add(r3);
add(r4);
add(Calculate,BorderLayout.CENTER);
Calculate.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ee){
      int num1=Integer.parseInt(fnum1.getText());
         int num2=Integer.parseInt(fnum2.getText());
        if(r1.isSelected()){
int sum=num1+num2;
System.out.println("sum is"+sum);
        }
       else if(r2.isSelected()){
            int subtrac =num1-num2;
            System.out.println("sub is"+subtrac);
        }
        else if(r3.isSelected()){
            int product=num1*num2;
            System.out.println("product is"+product);
        }else if(r4.isSelected()){
            int divided=num1/num2;
            System.out.println("divided is"+divided);
        }

    }
public static void main(String[]args){
 calculate c =new calculate();
 
}
   
 }
 