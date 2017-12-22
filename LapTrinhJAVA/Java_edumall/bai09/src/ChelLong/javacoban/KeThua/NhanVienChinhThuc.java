package ChelLong.javacoban.KeThua;

public class NhanVienChinhThuc extends NhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int xuatLuong() {
		// TODO Auto-generated method stub
		return 5000;
	}
	
	@Override
	public String toString() { //ghi đè tostring cho nvct
		return super.toString() + "===>vì là nhân viên chính thức!";
	}
}

