package ChelLong.javacoban.HocFile;

import java.util.ArrayList;

public class TestKhachHang {
	
	public static void testLuuFile() {
		ArrayList<KhachHang>dskh = new ArrayList<KhachHang>();
		dskh.add(new KhachHang("nguyễn văn an", "kh01"));
		dskh.add(new KhachHang("nguyễn đình thi", "kh02"));
		dskh.add(new KhachHang("nguyễn văn tuân", "kh03"));
		dskh.add(new KhachHang("đặng bình an", "kh04"));
		dskh.add(new KhachHang("trần văn bình", "kh05"));
		
		boolean kt = TextFileFactory.luuFile(dskh, "G:\\LapTrinhJAVA\\Java_edumall\\bai12\\duLieu.txt");
		if (kt) {
			System.out.println("lưu file thành công!");
		} else {
			System.out.println("lưu file thất bại!");
		}
	}
	
	public static void main (String[]args) {
		testLuuFile();
		ArrayList<KhachHang>dskh = TextFileFactory.docFile("G:\\\\LapTrinhJAVA\\\\Java_edumall\\\\bai12\\\\duLieu.txt");
		System.out.println("danh sách khách hàng là: ");
		for(KhachHang kh : dskh) {
			System.out.println(kh);
		}
	}
}
