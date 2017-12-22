package ChelLong.javacoban.QLNV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		ds.add(new NhanVien("long", 2));
		ds.add(new NhanVien("hoang", 5));
		ds.add(new NhanVien("nam", 3));
		ds.add(new NhanVien("hong", 4));
		ds.add(new NhanVien("an", 1));
		ds.add(new NhanVien("an", 8));
		
		Collections.sort(ds);
		
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i).getTen() + " | " + ds.get(i).getMa());
		}
	}

}
