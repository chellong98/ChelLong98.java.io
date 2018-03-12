package pccc.detaikhoahoc.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class testJtextPane extends JFrame {
	JTextPane txtPane;
	public testJtextPane() {
		super();
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		txtPane = new JTextPane(); 
		addColorText(txtPane, "nguyễn nhật long \n", Color.red);
		addColorText(txtPane, "act", Color.red);
		JScrollPane scPane = new JScrollPane(txtPane, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		con.add(scPane, BorderLayout.CENTER);
		
	}
	
	public void addColorText(JTextPane pane, String str, Color color) {
		StyledDocument doc = pane.getStyledDocument();
		Style style = pane.addStyle("Color", null);
		
		 StyleConstants.setForeground(style, color);
		 StyleConstants.setItalic(style, true);
		 StyleConstants.setFontFamily(style, "times new roman");
		 StyleConstants.setFontSize(style, 20);
		 StyleConstants.setBackground(style, Color.black);
		 
	        try {
	            doc.insertString(doc.getLength(), str, style);
	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	
	public void showWindow() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		testJtextPane ui = new testJtextPane();
		ui.showWindow();
	}
}
