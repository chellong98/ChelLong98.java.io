package ChelLong.javaSwing.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class PhongBan implements Serializable{
	private String maPhong;
	private String tenPhong;
	private Vector<NhanVien>nhanViens; //mảng nhân viên của phòng ban
	
	public PhongBan() {
		super();
		this.nhanViens = new Vector<NhanVien>();
	}
	
	public void themNhanVien(NhanVien nv) {
		this.nhanViens.add(nv);//thêm nv vào mảng
		nv.setPhong(this);//set phòng ban cho nhân viên mới
	}
	public String getMaPhong() {
		return maPhong;
	}
	
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}


	public Vector<NhanVien> getNhanViens() {
		return nhanViens;
	}

	public void setNhanViens(Vector<NhanVien> nhanViens) {
		this.nhanViens = nhanViens;
	}

	@Override
	public String toString() {
		return this.getTenPhong();
	}
	
	
}
