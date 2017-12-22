package ChelLong.javaSwing.Ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBorderVaJtextArea extends JFrame{
	JTextField txtTen;
	JTextArea txtDiaChi;
	Button btnOk;
	public HocBorderVaJtextArea (String title) {
		super(title);
		addControls();
		addEvent();
	}
	public void showWindow () {
		this.setSize(400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void addControls () {
		Container con = getContentPane();
		JPanel pnMain = new JPanel(); //tạo panel cho cả form
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
		txtDiaChi = new JTextArea(5,19);
		txtDiaChi.setWrapStyleWord(true); //tự động xuống dòng khi đến biên textArea
		txtDiaChi.setLineWrap(true); //đi cùng với dòng trên
		
		JScrollPane sc = new JScrollPane(txtDiaChi, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, //theo chiều dọc
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); //theo chiều ngnag
		
		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(sc);
		pnThongTin.add(pnDiaChi);
		
		//đưa pnthongtin vào main
		pnMain.add(pnThongTin); //đưa panel thông tin vào main
		
		//tạo border thông tin
//		Border borderThongTin = new TitledBorder("thông tin"); //tạo border thông thường có tiêu đề
		Border borderThongTin = BorderFactory.createLineBorder(Color.BLUE); //tạo border theo lớp
		TitledBorder borderTittleThongTin = new TitledBorder(borderThongTin, "Thông tin: ");// add tittle border vào borderthongtin
		pnThongTin.setBorder(borderTittleThongTin);//cho borderthongtin vào pnthongtin
		borderTittleThongTin.setTitleColor(Color.RED); //đặt màu đỏ cho tittle
		borderTittleThongTin.setTitleJustification(TitledBorder.CENTER); //căn giữa cho tittle
		
		JPanel pnOk = new JPanel();
		pnOk.setLayout(new FlowLayout(FlowLayout.RIGHT)); //căn phải cho layout Ok
		btnOk = new Button("OK");
		pnOk.add(btnOk);
		pnMain.add(pnOk);
		
		lblDiaChi.setPreferredSize(lblTen.getPreferredSize()); //cho độ rỗng nhãn địa chi bằng tên
	}
	
	public void addEvent () {
		
	}
}
