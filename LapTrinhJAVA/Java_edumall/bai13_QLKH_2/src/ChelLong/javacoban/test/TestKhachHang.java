package ChelLong.javacoban.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import ChelLong.javacoban.io.SerializableFatory;
import ChelLong.javacoban.model.KhachHang;

public class TestKhachHang {

	static ArrayList<KhachHang> dsKh = new ArrayList<>();
	
	public static void menu() {
		System.out.println("1. nhập khách hàng");
		System.out.println("2. Xuất khách hàng");
		System.out.println("3. Tìm kiếm khách hàng");
		System.out.println("4. Sắp xếp khách hàng");
		System.out.println("5. Lưu khách hàng");
		System.out.println("6. Đọc khách hàng");
		System.out.println("7. thống kê theo nhà mạng");
		System.out.println("8. thoát");
		int choice = 0;
		System.out.println("mời bạn chọn chức năng: ");
		choice = new Scanner(System.in).nextInt();
		switch (choice) {
		case 1:
			xuLyNhap();
			break;
		case 2: 
			xuLyXuat();
			break;
		case 3: 
			xuLyTim();
			break;
		case 4: 
			xuLySapXep();
			break;
		case 5: 
			xuLyLuu();
			break;
		case 6: 
			xuLyDoc();
			break;
		case 7: 
			xyLyThongKe();
			break;
		case 8: 
			xuLyThoat();
			break;
		default:
			System.out.println("mời bạn chọn lại lệnh");
			break;
		}
	}
	
	private static void xuLyThoat() {
		// TODO Auto-generated method stub
		System.out.println("bye bye");
		System.exit(0);
	}

	private static void xyLyThongKe() {
		// TODO Auto-generated method stub
		
	}

	private static void xuLyDoc() {
		// TODO Auto-generated method stub
		dsKh = SerializableFatory.DocFile("data.db");
		System.out.println("đã đọc file thành công");
	}

	private static void xuLyLuu() {
		// TODO Auto-generated method stub
		boolean check = SerializableFatory.LuuFile(dsKh, "data.db");
		if(check) {
			System.out.println("đã lưu file thành công");
		} else {
			System.out.println("đã lưu file thất bại");
		}
	}

	private static void xuLySapXep() {
		// TODO Auto-generated method stub
		Collections.sort(dsKh);
		System.out.println("đã sắp xếp xong số điện thoại");
	}

	private static void xuLyTim() {
		// TODO Auto-generated method stub
		System.out.println("nhập vào đầu số bạn muốn tìm: ");
		String pattern = new Scanner(System.in).nextLine();
		System.out.println("===============================");
		System.out.println("khách hàng có đầu số " + pattern + " là:");
		System.out.println("Mã\tTên\tPhone");
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
		System.out.println("===============================");
	}

	private static void xuLyXuat() {
		// TODO Auto-generated method stub
		System.out.println("===============================");
		System.out.println("Mã\tTên\tPhone");
		for(KhachHang kh : dsKh) {
			System.out.println(kh);
		}
		System.out.println("===============================");
	}

	private static void xuLyNhap() {
		// TODO Auto-generated method stub
		try {
			KhachHang kh = new KhachHang();
			System.out.println("mời bạn nhập mã: ");
			int ma = Integer.parseInt(new Scanner(System.in).nextLine());
			kh.setMa(ma);
			System.out.println("mời bạn nhập tên: ");
			String ten = new Scanner(System.in).nextLine();
			kh.setTen(ten);
			System.out.println("mời bạn nhập số điện thoại: ");
			String phone = new Scanner(System.in).nextLine();
			kh.setPhone(phone);
			
			dsKh.add(kh);
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			menu();
		} while (true);
	}

}
