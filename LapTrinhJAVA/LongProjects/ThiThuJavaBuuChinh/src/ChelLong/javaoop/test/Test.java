package ChelLong.javaoop.test;

import java.util.Iterator;

import javax.lang.model.element.QualifiedNameable;

import ChelLong.javaoop.model.HoaDon;
import ChelLong.javaoop.model.MatHang;
import ChelLong.javaoop.model.Pair;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoaDon hd = new HoaDon();
		hd.setPair(new Pair<MatHang, Integer>());
		hd.getPair().put(new MatHang("mh1", "a", 4, 1000), 2);
		hd.getPair().put(new MatHang("mh2", "b", 5, 2000), 3);
		hd.getPair().put(new MatHang("mh3", "c", 6, 3000), 4);
		hd.getPair().put(new MatHang("mh4", "d", 4, 4000), 5);
		Iterator<MatHang>it = hd.getPair().keySet().iterator();
		while(it.hasNext()) {
			MatHang mh = it.next();
			int quantity = hd.getPair().get(mh);
			System.out.println(mh + " | " + quantity);
		}
		hd.setSumPrice();
		System.out.println("tổng tiền: " + hd.getSumPrice());
	}

}
