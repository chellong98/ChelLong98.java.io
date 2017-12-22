package bai21;

import java.awt.Container;

import javax.swing.JFrame;

public class HocJtreeUi extends JFrame {
	public HocJtreeUi (String title) {
		super(title);
		addControls();
		addEvents();
	}
	
	public void addControls() {
		Container con = getContentPane();
	}
	public void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
