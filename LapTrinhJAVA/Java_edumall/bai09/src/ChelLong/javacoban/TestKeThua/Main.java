package ChelLong.javacoban.TestKeThua;

import ChelLong.javacoban.KeThua.NhanVien;
import ChelLong.javacoban.KeThua.NhanVienChinhThuc;
import ChelLong.javacoban.KeThua.NhanVienThoiVu;

public class Main {

	public static void main(String[] args) {
		NhanVien nv = new NhanVienChinhThuc();
		nv.setTen("nguyễn Nhật long");
		System.out.println(nv);
		
		NhanVienChinhThuc nvct = new NhanVienChinhThuc();
		nvct.setTen("hoang");
		System.out.println(nvct);
		
		NhanVienThoiVu nvtv = new NhanVienThoiVu();
		nvtv.setTen("lan");
		System.out.println(nvtv);
	}

}
