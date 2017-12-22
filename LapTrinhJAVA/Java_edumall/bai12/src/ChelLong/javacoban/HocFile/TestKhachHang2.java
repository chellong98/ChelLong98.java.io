package ChelLong.javacoban.HocFile;

import java.util.ArrayList;

public class TestKhachHang2 {

	public static void testLuuFile () {
		ArrayList<KhachHang>dskh = new ArrayList<KhachHang>();
		dskh.add(new KhachHang("nguyễn nhật Long", "kh01"));
		dskh.add(new KhachHang("nguyễn văn minh", "kh02"));
		dskh.add(new KhachHang("lê thành an", "kh03"));
		dskh.add(new KhachHang("đặng thái ninh", "kh04"));
		dskh.add(new KhachHang("vũ tường an", "kh05"));
		
		boolean kt = SerializeFileFactory.luuFile(dskh, "G:\\LapTrinhJAVA\\Java_edumall\\bai12\\duLieu2.txt");
		if (kt) {
			System.out.println("lưu file thành công");
		} else {
			System.out.println("lưu file thất bại!");
		}
	}
	
	public static void main (String[]args) {
		testLuuFile();
		ArrayList<KhachHang>dskh = SerializeFileFactory.docFile("G:\\LapTrinhJAVA\\Java_edumall\\bai12\\duLieu2.txt");
		System.out.println("danh sách khách hàng là: ");
		for(KhachHang kh : dskh) {
			System.out.println(kh);
		}
	}
}
