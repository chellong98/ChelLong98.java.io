package ChelLong.javaSwing.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

public class HocJOptionPanelUi extends JFrame {

	JMenuBar mnuBar;
	JMenu mnuFile;
	JMenuItem mnuFileSave;
	JMenuItem mnuFileOpen;
	JMenuItem mnuFileExit;
	JTextArea txtdata;

	public HocJOptionPanelUi(String title) {
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		mnuFileExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyThoatPhanMem();
			}
		});
		mnuFileOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLiMoFile();
			}
		});
		mnuFileSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuuFile();
			}
		});
	}

	protected void xuLyLuuFile() {
		// TODO Auto-generated method stub
		JFileChooser chooser = new JFileChooser();
		if (chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
			String data = txtdata.getText();
			try {
				FileOutputStream fos = new FileOutputStream(chooser.getSelectedFile());
				OutputStreamWriter ows = new OutputStreamWriter(fos, "UTF-8");
				ows.write(data);
				ows.close();
				fos.close();
				JOptionPane.showMessageDialog(null, "lưu thành công!");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	protected void xuLiMoFile() {
		// TODO Auto-generated method stub
		
		JFileChooser chooser = new JFileChooser();
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {// nếu đồng ý mở file
			try {
				File selectedFile = chooser.getSelectedFile();
				FileInputStream fis = new FileInputStream(selectedFile);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
				String line = br.readLine();
				StringBuilder builder = new StringBuilder();
				while(line!=null) {
					builder.append(line+"\n");
					line = br.readLine();
				}
				br.close();
				txtdata.setText(builder.toString());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

	protected void xuLyThoatPhanMem() {
		// TODO Auto-generated method stub
		int ret = JOptionPane.showConfirmDialog(null, "bạn có muốn thoát không?", // nội dung hộp thoại
				"xác nhận thoát", // tên hộp thoại
				JOptionPane.YES_NO_OPTION);// hộp thoại yes no
		if (ret == JOptionPane.YES_OPTION) {// chọn yes
			System.exit(0);
		}
	}

	private void addControls() {
		// TODO Auto-generated method stub
		setupMenuBar();
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		;
		txtdata = new JTextArea(50, 50);
		txtdata.setLineWrap(true);// xuống dòng khi chạm giới hạn khung
		txtdata.setWrapStyleWord(true);// xuống dòng cả từ
		JScrollPane sc = new JScrollPane(txtdata, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		con.add(sc, BorderLayout.CENTER);
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(new FileFilter() {//tạo định dạng cho file cần chọn
			
			@Override
			public String getDescription() {//mô tả chọn file đuôit txt
				// TODO Auto-generated method stub
				return "tập tin.txt";
			}
			
			@Override
			public boolean accept(File f) { //chỉ chọn file đuôi txt
				// TODO Auto-generated method stub
				return f.getAbsolutePath().endsWith(".txt");
			}
		});
		chooser.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "tập tin.c";
			}
			
			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				return f.getAbsolutePath().endsWith(".c");
			}
		});
	}

	private void setupMenuBar() {
		// TODO Auto-generated method stub

		mnuBar = new JMenuBar();
		setJMenuBar(mnuBar);
		mnuFile = new JMenu("File");
		mnuFileSave = new JMenuItem("Save");
		mnuFileOpen = new JMenuItem("Open");
		mnuFileExit = new JMenuItem("Exit");

		mnuBar.add(mnuFile);
		mnuFile.add(mnuFileSave);
		mnuFile.add(mnuFileOpen);
		mnuFile.add(mnuFileExit);

	}

	public void showWindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
