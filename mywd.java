import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class mywd extends JFrame  {
	JMenuBar mb;
	JMenu tab1,tab2,tab3;
	public mywd(){
		mb=new JMenuBar();
		tab1=new JMenu("Tab1");
		tab2=new JMenu("Tab2");
		tab3=new JMenu("Tab3");
		mb.add(tab1);
		mb.add(tab2);
		mb.add(tab3);
		add(mb);
		setSize(330,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
	}

	public static void main(String[] args) {

	new mywd();


	}

}
