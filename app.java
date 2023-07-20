import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class app extends Applet implements ActionListener{
	Button btn;
	Label l;
	public app() {
		btn=new Button("click");
		l=new Label("name");
		setLayout(new FlowLayout());
		add(btn);
		add(l);
				btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		System.out.println("ok");
	}
	public void paint(Graphics g) {
		g.drawString("hello",30,30);
	}
	

	public static void main(String[] args) {
		new app();
	}

}

