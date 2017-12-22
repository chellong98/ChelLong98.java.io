package ChelLong.javacoban.QLKH;

public class Main {
	public static void main (String[] args) {
		do {
			int chon = QLKH.menu();
			switch(chon) {
				case 1: QLKH.xuLyNhap();break;
				case 2: QLKH.xuLuXuat();break;
				case 6: QLKH.xuLyLuuFile();break;
				case 7: QLKH.xuLyDocFile();break;
				case 8: return;
				default: System.out.println("mời bạn nhập lại lệnh");
			}
		}while(true);
	}
}
