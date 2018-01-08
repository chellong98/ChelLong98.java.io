package thihocki.cau2.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import thihocki.cau2.model.SinhVien;
import thihocki.cau2.service.DocGhiFileSinhVienService;

public class QuanLySinhVienUI extends JFrame {
	JTextField txtTenSinhVien, txtTuoiSinhVien, txtTenSinhVienCanTim;
	JButton btnSave, btnOpen, btnSearch;
	JTextArea areaOpen, areaSearch;
	ArrayList<SinhVien>list;
	public QuanLySinhVienUI(String title) {
		super(title);
		list = new ArrayList<>();
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuu();
			}
		});
		btnOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyDocDanhSach();
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyTimKiem();
			}
		});
	}

	protected void xuLyTimKiem() {
		// TODO Auto-generated method stub
		list = DocGhiFileSinhVienService.docFile("sinhvien.txt");
		String tenSinhVien = txtTenSinhVienCanTim.getText().trim();
		boolean check = false;
		for(SinhVien sv : list) {
			if(sv.getTenSinhVien().equals(tenSinhVien)) {
				areaSearch.setText(sv.toString());
				check = true;
				return;
			}
		}
		if(!check) {
			JOptionPane.showMessageDialog(null, "không có sinh viên tên: " + tenSinhVien);
		}
	}

	protected void xuLyDocDanhSach() {
		// TODO Auto-generated method stub
		list = DocGhiFileSinhVienService.docFile("sinhvien.txt");
		StringBuilder builder = new StringBuilder();
		for(SinhVien sv : list) {
			builder.append(sv.toString());
		}
		areaOpen.setText(builder.toString());
	}

	protected void xuLyLuu() {
		// TODO Auto-generated method stub
		if(txtTenSinhVien.getText().trim().equals("") ||txtTuoiSinhVien.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "bạn nhập chưa đúng, mời nhập lại");
			return;
		}
		SinhVien sv = new SinhVien();
		sv.setTenSinhVien(txtTenSinhVien.getText().trim());
		sv.setTuoiSinhVien(Integer.parseInt(txtTuoiSinhVien.getText()));
		list.add(sv);
		DocGhiFileSinhVienService.luuFile(list, "sinhvien.txt");
		txtTenSinhVien.setText("");
		txtTuoiSinhVien.setText("");
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel pnLuuSinhvien = new JPanel();
		pnLuuSinhvien.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblTenSinhVien = new JLabel("Tên Sinh viên");
		txtTenSinhVien = new JTextField(10);
		JLabel lblTuoiSinhVien = new JLabel("Tuổi sinh viên");
		txtTuoiSinhVien = new JTextField(10);
		btnSave = new JButton("Save");
		pnLuuSinhvien.add(lblTenSinhVien);
		pnLuuSinhvien.add(txtTenSinhVien);
		pnLuuSinhvien.add(lblTuoiSinhVien);
		pnLuuSinhvien.add(txtTuoiSinhVien);
		pnLuuSinhvien.add(btnSave);
		con.add(pnLuuSinhvien, BorderLayout.NORTH);
		
		JPanel pnXemDanhSachSinhVien = new JPanel();
		pnXemDanhSachSinhVien.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnOpen = new JButton("Open");
		areaOpen = new JTextArea();
		areaOpen.setPreferredSize(new Dimension(350, 200));
		JScrollPane scOpen = new JScrollPane(areaOpen, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnXemDanhSachSinhVien.add(btnOpen);
		pnXemDanhSachSinhVien.add(scOpen);
		con.add(pnXemDanhSachSinhVien, BorderLayout.CENTER);
		
		JPanel pnTimSinhVien = new JPanel();
		pnTimSinhVien.setLayout(new BoxLayout(pnTimSinhVien, BoxLayout.Y_AXIS));
		JPanel pnSearch = new JPanel();
		pnSearch.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lblSeach = new JLabel("Tên sinh viên cần tìm");
		txtTenSinhVienCanTim = new JTextField(10);
		btnSearch = new JButton("tìm sinh viên");
		pnSearch.add(lblSeach);
		pnSearch.add(txtTenSinhVienCanTim);
		pnSearch.add(btnSearch);
		areaSearch = new JTextArea();
		areaSearch.setPreferredSize(new Dimension(400, 150));
		JScrollPane scSearch = new JScrollPane(areaSearch, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTimSinhVien.add(pnSearch);
		pnTimSinhVien.add(scSearch);
		con.add(pnTimSinhVien, BorderLayout.SOUTH);
	}
	
	public void showWindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
