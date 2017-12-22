package ChelLong.javaSwing.Ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBorderVaJtextAreaCheckboxRadioUi extends JFrame {
	JTextField txtTen;
	JTextArea txtDiaChi;
	Button btnOk;

	JCheckBox chkDiBoi, chkDiXemPhim;
	JRadioButton radNam, radNu;
	ButtonGroup groupGioiTinh;

	public HocBorderVaJtextAreaCheckboxRadioUi(String title) {
		super(title);
		addControls();
		addEvent();
	}

	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel(); // tạo panel cho cả form
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);

		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));

		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen = new JLabel("Nhập tên: ");
		txtTen = new JTextField(20);

		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTin.add(pnTen);

		JPanel pnDiaChi = new JPanel();
		pnDiaChi.setLayout(new FlowLayout());
		JLabel lblDiaChi = new JLabel("Địa chỉ: ");
		txtDiaChi = new JTextArea(5, 19);
		txtDiaChi.setWrapStyleWord(true); // tự động xuống dòng khi đến biên textArea
		txtDiaChi.setLineWrap(true); // đi cùng với dòng trên

		JScrollPane sc = new JScrollPane(txtDiaChi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, // theo chiều dọc
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // theo chiều ngnag

		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(sc);
		pnThongTin.add(pnDiaChi);

		// đưa pnthongtin vào main
		pnMain.add(pnThongTin); // đưa panel thông tin vào main

		// tạo border thông tin
		// Border borderThongTin = new TitledBorder("thông tin"); //tạo border thông
		// thường có tiêu đề
		Border borderThongTin = BorderFactory.createLineBorder(Color.BLUE); // tạo border theo lớp
		TitledBorder borderTittleThongTin = new TitledBorder(borderThongTin, "Thông tin: ");// add tittle border vào
																							// borderthongtin
		pnThongTin.setBorder(borderTittleThongTin);// cho borderthongtin vào pnthongtin
		borderTittleThongTin.setTitleColor(Color.RED); // đặt màu đỏ cho tittle
		borderTittleThongTin.setTitleJustification(TitledBorder.CENTER); // căn giữa cho tittle

		JPanel pnSoThichVaGioiTinh = new JPanel();

		pnSoThichVaGioiTinh.setLayout(new GridLayout(1, 2)); // box layout theo chiều
																								// ngang
		JPanel pnSothich = new JPanel();
		pnSothich.setLayout(new BoxLayout(pnSothich, BoxLayout.Y_AXIS));
		Border borderSoThich = BorderFactory.createLineBorder(Color.red);
		TitledBorder tittleBorderSoThich = new TitledBorder(borderSoThich, "Sở thích");
		pnSothich.setBorder(tittleBorderSoThich); // setborder có tiêu đề
		chkDiBoi = new JCheckBox("Đi bơi");
		chkDiXemPhim = new JCheckBox("Đi xem phim");
		pnSothich.add(chkDiBoi);
		pnSothich.add(chkDiXemPhim);

		JPanel pnGioiTinh = new JPanel();

		pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
		Border borderGioiTinh = BorderFactory.createLineBorder(Color.red);
		TitledBorder tittleBorderGioiTinh = new TitledBorder(borderGioiTinh, "Giới tính");
		pnGioiTinh.setBorder(tittleBorderGioiTinh); // setborder có tiêu đề
		radNam = new JRadioButton("Nam");
		radNu = new JRadioButton("Nữ");
		groupGioiTinh = new ButtonGroup(); // thêm các radio vào 1 group
		groupGioiTinh.add(radNam);
		groupGioiTinh.add(radNu);
		pnGioiTinh.add(radNam); // thêm nam nữ ào giới tính
		pnGioiTinh.add(radNu);

//		pnGioiTinh.setPreferredSize();
		
		pnSoThichVaGioiTinh.add(pnSothich); // thêm sở thích vào pn sở thích và giới tính
		pnSoThichVaGioiTinh.add(pnGioiTinh); // thêm giới tính vào

		pnMain.add(pnSoThichVaGioiTinh);

		JPanel pnOk = new JPanel();
		pnOk.setLayout(new FlowLayout(FlowLayout.RIGHT)); // căn phải cho layout Ok
		btnOk = new Button("OK");
		pnOk.add(btnOk);
		pnMain.add(pnOk);

		lblDiaChi.setPreferredSize(lblTen.getPreferredSize()); // cho độ rỗng nhãn địa chi bằng tên
	}

	public void addEvent() {
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLayThongTin();
			}

			private void xuLyLayThongTin() {
				// TODO Auto-generated method stub
				String msg = "Tên: " + txtTen.getText() + "\n" + "Địa chỉ: " + txtDiaChi.getText() + "\n";
				String soThich = "";
				if (chkDiBoi.isSelected()) { //nếu chọn đi bơi
					soThich += chkDiBoi.getText() + " "; //trả về button text
				}
				if (chkDiXemPhim.isSelected()) {
					soThich += chkDiXemPhim.getText() + " ";
				}
				msg += "Sở thích: " + soThich + "\n"; //nối chuỗi
				String gioiTinh = "";
				if (radNam.isSelected()) { //nếu nam được chọn
					gioiTinh += radNam.getText();
				} else if (radNu.isSelected()) {
					gioiTinh += radNu.getText();
				}
				msg += "Giới tính: " + gioiTinh;
				JOptionPane.showMessageDialog(null, msg); //hiển thị thông báo
			}
		});
	}
}
