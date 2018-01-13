package pccc.quanlytailieu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import pccc.detaikhoahoc.model.ThuatNgu;
import pccc.detaikhoahoc.service.ThuatNguService;

public class TimKiemUI extends JFrame{
	JTextField txtNhap;
	JButton btnTimKiem;
	Thread t;
	ThongTinUI ui;
	public TimKiemUI (String title) {
		super(title);
		ui = new ThongTinUI("Tài liệu cần tìm kiếm");
		Threads();
		addControls();
		addEvents();
		
	}

	private void Threads() {
		// TODO Auto-generated method stub
		t= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				xuLyTimKiem();//tạo luồng xử lý tìm kiếm
			}
		});
		t.start();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnTimKiem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				ui.showWindow();
				
				
			}
		});
	}

	protected void xuLyTimKiem() {
		ThuatNguService service = new ThuatNguService();
		Vector<ThuatNgu>vec;
		// TODO Auto-generated method stub
		if(txtNhap.getText().trim().equals("")) {
			vec = service.docToanBoThuatNgu();
		} else {
			vec = service.timTheoTenThuatNgu(txtNhap.getText().trim());
			if(vec.isEmpty()) {
				JOptionPane.showMessageDialog(null, "không tim thấy thuật ngữ " + "["+txtNhap.getText().trim()+"]");
			}
		}
		ui.listThuatNgu.setListData(vec);
		ui.cboThuatNgu.removeAllItems();
		for(ThuatNgu tt : vec) {
			ui.cboThuatNgu.addItem(tt);
		}
	}

	private void addControls() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //tạo giao diện giống window
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		con.setBackground(Color.white);
		
//		tạo layout ảnh
		JPanel pnImagePCCC = new JPanel();
		
		pnImagePCCC.setLayout(new BorderLayout());
		pnImagePCCC.add(new ImageBackground("images//pccc.jpg"), BorderLayout.CENTER);
		con.add(pnImagePCCC);

//		tạo txt nhập
		JPanel pnTimKiem = new JPanel();
		pnTimKiem.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnTimKiem.setBackground(Color.white);
		JLabel lblTieuDe = new JLabel("Nhập từ khóa bạn muốn tìm kiếm?");
		lblTieuDe.setFont(new Font("arial", Font.BOLD, 20));
		lblTieuDe.setForeground(Color.red);
		txtNhap = new JTextField(50);
		ImageIcon imgTimKiem = new ImageIcon("images//search.png");
		btnTimKiem = new JButton("", imgTimKiem);
		btnTimKiem.setBackground(Color.white);
		pnTimKiem.add(lblTieuDe);
		pnTimKiem.add(txtNhap);
		pnTimKiem.add(btnTimKiem);
		con.add(pnTimKiem);
		pnTimKiem.setPreferredSize(new Dimension(0, 70));
	}
	
	public void showWidow() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		
	}
}
