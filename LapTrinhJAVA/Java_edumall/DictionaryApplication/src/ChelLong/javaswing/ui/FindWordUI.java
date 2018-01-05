package ChelLong.javaswing.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import ChelLong.javaswing.service.DocFileService;

public class FindWordUI extends JFrame {
	JRadioButton radWord, radMean;
	JTextField txtWord, txtMean;
	ButtonGroup group;
	JButton btnSearch;
	static String wordSelected;

	public FindWordUI(String title) {
		super(title);
		addControls();
		addEvent();
		showWindow();
	}

	private void addEvent() {
		// TODO Auto-generated method stub
		radWord.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (radWord.isSelected()) {
					txtMean.setEditable(false);
				}
			}
		});
		radMean.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (radMean.isSelected()) {
					txtWord.setEditable(false);
				}
			}
		});
		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(xuLyTimKiem()) {
					WordUI ui = new WordUI("word searched ");
					ui.showWindow();
				} else {
					JOptionPane.showMessageDialog(null, "không tìm thấy từ vừa nhập");
				}
			}
		});
	}

	public boolean xuLyTimKiem() {
		// TODO Auto-generated method stub
//		DictionaryUI ui = new DictionaryUI("");
		 ArrayList<myWordUI>list = DocFileService.docFile("listWord.db");
		if (radWord.isSelected()) {
			wordSelected = txtWord.getText();
			for(myWordUI word : list) {
				if(word.getWord().toLowerCase().equals(wordSelected.toLowerCase())) {
					return true;
				}
			}
		} else if(radMean.isSelected()) {
			String mean = txtMean.getText();
			for(myWordUI word : list) {
				if(word.getMean().toLowerCase().equals(mean.toLowerCase())) {
					wordSelected = word.getWord();
					WordUI ui = new WordUI("word searched ");
					ui.showWindow();
					return true;
				}
			}
		}
		return false;
	}

	private void addControls() {
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));

		radWord = new JRadioButton("Search by word");
		radMean = new JRadioButton("Seach by mean");
		group = new ButtonGroup();
		group.add(radWord);
		group.add(radMean);

		JPanel pnWord = new JPanel();
		pnWord.setLayout(new FlowLayout());
		JLabel lblWord = new JLabel("input word");
		txtWord = new JTextField(20);
		pnWord.add(radWord);
		pnWord.add(lblWord);
		pnWord.add(txtWord);

		JPanel pnMean = new JPanel();
		pnMean.setLayout(new FlowLayout());
		JLabel lblMean = new JLabel("input mean");
		txtMean = new JTextField(20);
		pnMean.add(radMean);
		pnMean.add(lblMean);
		pnMean.add(txtMean);

		JPanel pnSearch = new JPanel();
		btnSearch = new JButton("Search");
		pnSearch.add(btnSearch);

		con.add(pnWord);
		con.add(pnMean);
		con.add(pnSearch);
	}

	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
}
