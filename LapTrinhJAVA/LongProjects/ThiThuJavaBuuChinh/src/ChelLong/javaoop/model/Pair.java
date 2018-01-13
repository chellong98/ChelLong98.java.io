package ChelLong.javaoop.model;

import java.util.HashMap;
import java.util.Iterator;

public class Pair<K, V> extends HashMap<K, V>{
	private K key;
	private V value;
	
	
	
	public Pair() {
		super();
	}


	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}


	public K getKey() {
		return key;
	}


	public void setKey(K key) {
		this.key = key;
	}


	public V getValue() {
		return value;
	}


	public void setValue(V value) {
		this.value = value;
	}
	
//	public static void main (String[]args) {
//		Pair<MatHang, Integer>pair = new Pair<MatHang, Integer>();
//		pair.put(new MatHang("mh1", "a", 4, 1000), 2);
//		pair.put(new MatHang("mh2", "b", 5, 2000), 3);
//		pair.put(new MatHang("mh3", "c", 6, 3000), 4);
//		pair.put(new MatHang("mh4", "d", 4, 4000), 5);
//		Iterator<MatHang> it = pair.keySet().iterator();
//		while(it.hasNext()) {
//			MatHang mh = it.next();
//			int quantity = pair.get(mh);
//			System.out.println(mh + " | " + quantity);
//		}
//	}
}
