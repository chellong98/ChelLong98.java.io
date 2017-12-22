package ChelLong.database.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TaiSanChiTietUI extends JDialog {
	JTextField txtMa, txtTen, txtNgayNhap, txtSoNamKhauHao, txtGiaTri;
	JButton btnLuu;
	
	Connection conn = TaiSanUI.conn;
	Statement statement = TaiSanUI.statement;
	public static int result = -1;
	public TaiSanChiTietUI(String title) {
		this.setTitle(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuu();
			}
		});
	}

	protected void xuLyLuu() {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into taisan values('"
		+txtMa.getText()
		+"','"
		+txtTen.getText()
		+"','"
		+txtNgayNhap.getText()
		+"','"
		+txtSoNamKhauHao.getText()
		+"','"
		+txtGiaTri.getText()
		+"')";
			statement = conn.createStatement();
			int ret = statement.executeUpdate(sql);
			result = ret;
			this.dispose();//ẩn màn hình đi
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout());
		JLabel lblMa = new JLabel("Mã tài sản");
		txtMa = new JTextField(20);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		con.add(pnMa);
		
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen = new JLabel("Tên tài sản");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		con.add(pnTen);
		
		JPanel pnNgayNhap = new JPanel();
		pnNgayNhap.setLayout(new FlowLayout());
		JLabel lblNgayNhap = new JLabel("Ngày nhập");
		txtNgayNhap = new JTextField(20);
		pnNgayNhap.add(lblNgayNhap);
		pnNgayNhap.add(txtNgayNhap);
		con.add(pnNgayNhap);
		
		JPanel pnSoNamKhauHao = new JPanel();
		pnSoNamKhauHao.setLayout(new FlowLayout());
		JLabel lblSoNamKhauHao = new JLabel("Số năm Khấu hao");
		txtSoNamKhauHao = new JTextField(20);
		pnSoNamKhauHao.add(lblSoNamKhauHao);
		pnSoNamKhauHao.add(txtSoNamKhauHao);
		con.add(pnSoNamKhauHao);
		
		JPanel pnGiaTri = new JPanel();
		pnGiaTri.setLayout(new FlowLayout());
		JLabel lblGiaTri = new JLabel("Giá trị");
		txtGiaTri = new JTextField(20);
		pnGiaTri.add(lblGiaTri);
		pnGiaTri.add(txtGiaTri);
		con.add(pnGiaTri);
		
		lblMa.setPreferredSize(lblSoNamKhauHao.getPreferredSize());
		lblGiaTri.setPreferredSize(lblSoNamKhauHao.getPreferredSize());
		lblTen.setPreferredSize(lblSoNamKhauHao.getPreferredSize());
		lblNgayNhap.setPreferredSize(lblSoNamKhauHao.getPreferredSize());
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnLuu = new JButton("Lưu");
		pnButton.add(btnLuu);
		con.add(pnButton);
	}
	
	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
