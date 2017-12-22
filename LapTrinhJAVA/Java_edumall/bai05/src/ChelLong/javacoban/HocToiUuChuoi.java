package ChelLong.javacoban;

public class HocToiUuChuoi {

	public static void main (String[] args) {
		String s = "   Nguyễn    Nhật   Long    ";
		System.out.println(s);
		s.trim(); //xóa khoảng trắng 2 đầu chuỗi
		String[] arr = s.split(" "); //ngắt chuỗi theo khoảng trắng
		String sToiUu = "";
		for (String tu : arr) {
			if (tu.trim().length() != 0) { //nếu độ dài từ đó sau khi loại bỏ khoảng trắng 2 đầu khác 0
				sToiUu += tu + " "; //
			}
		}
		System.out.println(sToiUu);
	}
}
