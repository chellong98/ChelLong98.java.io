package pccc.detaikhoahoc.model;

public class ThuatNgu {
	private int soThuTu;
	private String tenThuatNgu;
	private String dinhNghiaThuatNgu;
	
	public ThuatNgu() {
		
	}
	
	public ThuatNgu(int soThuTu, String tenThuatNgu, String dinhNghiaThuatNgu) {
		super();
		this.soThuTu = soThuTu;
		this.tenThuatNgu = tenThuatNgu;
		this.dinhNghiaThuatNgu = dinhNghiaThuatNgu;
	}
	public int getSoThuTu() {
		return soThuTu;
	}
	public void setSoThuTu(int soThuTu) {
		this.soThuTu = soThuTu;
	}
	public String getTenThuatNgu() {
		return tenThuatNgu;
	}
	public void setTenThuatNgu(String tenThuatNgu) {
		this.tenThuatNgu = tenThuatNgu;
	}
	public String getDinhNghiaThuatNgu() {
		return dinhNghiaThuatNgu;
	}
	public void setDinhNghiaThuatNgu(String dinhNghiaThuatNgu) {
		this.dinhNghiaThuatNgu = dinhNghiaThuatNgu;
	}

	@Override
	public String toString() {
		return this.tenThuatNgu;
	}
	
	
}
