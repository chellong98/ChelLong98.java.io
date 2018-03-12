package pccc.detaikhoahoc.model;

public class ThuatNgu implements Comparable<ThuatNgu>{
	private int soThuTu;
	private String tenThuatNgu;
	private String dinhNghiaThuatNgu;
	private String taiLieuThuatNgu;
	private int isImportant;
	
	public ThuatNgu() {
		
	}
	

	public ThuatNgu(int soThuTu, String tenThuatNgu, String dinhNghiaThuatNgu, String taiLieuThuatNgu,
			int isImportant) {
		super();
		this.soThuTu = soThuTu;
		this.tenThuatNgu = tenThuatNgu;
		this.dinhNghiaThuatNgu = dinhNghiaThuatNgu;
		this.taiLieuThuatNgu = taiLieuThuatNgu;
		this.isImportant = isImportant;
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

	public String getTaiLieuThuatNgu() {
		return taiLieuThuatNgu;
	}
	public void setTaiLieuThuatNgu(String taiLieuThuatNgu) {
		this.taiLieuThuatNgu = taiLieuThuatNgu;
	}

	public int getIsImportant() {
		return isImportant;
	}
	public void setIsImportant(int isImportant) {
		this.isImportant = isImportant;
	}


//	@Override
//	public String toString() {
//		return "ThuatNgu [soThuTu=" + soThuTu + ", tenThuatNgu=" + tenThuatNgu + ", dinhNghiaThuatNgu="
//				+ dinhNghiaThuatNgu + ", taiLieuThuatNgu=" + taiLieuThuatNgu + ", isImportant=" + isImportant + "]";
//	}


	@Override
	public String toString() {
		return this.soThuTu + ". " + this.tenThuatNgu;
	}


@Override
public int compareTo(ThuatNgu tt) {
	// TODO Auto-generated method stub
	if(this.soThuTu > tt.soThuTu) return 1;
	else if(this.soThuTu < tt.soThuTu) return -1;
	else return 0;
}


//@Override
//public String toString() {
//	return "ThuatNgu [soThuTu=" + soThuTu + ", tenThuatNgu=" + tenThuatNgu + ", dinhNghiaThuatNgu=" + dinhNghiaThuatNgu
//			+ ", taiLieuThuatNgu=" + taiLieuThuatNgu + ", isImportant=" + isImportant + "]";
//}

	
}
