package ChelLong.javaSwing.model;

import java.util.Vector;

public class NhomKhachHang {
	private String ma;
	private String ten;
	private Vector<KhachHang>khachHangs;
	
	public NhomKhachHang(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
		khachHangs = new Vector<KhachHang>();
	}
	
	public NhomKhachHang() {
		super();
		khachHangs = new Vector<KhachHang>();
	}

	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Vector<KhachHang> getKhachHangs() {
		return khachHangs;
	}
	public void setKhachHangs(Vector<KhachHang> khachHangs) {
		this.khachHangs = khachHangs;
	}
	
	public void themKhachHang(KhachHang kh) {
		khachHangs.add(kh);
		kh.setNhom(this);// đặt nhóm cho khách hàng
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ten;
	}
}
