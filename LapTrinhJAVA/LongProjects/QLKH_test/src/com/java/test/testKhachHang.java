package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.java.model.KhachHang;
import com.java.model.SerilizeFatory;

public class testKhachHang {
	static ArrayList<KhachHang> dsKh = new ArrayList<>();
	
	static void menu () {
		System.out.println("1. thêm khachs hàng");
		System.out.println("2. xuất khachs hàng");
		System.out.println("3. tìm kiếm khách hàng");
		System.out.println("4. sắp xếp khachs hàng");
		System.out.println("5. lưu file khachs hàng");
		System.out.println("6. đọc file khachs hàng");
		System.out.println("7. thống kê khách hàng");
		System.out.println("thoát");
		System.out.print("mời bạn chọn lệnh: ");
		int choice = new Scanner(System.in).nextInt();
		
		switch (choice) {
		case 1:
			themKhachHang();
			break;
		case 2: 
			xuatKhachHang();
			break;
		case 3: 
			timKiemKhachHang();
			break;
		case 4: 
			sapXepKhachHang();
			break;
		case 5: 
			luuFileKhachHang();
			break;
		case 6: 
			DocFileKhachHang();
			break;
		case 7:
			thongKeKhachHang();
			break;
		case 8: 
			thoatChuongTrinh();
			break;
		default: System.out.println("mời bạn nhập lại lệnh!");
		}
	}
	private static void thoatChuongTrinh() {
		// TODO Auto-generated method stub
		System.out.println("bye bye");
		System.exit(0);
		
		
	}
	private static void thongKeKhachHang() {
		// TODO Auto-generated method stub
		
	}
	private static void DocFileKhachHang() {
		// TODO Auto-generated method stub
		dsKh = SerilizeFatory.docFile("data.db");
		if(dsKh.size()>0) {
			System.out.println("đã đọc dữ liệu");
		} else {
			System.out.println("chưa đọc đc dữ liệu");
		}
	}
	private static void luuFileKhachHang() {
		// TODO Auto-generated method stub
		
		boolean check = SerilizeFatory.luuFile(dsKh, "data.db");
		if(check) {
			System.out.println("lưu file thành công");
		} else {
			System.out.println("lưu file thất bại");
		}
	}
	private static void sapXepKhachHang() {
		// TODO Auto-generated method stub
		Collections.sort(dsKh);
		System.out.println("đã sắp xếp theo số điện thoại");
	}
	private static void timKiemKhachHang() {
		// TODO Auto-generated method stub
		System.out.println("nhập vào đầu số bạn muốn tìm kiếm: ");
		String pattern = new Scanner(System.in).nextLine();
		System.out.println("=================================");
		System.out.println("mã\ttên\tphone");
		boolean check = false;
		for(KhachHang kh : dsKh) {
			if(kh.getPhone().startsWith(pattern)) {
				System.out.println(kh);
				check = true;
			}
		}
		if(!check) {
			System.out.println("null\tnull\tnull");
		}
		System.out.println("=================================");
	}
	private static void xuatKhachHang() {
		// TODO Auto-generated method stub
		System.out.println("=================================");
		System.out.println("mã\ttên\tphone");
		for (KhachHang kh : dsKh) {
			System.out.println(kh);
		}
		System.out.println("=================================");
	}
	private static void themKhachHang() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập mã khách hàng: ");
		String ma = sc.nextLine();
		System.out.println("nhập tên khách hàng: ");
		String ten = sc.nextLine();
		System.out.println("nhập số điện thoại khách hàng: ");
		String phone = sc.nextLine();
		
		KhachHang kh = new KhachHang();
		kh.setMa(ma);
		kh.setTen(ten);
		kh.setPhone(phone);
		
		dsKh.add(kh);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}
	}

}
