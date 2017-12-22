package ChelLong.javaSwing.Ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import ChelLong.javaSwing.model.NhanVien;
import ChelLong.javaSwing.model.PhongBan;
import ChelLong.javaSwing.model.SerilizeFileFactory;

public class QuanLyNhanVienUi extends JFrame {
	JComboBox<PhongBan> cboPhongBan; // danh sách phòng ban
	JList<NhanVien> listNhanVien;// danh sahcs nhân viên
	JTextField txtMa, txtTen, txtNgayVaoLam, txtNamSinh;
	JButton btnLuu, btnXoa, btnThoat, btnLuuFile, btnDocFile;

	ArrayList<PhongBan>dsPhongBan;
	ArrayList<NhanVien>dsNhanVienTheoPhongBan;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	PhongBan pbSelected = null; //lưu phòng ban đc chọn
	NhanVien nvSelected = null;//lưu nhân viên đc chọn
	public QuanLyNhanVienUi(String title) {
		super(title);
		addControl();
		addEvents();
		fakeData();
	}

	public void addControl() {
		/*tạo giao diện khung*/
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		con.add(pnMain);
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		
		/**
		 * tạo giao diện cho phòng ban
		 * */
		JPanel pnPhongBan = new JPanel();
		pnPhongBan.setLayout(new FlowLayout());
		pnMain.add(pnPhongBan);
		JLabel lblPhongBan = new JLabel(" chọn Lớp Học: ");
		cboPhongBan = new JComboBox<PhongBan>();
		cboPhongBan.setPreferredSize(new Dimension(200, 25)); // tạo kích thước cho combobox
		pnPhongBan.add(lblPhongBan);
		pnPhongBan.add(cboPhongBan);
		
		/**
		 * tạo giao diện cho danh sách nhân viên và chi tiết
		 * */
		JPanel pnDanhSachVachiTiet = new JPanel();
		pnDanhSachVachiTiet.setLayout(new GridLayout(1, 2)); //1 dòng 2 cột
		pnMain.add(pnDanhSachVachiTiet);
		/*tạo giao diện cho danh sách*/
		JPanel pnDanhSach = new JPanel();
		pnDanhSach.setLayout(new BorderLayout()); //set border layout cho danh sách
		listNhanVien = new JList<NhanVien>();
		JScrollPane sc = new JScrollPane(listNhanVien, // 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDanhSach.add(sc, BorderLayout.CENTER);
		pnDanhSachVachiTiet.add(pnDanhSach);
		//border
		Border borderDanhSach = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderDanhSach = new TitledBorder(borderDanhSach, "Danh sách học viên");
		titleBorderDanhSach.setTitleJustification(TitledBorder.CENTER);;
		titleBorderDanhSach.setTitleColor(Color.red);
		pnDanhSach.setBorder(titleBorderDanhSach);
		/*tạo giao diện cho chi tiết*/
		JPanel pnChiTiet = new JPanel();
		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		pnDanhSachVachiTiet.add(pnChiTiet);
		//pn mã
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout());
		JLabel lblMa = new JLabel("Mã: ");
		txtMa = new JTextField(18);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnChiTiet.add(pnMa);
		//pn tên
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen = new JLabel("Tên: ");
		txtTen = new JTextField(18);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnChiTiet.add(pnTen);
		//pn ngày vào làm
		JPanel pnNgayVao = new JPanel();
		pnNgayVao.setLayout(new FlowLayout());
		JLabel lblNgayVao = new JLabel("Ngày vào học: ");
		txtNgayVaoLam = new JTextField(13);
		pnNgayVao.add(lblNgayVao);
		pnNgayVao.add(txtNgayVaoLam);
		pnChiTiet.add(pnNgayVao);
		//pn ngày sinh
		JPanel pnNgaySinh = new JPanel();
		pnNgaySinh.setLayout(new FlowLayout());
		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		txtNamSinh = new JTextField(15);
		pnNgaySinh.add(lblNgaySinh);
		pnNgaySinh.add(txtNamSinh);
		pnChiTiet.add(pnNgaySinh);
		//border
		Border borderChiTiet = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderChiTiet = new TitledBorder(borderChiTiet, "thông tin chi tiết");
		pnChiTiet.setBorder(titleBorderChiTiet);;
		titleBorderChiTiet.setTitleJustification(TitledBorder.CENTER);
		titleBorderChiTiet.setTitleColor(Color.red);
		/**
		 * tạo giao diện cho button
		 */
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		pnMain.add(pnButton);
		btnLuu = new JButton("Lưu");
		btnXoa = new JButton("Xóa");
		btnThoat = new JButton("Thoát");
		btnLuuFile = new JButton("Lưu vào file");
		btnDocFile = new JButton("Đọc dữ liệu");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnButton.add(btnThoat);
		pnButton.add(btnLuuFile);
		pnButton.add(btnDocFile);
		//border
		Border borderButton = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderButton = new TitledBorder(borderButton, "Chọn Chức Năng");
		pnButton.setBorder(titleBorderButton);
		titleBorderButton.setTitleJustification(TitledBorder.CENTER);
		titleBorderButton.setTitleColor(Color.red);
//		lblMa.setPreferredSize(lblNgayVao.getPreferredSize());
//		lblTen.setPreferredSize(lblNgayVao.getPreferredSize());
//		lblNgaySinh.setPreferredSize(lblNgayVao.getPreferredSize());
	}
 
