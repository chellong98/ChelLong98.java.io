package ChelLong.javacoban.QLNV;

public class NhanVien implements Comparable<NhanVien>{
	public String ten;
	public int ma;
	
	public NhanVien(String ten, int ma) {
		super();
		this.ten = ten;
		this.ma = ma;
	}

	public NhanVien() {
		super();
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	@Override
	public int compareTo(NhanVien o) {
		int soSanhTen = this.ten.compareToIgnoreCase(o.getTen()); //so sánh ko phân biệt chữ hoa chữ thường
		if(soSanhTen == 0) {
			if (this.ma > o.getMa()) {
				return -1;
			} else if (this.ma < o.getMa()){
				return 1;
			}
			return 0;
		}
		return soSanhTen;
	}
	
	
	
}
