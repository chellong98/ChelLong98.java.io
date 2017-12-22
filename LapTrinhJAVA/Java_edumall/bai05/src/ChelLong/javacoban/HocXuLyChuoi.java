package ChelLong.javacoban;

public class HocXuLyChuoi {
	
	public static void main (String[]args) {
		String s = "3 Topica Education 5";
		System.out.println("chiều dài chuỗi là: " + s.length());
		//Đếm xem chuỗi có bao nhiêu chữ in hoa, in thường, số
		
		char[] arr = s.toCharArray();
		int SoKiTuInHoa = 0;
		int SoKiTuInThuong = 0;
		int SoChuSo = 0;
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (Character.isUpperCase(c)) { //hàm kiểm tra xem có phải chứ hoa k?
				SoKiTuInHoa++;
			}
			if (Character.isLowerCase(c)) {//hàm kiểm tra xem có phải chứ Thường k?
				SoKiTuInThuong++;
			}
			if (Character.isDigit(c)) { //hàm kiểm tra xem có phải chữ số hay k?
				SoChuSo++;
			}
			System.out.println("Số kí tự in hoa: " + SoKiTuInHoa + " \nSố kí tự in thường " + SoKiTuInThuong + "\nSố chữ số: " + SoChuSo);
			
			/*-=--------------------------------------*/
			
			String baihat1 = "D:/music/nhachot/chiyeuminhem.mp3";
			int vitricuoi = baihat1.lastIndexOf("/");//lấy ra vị trí dấu "/" cuối cùng
			String tenBaiHat = baihat1.substring(vitricuoi + 1); 
			System.out.println("tên bài hát: " + tenBaiHat);
			int vitricuoiDauCham = baihat1.lastIndexOf("."); //lấy ra vị trí cuối của dấu "."
			tenBaiHat = baihat1.substring(vitricuoi + 1, vitricuoiDauCham); //lấy chuỗi con từ vị trí này đến vị trí kia
			System.out.println("tên bài hát không có đuôi: " + tenBaiHat);
			
		}
	}
}
