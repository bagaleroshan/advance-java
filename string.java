import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class String extends JFrame implements ActionListener{
    JLabel user;
    JButton click;
    JTextField fuser;
    String(){
        user = new JLabel("user");
        click =new JButton("click");
        fuser =new JTextField(20);
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(fuser,BorderLayout.NORTH);
        add(click,BorderLayout.CENTER);
        click.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        String s = fuser.getText();
        int l = s.length();
        char c = s.charAt(0);
        user.setText(l+","+c);
}
}