package ChelLong.javaoop.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import ChelLong.javaoop.model.HoaDon;
import ChelLong.javaoop.model.KhachHang;
import ChelLong.javaoop.model.MatHang;

public class ThongTinHoaDonUI extends JFrame {
	JTextField txtMaHoaDon, txtThoiGian, txtMaKhachHang, txtTongTien;
	DefaultTableModel dtmMatHang;
	JTable tblMatHang;
	
	HoaDon hd;
	public ThongTinHoaDonUI (String title) {
		super(title);
		addControls();
		addEvents();
		hienThiThongTin();
		txtMaHoaDon.setEditable(false);
		txtThoiGian.setEditable(false);
		txtMaKhachHang.setEditable(false);
	}
	

	private void hienThiThongTin() {
		// TODO Auto-generated method stub
		ThietLapHoaDonUI ui = new ThietLapHoaDonUI("");
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		hd = ui.thietLapThongTin();
		txtMaHoaDon.setText(hd.getCode());
		txtThoiGian.setText(format.format(hd.getTimeCreated()));
		txtMaKhachHang.setText(hd.getCodeCustomer());
		Iterator<MatHang> it = hd.getPair().keySet().iterator();
		while(it.hasNext()) {
			MatHang mh = it.next();
			int value = hd.getPair().get(mh);
			double price = mh.getPrice();
			Vector<Object>vec = new Vector<>();
			vec.add(mh);
			vec.add(value);
			vec.add(price);
			dtmMatHang.addRow(vec);
		}
		hd.setSumPrice();//tính tổng tiền
		txtTongTien.setText(hd.getSumPrice()+"");
		
	}



	private void addControls() {
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JLabel lblThongTin = new JLabel("Thông tin hóa đơn");
		con.add(lblThongTin);
		
		/*pn thông tin*/
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		pnThongTin.setPreferredSize(new Dimension(0, 200));
		JPanel pnMaHoaDon = new JPanel();
		pnMaHoaDon.setLayout(new FlowLayout());
		JLabel lblMaHoaDon = new JLabel("Mã hóa đơn ");
		txtMaHoaDon = new JTextField(20);
		pnMaHoaDon.add(lblMaHoaDon);
		pnMaHoaDon.add(txtMaHoaDon);
		pnThongTin.add(pnMaHoaDon);
		
		JPanel pnThoiGian = new JPanel();
		JLabel lblThoiGian = new JLabel("Thời gian ");
		txtThoiGian = new JTextField(20);
		pnThoiGian.add(lblThoiGian);
		pnThoiGian.add(txtThoiGian);
		pnThongTin.add(pnThoiGian);
		
		JPanel pnMaKhachHang = new JPanel();
		JLabel lblMaKhachHang = new JLabel("Mã Khách hàng ");
		txtMaKhachHang = new JTextField(20);
		pnMaKhachHang.add(lblMaKhachHang);
		pnMaKhachHang.add(txtMaKhachHang);
		pnThongTin.add(pnMaKhachHang);
		
		/*pn thông tin mặt hàng đã mua*/
		dtmMatHang = new DefaultTableModel();
		dtmMatHang.addColumn("mặt hàng ");
		dtmMatHang.addColumn("Giá ");
		dtmMatHang.addColumn("Số lượng mua ");
		tblMatHang = new JTable(dtmMatHang);
		JScrollPane scMatHang = new JScrollPane(tblMatHang, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JPanel pnMatHang = new JPanel();
		pnMatHang.setLayout(new BorderLayout());
		pnMatHang.add(scMatHang, BorderLayout.CENTER);
		
		/*pn tổng tiền*/
		JPanel pnTongTien = new JPanel();
		pnTongTien.setPreferredSize(new Dimension(0, 100));
		JLabel lblTongTien = new JLabel("Tổng tiền");
		txtTongTien = new JTextField(20);
		pnTongTien.add(lblTongTien);
		pnTongTien.add(txtTongTien);
		
		con.add(pnThongTin);
		con.add(pnMatHang);
		con.add(pnTongTien);
	}
	
	private void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(300, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
