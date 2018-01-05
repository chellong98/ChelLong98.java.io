package ChelLong.javaswing.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.Serializable;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class myWordUI extends JPanel implements Serializable{
	private String word, mean;
	
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public myWordUI(String word, String mean) {
		this.word = word;
		this.mean = mean;
		addControls(word, mean);
		showWindow();
	}

	private void addControls(String word, String mean) {
		// TODO Auto-generated method stub
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel pnWord = new JPanel();
		pnWord.setLayout(new BorderLayout());
		pnWord.setSize(0, 250);
		JLabel lblWord = new JLabel(word);
		lblWord.setFont(new Font("arial", Font.BOLD, 40));
		pnWord.add(lblWord, BorderLayout.CENTER);
		TitledBorder borderWord = new TitledBorder(BorderFactory.createLineBorder(Color.red), "my word");
		pnWord.setBorder(borderWord);
		this.add(pnWord);
		
		JPanel pnMean = new JPanel();
		pnMean.setLayout(new BorderLayout());
		JLabel lblMean = new JLabel(mean);
		lblMean.setFont(new Font("arial", Font.BOLD, 40));
		pnMean.add(lblMean, BorderLayout.CENTER);
		TitledBorder borderMean = new TitledBorder(BorderFactory.createLineBorder(Color.red), "translate");
		pnMean.setBorder(borderMean);
		this.add(pnMean);
	}
	
	public void showWindow() {
		this.setSize(500, 500);
		this.setVisible(true);

	}

	@Override
	public String toString() {
		return this.word;
	}

	
	
	
}
