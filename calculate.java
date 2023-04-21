import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class calculate extends JFrame implements ActionListener{
    JLabel num1,num2;
    JButton Calculate;
    JTextField fnum1,fnum2;
    JRadioButton r1,r2;

    calculate(){
num1=new JLabel("number1");
num2=new JLabel("number2");
r1=new JRadioButton("add");
r2=new JRadioButton("prod");
fnum1=new JTextField(20);
fnum2=new JTextField(20);
r1.addActionListener(this);
r2.addActionListener(this);
Calculate =new JButton("calculate");
setSize(400,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
add(num1);
add(num2);
add(r1);
add(r2);
add(Calculate);
Calculate.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ee){
      int num1=Integer.parseInt(fnum1.getText());
        int num2=Integer.parseInt(fnum2.getText());
        if(r2.isSelected()){
int sum=num2+num2;
System.out.println("sum is"+sum);
        }
        else if(r1.isSelected()){
            int product=num1*num2;
            System.out.println("product is"+product);
        }
    }
public static void main(String[]args){
 calculate c =new calculate();
 
}
   
 }
