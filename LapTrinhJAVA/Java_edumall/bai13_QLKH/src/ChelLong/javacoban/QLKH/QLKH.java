package ChelLong.javacoban.QLKH;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLKH {
	static java.util.List<KhachHang>dskh = new ArrayList<KhachHang>();
	
	public static int menu() {
		System.out.println("1. nhập khách hàng");
		System.out.println("2. xuất khách hàng");
		System.out.println("6. lưu file khách hàng");
		System.out.println("7. đọc file khách hàng");
		System.out.println("8. thoát");
		int chon = 0;
		System.out.println("bạn chọn lệnh nào?[1...8]: ");
		chon = new Scanner(System.in).nextInt();
		return chon;
	}
	
	public static void xuLyNhap() {
		KhachHang kh = new KhachHang();
		System.out.println("nhập vào mã: ");
		int ma = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("nhập vào tên: ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("nhập vào số phone: ");
		String phone = new Scanner(System.in).nextLine();
		
		kh.setMa(ma);
		kh.setName(name);
		kh.setPhone(phone);
		
		dskh.add(kh);
	}
	
	public static void xuLuXuat() {
		System.out.println("===================================");
		System.out.println("danh sách khách hàng: ");
		for(KhachHang kh : dskh) {
			System.out.println(kh);
		}
		System.out.println("===================================");
	}
	
	public static void xuLyLuuFile() {
		try {
			boolean kt = SerializeFileFactory.luuFile(dskh, "G:\\LapTrinhJAVA\\Java_edumall\\bai13_QLKH\\duLieu.txt");
			if(kt) {
				System.out.println("lưu file thành công!");
			} else {
				System.out.println("lưu file thất bại");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void xuLyDocFile() {
		dskh = SerializeFileFactory.docFile("G:\\LapTrinhJAVA\\Java_edumall\\bai13_QLKH\\duLieu.txt");
		System.out.println("Đọc File thành công");
		
		
	}
}
