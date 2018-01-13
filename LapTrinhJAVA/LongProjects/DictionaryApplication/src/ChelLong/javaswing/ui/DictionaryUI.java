package ChelLong.javaswing.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ChelLong.javaswing.service.DocFileService;

public class DictionaryUI extends JFrame {

	JButton btnNext, btnPrevious, btnAddNewWord, btnRefresh, btnSearch;
	ArrayList<myWordUI> listWord;
	JPanel pnCard;
	 CardLayout cardLayout;
	JLabel lblCountDown;
	Thread t;

	public DictionaryUI(String title) {

		super(title);
		listWord = new ArrayList<myWordUI>();
		Threads();
		addControls();
		addEvents();

	}

	private void Threads() {
		// TODO Auto-generated method stub
		t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while (true) {
						int i = 10;
						lblCountDown.setText("Ready!!!");
						Thread.sleep(1000);
						while (i >= 0) {
							lblCountDown.setText(i + "");
							Thread.sleep(1000);
							i--;
						}
						lblCountDown.setText("Stop!!!");
						Thread.sleep(1000);
						cardLayout.next(pnCard);
					}

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Next();

			}
		});
		btnPrevious.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Previous();
			}
		});
		btnAddNewWord.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AddWordUI ui = new AddWordUI("add new word");
				ui.showWindow();

			}
		});
		btnRefresh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Refresh();
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-genethis.dispose();
				xuLyTimKiem();
				
			}
		});
	}

	protected void xuLyTimKiem() {
		// TODO Auto-generated method stub
		this.dispose();
		FindWordUI ui = new FindWordUI("tìm kiếm từ");
		ui.showWindow();
	}

	private void Refresh() {
		
		// TODO Auto-generated method stub
		listWord = DocFileService.docFile("listWord.db");
		for (myWordUI word : listWord) {
			pnCard.add(word, word.toString());
		}
		JOptionPane.showMessageDialog(null, "Đã refresh từ điển");
	}

	public void Show( String word) {
		cardLayout.show(pnCard, word);
	}

	protected void Previous() {
		// TODO Auto-generated method stub
		cardLayout.previous(pnCard);

	}

	protected void Next() {
		// TODO Auto-generated method stub
		cardLayout.next(pnCard);
		lblCountDown.setText("10");
	}

	protected void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());

		pnCard = new JPanel();
		cardLayout = new CardLayout();
		pnCard.setLayout(cardLayout);

		// listWord.add(new myWordUI("Hello", "Xin Chào"));
		// listWord.add(new myWordUI("Book", "Quyển Sách"));
		// listWord.add(new myWordUI("School", "Trường Học"));
		// for (myWordUI word : listWord) {
		// pnCard.add(word);
		// }
		listWord = DocFileService.docFile("listWord.db");
		for (myWordUI word : listWord) {
			pnCard.add(word, word.toString());
		}

		con.add(pnCard, BorderLayout.CENTER);

		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnNext = new JButton("next");
		btnPrevious = new JButton("Previous");
		btnAddNewWord = new JButton("Add new Word");
		btnRefresh = new JButton("Refresh");
		btnSearch = new JButton("Search");
		pnButton.add(btnPrevious);
		pnButton.add(btnNext);
		pnButton.add(btnAddNewWord);
		pnButton.add(btnRefresh);
		pnButton.add(btnSearch);
		con.add(pnButton, BorderLayout.SOUTH);

		JPanel pnCountDown = new JPanel();
		pnCountDown.setLayout(new FlowLayout(FlowLayout.CENTER));
		lblCountDown = new JLabel("");
		pnCountDown.add(lblCountDown);
		con.add(pnCountDown, BorderLayout.NORTH);

		t.start();
	}

	public void showWindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
