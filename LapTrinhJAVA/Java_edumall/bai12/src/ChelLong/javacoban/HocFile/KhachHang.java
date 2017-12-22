package ChelLong.javacoban.HocFile;

import java.io.Serializable;

public class KhachHang implements Serializable { //hiện thực serilizable để lưu file dưới dạng 1 dãy bytes
	private String ten;
	private String ma;
	public KhachHang(String ten, String ma) {
		super();
		this.ten = ten;
		this.ma = ma;
	}
	public KhachHang() {
		super();
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	@Override
	public String toString() {
		return "KhachHang [ten=" + ten + ", ma=" + ma + "]";
	}
	
	
}
