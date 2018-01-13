package ChelLong.javaoop.model;

import java.util.Date;
import java.util.Iterator;

public class HoaDon {
	private String code;
	private Date timeCreated;
	private String codeCustomer;
	private Pair<MatHang, Integer> pair;
	private double sumPrice;
	
	
	public HoaDon() {
		super();
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}
	public String getCodeCustomer() {
		return codeCustomer;
	}
	public void setCodeCustomer(String codeCustomer) {
		this.codeCustomer = codeCustomer;
	}
	public Pair<MatHang, Integer> getPair() {
		return pair;
	}
	public void setPair(Pair<MatHang, Integer> pair) {
		this.pair = pair;
	}
	public void addPair(MatHang mh, int quantity) { //thêm 1 cặp kh,số lượng vào pair
		pair.put(mh, quantity);
	}

	public double getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice() {
		Iterator<MatHang> it = this.pair.keySet().iterator();
		int sumPrice = 0;
		while(it.hasNext()) {
			MatHang mh = it.next();
			sumPrice += mh.getPrice();
		}
		this.sumPrice = sumPrice;
	}
	
	
}
