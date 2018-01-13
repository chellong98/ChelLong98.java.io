package ChelLong.javaoop.test;

import java.util.ArrayList;

import ChelLong.javaoop.model.KhachHang;
import ChelLong.javaoop.model.MatHang;
import ChelLong.javaoop.sevice.DocGhiFileKhachHangService;
import ChelLong.javaoop.sevice.DocGhiFileMatHangService;

public class TestService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DocGhiFileKhachHangService KhachHangService = new DocGhiFileKhachHangService();
//		ArrayList<KhachHang>list = new ArrayList<>();
//		list.add(new KhachHang(324245232, "a", "a1", "kh1", "mua lẻ"));
//		list.add(new KhachHang(312837198, "b", "b1", "kh2", "mua buôn"));
//		list.add(new KhachHang(154648598, "c", "", "kh3", "mua online"));
//		DocGhiFileKhachHangService KhachHangService = new DocGhiFileKhachHangService();
//		if(KhachHangService.luuFile(list, "KHACHHANG.txt")) {
//			System.out.println("lưu file thành công");
//		}
//		ArrayList<KhachHang>list = KhachHangService.docFile("KHACHHANG.txt");
//		for(KhachHang kh : list) {
//			System.out.println(kh);
//		}
		
		
		DocGhiFileMatHangService matHangService = new DocGhiFileMatHangService();
//		ArrayList<MatHang>list = new ArrayList<>();
//		list.add(new MatHang("mh1", "m1", 3, 4000));
//		list.add(new MatHang("mh2", "", 4, 5000));
//		list.add(new MatHang("mh3", "m3", 5, 6000));
//		if(matHangService.luuFile(list, "MATHANG.txt")) {
//			System.out.println("lưu file thành công");
//		}
		ArrayList<MatHang>list = matHangService.docFile("MATHANG.txt");
		for(MatHang mh : list) {
			System.out.println(mh);
		}
	}

}