	@SuppressWarnings("deprecation")
	public void fakeData() {
		dsPhongBan = new ArrayList<PhongBan>();
		
		PhongBan phtgv = new PhongBan();
		phtgv.setMaPhong("p1");
		phtgv.setTenPhong("Lập trình Java-07");
		
		PhongBan pkd = new PhongBan();
		pkd.setMaPhong("p1");
		pkd.setTenPhong("Phòng kinh doanh");
		
		PhongBan pkt = new PhongBan();
		pkt.setMaPhong("p2");
		pkt.setTenPhong("Phòng kế toán");
		
		dsPhongBan.add(phtgv);
		dsPhongBan.add(pkd);
		dsPhongBan.add(pkt);
		
		for(PhongBan pb : dsPhongBan) {
			cboPhongBan.addItem(pb);
		}
		
		phtgv.themNhanVien(new NhanVien("NV1", "Nguyễn Nhật Long", 
				new Date(2016-1900, 1, 1), //năm, tháng, ngày
				new Date(1998-1900, 7, 17)));
		phtgv.themNhanVien(new NhanVien("NV2", "Nguyễn công cừ", 
				new Date(2015-1900, 1, 2), 
				new Date(1996-1900, 2, 5)));
		pkd.themNhanVien(new NhanVien("NV3", "Hà Cảnh Dương", 
				new Date(2016-1900, 3, 2), 
				new Date(1992-1900, 12, 4)));
		pkt.themNhanVien(new NhanVien("NV4", "Nguyễn thị an", 
				new Date(2016-1900, 7, 17), 
				new Date(1998-1900, 12, 1)));
	}
	
	public void addEvents() {
		cboPhongBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (cboPhongBan.getSelectedIndex()==-1) { //nếu không chọn thì không làm gì
					return;
				}
				pbSelected = (PhongBan) cboPhongBan.getSelectedItem(); //lấy ra phòng ban
				listNhanVien.setListData(pbSelected.getNhanViens());//lấy ra danh sách nhân viên trong 1 phòn
				
			}
		});
		
		listNhanVien.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {//tạo sự kiện cho mouse
				// TODO Auto-generated method stub
				if (listNhanVien.getSelectedIndex()==-1) {
					return;
				}
				nvSelected = listNhanVien.getSelectedValue();
				txtMa.setText(nvSelected.getMaNhanVien());
				txtTen.setText(nvSelected.getTenNhanVien());
				txtNamSinh.setText(sdf.format(nvSelected.getNgaySinh()));
				txtNgayVaoLam.setText(sdf.format(nvSelected.getNgayVaoLamViec()));
			}
		});
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyXoa();
			}
		});
		
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuu();
			}
		});
		
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyThoat();
			}
		});
		
		btnLuuFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					xuLiLuuFile();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		
		btnDocFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLiDocDuLieu();
			}
		});
	}
	
	
	protected void xuLiDocDuLieu() {
		// TODO Auto-generated method stub
		JFileChooser fileChooser = new JFileChooser(); //đối tượng chọn file
		int result = fileChooser.showOpenDialog(null); //trả về kết quả nếu mở đc hộp thoại
		File file = null;
		if (result == JFileChooser.APPROVE_OPTION) {
			 file = fileChooser.getSelectedFile();
		} else {
			return;
		}
		try {
			pbSelected.setNhanViens(SerilizeFileFactory.docFile(file.getCanonicalPath())); //lấy ra đường dẫn file
			JOptionPane.showMessageDialog(null, "Đọc file thành công!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void xuLyXoa() {
		if (nvSelected!=null) { //nếu chọn
			pbSelected.getNhanViens().remove(nvSelected); //bỏ nv đó ra khỏi ds
			nvSelected = null;//cho nv đó = null
			listNhanVien.setListData(pbSelected.getNhanViens());//set list mới
		}
	}
	public void xuLyLuu() {
		try {
			NhanVien nv = new NhanVien();
			nv.setMaNhanVien(txtMa.getText());
			nv.setTenNhanVien(txtTen.getText());
			nv.setNgaySinh(sdf.parse(txtNamSinh.getText())); //lấy ra ngày tháng năm
			nv.setNgayVaoLamViec(sdf.parse(txtNgayVaoLam.getText()));
			if (pbSelected!=null) { //nếu chọn phòng ban
				pbSelected.themNhanVien(nv);// thêm nhân viên mới vào list
				listNhanVien.setListData(pbSelected.getNhanViens());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "bạn nhập sai ngày tháng năm, ngu vl!");
		}
	}
	
	public void xuLiLuuFile() {
		Vector<NhanVien>NhanViens = pbSelected.getNhanViens(); //lấy ra danh sách nhân viên ở phòng ban hiện tại
		String fileName = null;
		try {
			//cách nhập từ bàn phím không dùng Scanner
			InputStreamReader isr = new InputStreamReader(System.in);
			fileName = JOptionPane.showInputDialog("mời bạn nhập đường dẫn file: ");
//			BufferedReader br = new BufferedReader(isr);
//			fileName = br.readLine();
			File file = new File(fileName);
			if (file.exists()) { //nếu file  tồn tại, xóa file đó đi
				file.delete();
			}
			file.createNewFile();
			boolean kt = SerilizeFileFactory.luuFile(NhanViens, fileName);
			if (kt) {
				JOptionPane.showMessageDialog(null, "lưu file thành công!");
			} else {
				JOptionPane.showMessageDialog(null, "lưu file thất bại!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public void xuLyThoat() {
		System.exit(0);
	}
	public void showWindow() {
		this.setSize(550, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
