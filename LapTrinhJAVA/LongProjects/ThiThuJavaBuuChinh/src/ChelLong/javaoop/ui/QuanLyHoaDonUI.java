package ChelLong.javaoop.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ChelLong.javaoop.model.KhachHang;
import ChelLong.javaoop.model.MatHang;
import ChelLong.javaoop.sevice.DocGhiFileKhachHangService;
import ChelLong.javaoop.sevice.DocGhiFileMatHangService;

public class QuanLyHoaDonUI extends JFrame {
	
	DefaultTableModel dtmKhachHang, dtmMatHang;
	JTable tblKhachHang, tblMatHang;
	JButton btnMuaHang;
	
	public QuanLyHoaDonUI (String title) {
		super();
		addControls();
		addEvents();
		hienThiThongTinKhachHang();
		hienthiThongTinMatHang();
	}

	private void hienthiThongTinMatHang() {
		// TODO Auto-generated method stub
		DocGhiFileMatHangService service = new DocGhiFileMatHangService();
		ArrayList<MatHang>list = service.docFile("MATHANG.txt");
		for(MatHang mh : list) {
			Vector<Object>vec= new Vector<>();
			vec.add(mh.getCode());
			vec.add(mh.getName());
			vec.add(mh.getQuantity());
			vec.add(mh.getPrice());
			dtmMatHang.addRow(vec);
		}
	}

	private void hienThiThongTinKhachHang() {
		// TODO Auto-generated method stub
		DocGhiFileKhachHangService service = new DocGhiFileKhachHangService();
		ArrayList<KhachHang>list = service.docFile("KHACHHANG.txt");
		for(KhachHang kh : list) {
			Vector<Object>vec = new Vector<>();
			vec.add(kh.getSoCMTND());
			vec.add(kh.getName());
			vec.add(kh.getAddress());
			vec.add(kh.getCodeCustomer());
			vec.add(kh.getTypeCustomer());
			dtmKhachHang.addRow(vec);
		}
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnMuaHang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ThietLapHoaDonUI ui = new ThietLapHoaDonUI("Thiêt lập hóa đơn");
				ui.showWindow();
			}
		});
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JPanel pnKhachHang = new JPanel();
		pnKhachHang.setSize(new Dimension(0, 250));
		pnKhachHang.setLayout(new BorderLayout());
		JLabel lblKhachHang = new JLabel("Thông tin khách hàng");
		dtmKhachHang = new DefaultTableModel();
		dtmKhachHang.addColumn("số CMND");
		dtmKhachHang.addColumn("Tên KH");
		dtmKhachHang.addColumn("Địa chỉ");
		dtmKhachHang.addColumn("Mã KH");
		dtmKhachHang.addColumn("Loại KH");
		tblKhachHang = new JTable(dtmKhachHang);
		JScrollPane scKhachHang = new JScrollPane(tblKhachHang, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnKhachHang.add(lblKhachHang, BorderLayout.NORTH);
		pnKhachHang.add(scKhachHang, BorderLayout.CENTER);
		con.add(pnKhachHang);
		
		JPanel pnMatHang = new JPanel();
		pnMatHang.setLayout(new BorderLayout());
		JLabel lblMatHang = new JLabel("Thông tin mặt hàng");
		dtmMatHang = new DefaultTableModel();
		dtmMatHang.addColumn("Mã MH");
		dtmMatHang.addColumn("Tên MH");
		dtmMatHang.addColumn("Số lượng");
		dtmMatHang.addColumn("Giá bán");
		tblMatHang = new JTable(dtmMatHang);
		JScrollPane scMatHang = new JScrollPane(tblMatHang, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnMatHang.add(lblMatHang,BorderLayout.NORTH);
		pnMatHang.add(scMatHang,BorderLayout.CENTER);
		con.add(pnMatHang);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnMuaHang = new JButton("Mua Hàng");
		pnButton.add(btnMuaHang);
		con.add(pnButton);
	}
	public void showWindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
