package ChelLong.javaDatabase.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class CDDVDUI extends JFrame {
	JTextField txtMa, txtTen, txtLoai, txtNamXuatBan;
	JButton btnLuu, btnXoa, btnTimKiem;

	DefaultTableModel dtmCd;
	JTable tblCd;

	Connection conn = null;
	PreparedStatement preStatement = null;
	ResultSet result = null;

	public CDDVDUI(String title) {
		super(title);
		addControls();
		addEvents();
		ketNoiCoSoDuLieu();
		hienThiToanBoCDDVD();
	}

	private void hienThiToanBoCDDVD() {
		try {
//			String sql = "select * from CDDCDColection";
//			preStatement = conn.prepareStatement(sql);
//			result = preStatement.executeQuery();
			CallableStatement callStatement = conn.prepareCall("{call LayToanBoCDDVD}");
			result = callStatement.executeQuery();
			dtmCd.setRowCount(0);
			while (result.next()) {
				Vector<Object> vec = new Vector<Object>();
				vec.add(result.getString("Ma"));
				vec.add(result.getString("TieuDe"));
				vec.add(result.getString("LoaiDia"));
				vec.add(result.getInt("NamXuatBan"));
				dtmCd.addRow(vec);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void ketNoiCoSoDuLieu() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// gán thư viện cho class này
			String connectUrl = "jdbc:sqlserver://" + "CHELLONGSCOMPUT\\SQLEXPRESS" + ":1433;databaseName="
					+ "dbQuanLyCDDVD" + ";integratedSecurity=true;";
			conn = DriverManager.getConnection(connectUrl);
			// statement = conn.createStatement();//cchỉ đc di chuyển tới mà không đc quay
			// lui hay tới dòng bất kì

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("lỗi: " + e.toString());
		}
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnTimKiem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TimKiemCDDVDUI ui = new TimKiemCDDVDUI("Tìm kiếm CD");
				ui.showWindow();
			}
		});

		btnLuu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuuCDDVD();
			}
		});

		tblCd.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				int row = tblCd.getSelectedRow();// chọn row vừa click
				if (row == -1)
					return;
				String ma = tblCd.getValueAt(row, 0) + "";
				hienThiChiTiet(ma);
			}
		});

		btnXoa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXoa();
			}
		});
	}

	protected void xuLyXoa() {
		// TODO Auto-generated method stub
		ImageIcon iconError = new ImageIcon("images/error.png");
		ImageIcon iconQuestion = new ImageIcon("images/question.png");
		if (kiemTraMaTonTai(txtMa.getText())==false) {
			JOptionPane.showMessageDialog(null, 
					"mã " + txtMa.getText() + " không tồn tại!", 
					"thông báo xóa", 
					JOptionPane.OK_OPTION, 
					iconError);
		} else {
			int result = JOptionPane.showConfirmDialog(null, "bạn muốn xóa mã " + txtMa.getText() + " chứ?", "thông báo xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, iconQuestion);
			if(result==JOptionPane.NO_OPTION) return;
			else {
				try {
					String sql = "delete from CDDCDColection where Ma=?";
					preStatement = conn.prepareStatement(sql);
					preStatement.setString(1, txtMa.getText());
					int x = preStatement.executeUpdate(); // trả về số dòng bị ảnh hưởng
					if(x>0) {
						hienThiToanBoCDDVD();
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
		}
	}

	public void hienThiChiTiet(String ma) {
		try {
			String sql = "select * from CDDCDColection where Ma=?";
			preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, ma);
			ResultSet rs = preStatement.executeQuery();
			if (rs.next()) {
				txtMa.setText(rs.getString(1));
				txtTen.setText(rs.getString(2));
				txtLoai.setText(rs.getString(3));
				txtNamXuatBan.setText(rs.getInt(4) + "");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public boolean kiemTraMaTonTai(String ma) {
		try {
			String sql = "select * from CDDCDColection where Ma=?";
			preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, ma);
			ResultSet rs = preStatement.executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	protected void xuLyLuuCDDVD() {
		// TODO Auto-generated method stub
		if (kiemTraMaTonTai(txtMa.getText())) {
			int result = JOptionPane.showConfirmDialog(null,
					"bạn có muốn thay đổi loại đĩa có mã " + txtMa.getText() + " không? ", "hộp thoại xác nhận",
					JOptionPane.YES_NO_OPTION);

			if (result == JOptionPane.NO_OPTION) {
				return;
			}
			try {
				String sql = "update CDDCDColection set TieuDe=?, LoaiDia=?, NamXuatBan=? where Ma=?";
				preStatement = conn.prepareStatement(sql);// truy vấn tới row chứa Ma=?, nếu đã trùng mã thì update
				preStatement.setString(1, txtTen.getText());
				preStatement.setString(2, txtLoai.getText());
				preStatement.setInt(3, Integer.parseInt(txtNamXuatBan.getText()));
				preStatement.setString(4, txtMa.getText());

				int x = preStatement.executeUpdate();
				if (x > 0) {
					hienThiToanBoCDDVD();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		} else {
			try {
				String sql = "insert into CDDCDColection values(?,?,?,?)"; // các dấu ? lần lượt tính từ 1, lafcasc
																			// parameter
				preStatement = conn.prepareStatement(sql);
				preStatement.setString(1, txtMa.getText());
				preStatement.setString(2, txtTen.getText());
				preStatement.setString(3, txtLoai.getText());
				preStatement.setInt(4, Integer.parseInt(txtNamXuatBan.getText()));
				int x = preStatement.executeUpdate(); // trả về số dòng đã cập nhật
				if (x > 0) {
					hienThiToanBoCDDVD();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	private void addControls() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		con.add(pnThongTin, BorderLayout.NORTH);

		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMa = new JLabel("Mã:");
		txtMa = new JTextField(20);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnThongTin.add(pnMa);

		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTen = new JLabel("Tên:");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTin.add(pnTen);

		JPanel pnLoai = new JPanel();
		pnLoai.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblLoai = new JLabel("Loại:");
		txtLoai = new JTextField(20);
		pnLoai.add(lblLoai);
		pnLoai.add(txtLoai);
		pnThongTin.add(pnLoai);

		JPanel pnNamXB = new JPanel();
		pnNamXB.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNamXB = new JLabel("Năm XB:");
		txtNamXuatBan = new JTextField(20);
		pnNamXB.add(lblNamXB);
		pnNamXB.add(txtNamXuatBan);
		pnThongTin.add(pnNamXB);

		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnLuu = new JButton("Lưu");
		btnXoa = new JButton("Xóa");
		btnTimKiem = new JButton("Tìm Kiếm");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnButton.add(btnTimKiem);
		pnThongTin.add(pnButton);

		dtmCd = new DefaultTableModel();
		dtmCd.addColumn("Mã ");
		dtmCd.addColumn("Tiêu đề");
		dtmCd.addColumn("Loại");
		dtmCd.addColumn("Năm XB");
		tblCd = new JTable(dtmCd);
		JScrollPane scTable = new JScrollPane(tblCd, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		con.add(scTable, BorderLayout.CENTER);
		lblLoai.setPreferredSize(lblNamXB.getPreferredSize());
		lblMa.setPreferredSize(lblNamXB.getPreferredSize());
		lblTen.setPreferredSize(lblNamXB.getPreferredSize());
	}

	public void showWindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
