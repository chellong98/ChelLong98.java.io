package ChelLong.javaoop.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ChelLong.javaoop.model.HoaDon;
import ChelLong.javaoop.model.KhachHang;
import ChelLong.javaoop.model.MatHang;
import ChelLong.javaoop.model.Pair;
import ChelLong.javaoop.sevice.DocGhiFileKhachHangService;
import ChelLong.javaoop.sevice.DocGhiFileMatHangService;

public class ThietLapHoaDonUI extends JFrame {
	
	JComboBox<KhachHang>cboKhachHang;
	JComboBox<MatHang>cboMatHang;
	JTextField txtSoLuong, txtMaHoaDon;
	JButton btnInHoaDon, btnThemMatHang;
	public static String maHoaDon;
	public static String soLuong;
	public static Pair<MatHang, Integer>pair = new Pair<MatHang, Integer>();
	
	public ThietLapHoaDonUI (String title) {
		super(title);
		addControls();
		addEvents();
		hienThiKhachHang();
		hienThiMatHang();
	}

	public HoaDon thietLapThongTin() {
		// TODO Auto-generated method stub
		
		HoaDon hd = new HoaDon();
		hd.setCode(maHoaDon);
		System.out.println(hd.getCode());
		Date date = new Date();
		hd.setTimeCreated(date);
		KhachHang kh = (KhachHang)cboKhachHang.getSelectedItem();
		hd.setCodeCustomer(kh.getCodeCustomer());
		hd.setPair(pair);
		
		return hd;
	}
	
	private void hienThiMatHang() {
		// TODO Auto-generated method stub
		DocGhiFileKhachHangService service = new DocGhiFileKhachHangService();
		ArrayList<KhachHang>list = service.docFile("KHACHHANG.txt");
		for(KhachHang kh : list) {
			cboKhachHang.addItem(kh);
		}
	}

	private void hienThiKhachHang() {
		// TODO Auto-generated method stub
		DocGhiFileMatHangService service = new DocGhiFileMatHangService();
		ArrayList<MatHang> list = service.docFile("MATHANG.txt");
		for(MatHang mh : list) {
			cboMatHang.addItem(mh);
		}
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnInHoaDon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				maHoaDon = txtMaHoaDon.getText();
				ThongTinHoaDonUI ui = new ThongTinHoaDonUI("Thông tin hóa đơn");
				ui.showWindow();
			}
		});
		btnThemMatHang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				themMatHang();
			}
		});
		
	}

	protected void themMatHang() {
		
		soLuong = txtSoLuong.getText();
		// TODO Auto-generated method stub
		MatHang mh = (MatHang)cboMatHang.getSelectedItem();
		try {
			pair.put(mh, Integer.parseInt(soLuong));
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "bạn nhập sai, mời nhập lại");
			return;
		}
		txtSoLuong.setText("");
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		JLabel lblTieuDe = new JLabel("Thiết lập hóa đơn");
		con.add(lblTieuDe);
		
		JPanel pnKhachHang = new JPanel();
		pnKhachHang.setLayout(new FlowLayout());
		JLabel lblKhachHang = new JLabel("Khách hàng ");
		cboKhachHang = new JComboBox<KhachHang>();
		pnKhachHang.add(lblKhachHang);
		pnKhachHang.add(cboKhachHang);
		con.add(pnKhachHang);
		
		JPanel pnMatHang = new JPanel();
		pnMatHang.setLayout(new FlowLayout());
		JLabel lblMatHang = new JLabel("Mặt hàng ");
		cboMatHang = new JComboBox<MatHang>();
		pnMatHang.add(lblMatHang);
		pnMatHang.add(cboMatHang);
		con.add(pnMatHang);
		
		JPanel pnSoLuong = new JPanel();
		pnSoLuong.setLayout(new FlowLayout());
		JLabel lblSoLuong = new JLabel("Số lượng");
		txtSoLuong = new JTextField(20);
		pnSoLuong.add(lblSoLuong);
		pnSoLuong.add(txtSoLuong);
		con.add(pnSoLuong);
		
		JPanel pnMaHoaDon = new JPanel();
		pnMaHoaDon.setLayout(new FlowLayout());
		JLabel lblMaHoaDon = new JLabel("Mã hóa đơn ");
		txtMaHoaDon = new JTextField(20);
		pnMaHoaDon.add(lblMaHoaDon);
		pnMaHoaDon.add(txtMaHoaDon);
		con.add(pnMaHoaDon);
		
		JPanel pnInHoaDon = new JPanel();
		pnInHoaDon.setLayout(new FlowLayout());
		btnInHoaDon = new JButton("In hóa đơn");
		btnThemMatHang = new JButton("Thêm vào giỏ hàng");
		pnInHoaDon.add(btnInHoaDon);
		pnInHoaDon.add(btnThemMatHang);
		con.add(pnInHoaDon);
	}
	
	public void showWindow() {
		this.setSize(300, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
