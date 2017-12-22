package ChelLong.javacoban;

import java.util.ArrayList;

public class HocArrayList {
	public static void main (String[]args) {
//		ArrayList ds = new ArrayList();
//		ds.add("x");
//		ds.add(9+"");
//		ds.add(5.6);
//		
//		ArrayList ds2 = new ArrayList();
//		ds2.add("1.5");
		
		ArrayList ds3 = new ArrayList();
		ds3.add("An");
		ds3.add("bình");
		ds3.add("giải thoát");
		ds3.add(2, "tèo");
		
		
		/*cách duyệt 1*/
		for (int i = 0; i < ds3.size(); i++) {
			String x = ds3.get(i) + " ";
			System.out.println(x);
		}
		
		/*cách duyệt 2*/
		for (Object data : ds3) {
			System.out.println(data);
		}
		
		ArrayList<Double> ds4 = new ArrayList<Double>(); 
		for (int i = 0; i < 100; i++) {
			ds4.add(i*2.0);
		}
		for (double x : ds4) {
			System.out.println(x);
		}
		
		ArrayList<Float> ds5 = new ArrayList<Float>();
		ds5.add(1.5f);
		ds5.add(1.8f);
		System.out.println("số phần tử của ds5 : " + ds5.size());
		ds5.add(133.12f);
		System.out.println("số phần tử của ds5 là: " + ds5.size());
		ds5.remove(1.5f);
		
		System.out.println("các phần tử trong ds5 là");
		for (float x : ds5) {
			System.out.println(x);
		}
		ds5.set(0, 765.6f);
		System.out.println("các phần tử trong ds5 sau khi sửa là");
		for (float x : ds5) {
			System.out.println(x);
		}
	}
}
