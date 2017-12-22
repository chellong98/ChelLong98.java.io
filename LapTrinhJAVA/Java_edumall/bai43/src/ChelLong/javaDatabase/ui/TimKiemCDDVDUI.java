package ChelLong.javaDatabase.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TimKiemCDDVDUI extends JDialog {
	JTextField txtTim;
	JButton btnTim;
	
	DefaultTableModel dtmCd;
	JTable tblCd;
	
	Connection conn=null;
	PreparedStatement preStatement=null;
	ResultSet result=null;
	
	public TimKiemCDDVDUI (String title) {
		this.setTitle(title);
		addControls();
		addEvents();
		ketNoiCoSoDuLieu();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnTim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				xuLyTimKiem();
			}
		});
	}
	
	protected void xuLyTimKiem() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from CDDCDColection where LoaiDia=?"; //chưa biết select loại đĩa nào
			preStatement=conn.prepareStatement(sql);
			preStatement.setString(1, txtTim.getText());
			result=preStatement.executeQuery();
			dtmCd.setRowCount(0);//đưa về k có dữ liệu
			while(result.next()) {
				Vector<Object>vec = new Vector<>();
				vec.add(result.getString("Ma"));
				vec.add(result.getString("TieuDe"));
				vec.add(result.getString("LoaiDia"));
				vec.add(result.getInt("NamXuatBan"));
				dtmCd.addRow(vec);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
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
	
	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		dtmCd = new DefaultTableModel();
		dtmCd.addColumn("Mã");
		dtmCd.addColumn("Tiêu đề");
		dtmCd.addColumn("Loại");
		dtmCd.addColumn("Năm XB");
		tblCd = new JTable(dtmCd);
		JScrollPane scTable = new JScrollPane(tblCd, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		con.add(scTable, BorderLayout.CENTER);
		
		JPanel pnTim = new JPanel();
		JLabel lblTim = new JLabel("Nhập dữ liệu: ");
		txtTim = new JTextField(20);
		btnTim = new JButton("Tìm");
		pnTim.add(lblTim);
		pnTim.add(txtTim);
		pnTim.add(btnTim);
		
		con.add(pnTim, BorderLayout.NORTH);
	}
	
	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//tắt cái này thì mới thao tác đc cái khác
		this.setLocationRelativeTo(null);
		this.setModal(true);
		this.setVisible(true);
	}
}
