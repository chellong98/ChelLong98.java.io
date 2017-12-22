package ChelLong.database.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Driver;

public class TaiSanUi extends JFrame {
	DefaultTableModel dtmTaiSan;
	JTable tblTaiSan;
	
	Connection conn = null;
	Statement statement = null;
	
	public TaiSanUi (String title) {
		super(title);
		addControls();
		addEvents();
		ketNoiCoSoDuLieuMySQL();
		hienThiToanBoTaiSan();
	}

	private void hienThiToanBoTaiSan() {
		try {
			String sql = "select * from taisan";
			statement = conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,//tham chiếu đc đến các dòng trong sql
					ResultSet.CONCUR_READ_ONLY);//chỉ đọc k sửa đc
			ResultSet result = statement.executeQuery(sql);
			dtmTaiSan.setRowCount(0);
			while(result.next()) {
				Vector<Object> vec = new Vector<>();
				vec.add(result.getString(1));
				vec.add(result.getString(2));
				vec.add(result.getDate(3));
				vec.add(result.getInt(4));
				vec.add(result.getInt(5));
				dtmTaiSan.addRow(vec);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void ketNoiCoSoDuLieuMySQL() {
		try {
			String strConn = "jdbc:mysql://localhost//dbtaisan";
			Properties pro = new Properties();
			pro.put("user", "root");
			pro.put("password", "");
			Driver driver = new Driver();
			conn = driver.connect(strConn, pro);//truyền vào chuỗi kết nối và đối tượng properties gồm username và pass
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void addEvents() {
		
	}

	private void addControls() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		JLabel lblTitle = new JLabel("Chương trình quản lý tài sản");
		lblTitle.setFont(new Font("arial", Font.BOLD, 20));//font chữ, loại chữ, cỡ chữ
		lblTitle.setForeground(Color.blue);
		pnNorth.add(lblTitle);
		con.add(pnNorth, BorderLayout.NORTH);
		
		dtmTaiSan = new DefaultTableModel();
		dtmTaiSan.addColumn("Mã tài sản");
		dtmTaiSan.addColumn("Tên tài sản");
		dtmTaiSan.addColumn("Ngày nhập");
		dtmTaiSan.addColumn("Số năm khấu hao");
		dtmTaiSan.addColumn("Trị giá");
		tblTaiSan = new JTable(dtmTaiSan);
		JScrollPane scTable = new JScrollPane(tblTaiSan, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		con.add(scTable, BorderLayout.CENTER);
		
	}
	
	public void showWindow() {
		
		this.setSize(700, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
