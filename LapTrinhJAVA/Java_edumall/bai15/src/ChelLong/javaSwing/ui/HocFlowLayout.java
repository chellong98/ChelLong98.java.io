package ChelLong.javaSwing.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocFlowLayout extends JFrame {
	
	public HocFlowLayout (String tieude) {
		super (tieude);
		this.addControls();
	}
	
	public void addControls () {
		Container con = getContentPane();
		JPanel pnFlowLayout = new JPanel();
		
		JButton btn1 = new JButton("Demo button 1");
		JButton btn2 = new JButton("Demo button 2");
		JButton btn3 = new JButton("Demo button 3");
		JButton btn4 = new JButton("Demo button 4");
		
		pnFlowLayout.add(btn1);
		pnFlowLayout.add(btn2);
		pnFlowLayout.add(btn3);
		pnFlowLayout.add(btn4);
		
		con.add(pnFlowLayout);
	}
	
	public void showWindow () {
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
