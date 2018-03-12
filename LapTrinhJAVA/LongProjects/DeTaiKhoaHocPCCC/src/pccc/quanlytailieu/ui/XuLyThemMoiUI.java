package pccc.quanlytailieu.ui;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import pccc.detaikhoahoc.service.ThuatNguService;

public class XuLyThemMoiUI extends JFrame{
	JTextField txtTenThuatNgu, txtTaiLieu;
	JTextArea txtDinhNghia;
	JButton btnOk, btnCancel;
	public XuLyThemMoiUI(String title) {
		super(title);
		addControls();
		addEvents();
	}

	protected void addEvents() {
		// TODO Auto-generated method stub
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyXacNhan();
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
	}

	protected void xuLyXacNhan() {
		// TODO Auto-generated method stub
		String tenThuatNgu = txtTenThuatNgu.getText();
		String dinhNghiaThuatNgu = txtDinhNghia.getText();
		String taiLieuThuatNgu = txtTaiLieu.getText();
		ThuatNguService service = new ThuatNguService();
		if(service.ThemMoiThuatNgu(tenThuatNgu, dinhNghiaThuatNgu, taiLieuThuatNgu)) {
			JOptionPane.showMessageDialog(null, "thêm mới thuật ngữ thành công");
		}else {
			JOptionPane.showMessageDialog(null, "thất bại");
		}
		dispose();
	}

	protected void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
//		System.out.println(QuanLyTaiLieuUI.size);
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTen = new JLabel("Tên Thuật ngữ");
		txtTenThuatNgu = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTenThuatNgu);
		con.add(pnTen);
		
		JPanel pnDinhNghia = new JPanel();
		pnDinhNghia.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblDinhNghia = new JLabel("Định Nghĩa Thuật ngữ");
		JPanel pnChiTietDinhNghia = new JPanel();
		pnChiTietDinhNghia.setLayout(new BorderLayout());
		txtDinhNghia = new JTextArea(5,20);
		txtDinhNghia.setLineWrap(true);
		txtDinhNghia.setWrapStyleWord(true);
		JScrollPane scDinhNghia = new JScrollPane(txtDinhNghia);
		pnChiTietDinhNghia.add(scDinhNghia, BorderLayout.CENTER);
		pnDinhNghia.add(lblDinhNghia);
		pnDinhNghia.add(pnChiTietDinhNghia);
		con.add(pnDinhNghia);
		
		JPanel pnTaiLieu = new JPanel();
		pnTaiLieu.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTaiLieu = new JLabel("Tài liệu Thuật ngữ");
		txtTaiLieu = new JTextField(20);
		pnTaiLieu.add(lblTaiLieu);
		pnTaiLieu.add(txtTaiLieu);
		con.add(pnTaiLieu);
		
		JPanel pnButton = new JPanel();
		btnOk = new JButton("Lưu");
		btnCancel = new JButton("Hủy");
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnButton.add(btnOk);
		pnButton.add(btnCancel);
		con.add(pnButton);
		
		lblTaiLieu.setPreferredSize(lblDinhNghia.getPreferredSize());
		lblTen.setPreferredSize(lblDinhNghia.getPreferredSize());
	}
	
	public void showWindow() {
		this.setSize(400, 200);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
} 
