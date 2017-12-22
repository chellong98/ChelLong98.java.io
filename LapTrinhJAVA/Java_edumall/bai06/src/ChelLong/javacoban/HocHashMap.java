package ChelLong.javacoban;

import java.util.HashMap;

public class HocHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> ds = new HashMap<Integer, String>();
		ds.put(113, "nguyễn văn tèo, quê ở hoàng sa");
		ds.put(114, "Trần thị Mẹt, quê ở trường sa");
		ds.put(115, "Nguyễn văn tùn, quê ở cà mau");
		
		String nv = ds.get(114);
		
		System.out.println(nv);
		
		System.out.println("nhân viên toàn bộ của công ty là: ");
		for (String ten : ds.values()) {
			System.out.println(ten);
		}
		
		ds.remove(115);
		System.out.println("nhân viên toàn bộ của công ty là: ");
		for (String ten : ds.values()) {
			System.out.println(ten);
		}
	}

}
