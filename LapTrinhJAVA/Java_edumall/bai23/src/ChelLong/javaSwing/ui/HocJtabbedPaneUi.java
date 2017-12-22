package ChelLong.javaSwing.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class HocJtabbedPaneUi extends JFrame {

	JTabbedPane tab;
	public HocJtabbedPaneUi(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		addControls();
		addEvents();
	}
	
	public void addControls () {
		Container con = getContentPane();
		tab = new JTabbedPane();
		con.add(tab);
		
		JPanel pnTab1 = new JPanel();
		JPanel pnTab2 = new JPanel();
		JPanel pnTab3 = new JPanel();
		pnTab1.setBackground(Color.RED);
		pnTab2.setBackground(Color.BLUE);
		pnTab3.setBackground(Color.YELLOW);
		
		tab.add(pnTab1, "cấu hình");
		tab.add(pnTab2, "bảo mật");
		tab.add(pnTab3, "bản quyền");
	}
	
	public void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
