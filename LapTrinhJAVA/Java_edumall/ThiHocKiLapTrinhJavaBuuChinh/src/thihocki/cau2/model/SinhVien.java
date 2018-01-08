package thihocki.cau2.model;

import java.io.Serializable;

public class SinhVien implements Serializable{
	private String tenSinhVien;
	private int tuoiSinhVien;
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public int getTuoiSinhVien() {
		return tuoiSinhVien;
	}
	public void setTuoiSinhVien(int tuoiSinhVien) {
		this.tuoiSinhVien = tuoiSinhVien;
	}
	@Override
	public String toString() {
		return this.tenSinhVien +" "+ this.tuoiSinhVien;
	}
	
	
}
