package ChelLong.javaswing.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ChelLong.javaswing.service.DocFileService;

public class AddWordUI extends JFrame {
	JTextField txtWord, txtMean;
	JButton btnAdd;
	public AddWordUI (String title) {
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				addNewWord();
			}
		});
	}

	protected void addNewWord() {
		// TODO Auto-generated method stub
		DictionaryUI ui = new DictionaryUI("");
		myWordUI newWord = new myWordUI(txtWord.getText(), txtMean.getText());
		ui.listWord.add(newWord);
		for(myWordUI word : ui.listWord) {
			System.out.println(word);
		}
		if(DocFileService.luuFile(ui.listWord, "listWord.db")) {
			JOptionPane.showMessageDialog(null, "Lưu từ mới vào rồi, nhớ REFRESH nhé!!!");
		}
		this.dispose();
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con= this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JPanel pnWord = new JPanel();
		JLabel lblWord = new JLabel("Word");
		txtWord = new JTextField(20);
		pnWord.add(lblWord);
		pnWord.add(txtWord);
		con.add(pnWord);
		
		JPanel pnMean = new JPanel();
		JLabel lblMean = new JLabel("Mean");
		txtMean = new JTextField(20);
		pnMean.add(lblMean);
		pnMean.add(txtMean);
		con.add(pnMean);
		
		JPanel pnButton = new JPanel();
		btnAdd = new JButton("Add New Word");
		pnButton.add(btnAdd);
		con.add(pnButton);
	}
	
	public void showWindow() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
