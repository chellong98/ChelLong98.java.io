package ChelLong.javacoban.UI;

import java.text.DecimalFormat;

public class HocXuLyDinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double toan = 5;
		double ly = 6;
		double hoa = 9;
		double diemTb = (toan + ly + hoa) / 3;
		System.out.println("Điểm trung bình: " + diemTb);
		
		String pattern1 = "#.##"; //mẫu cho số thực
		DecimalFormat decimalFormat = new DecimalFormat(pattern1); //truyền vào patern
		System.out.println("Số sau khi format: " + decimalFormat.format(diemTb));
		
		double x = 11231.34556;
		String pattern2 = "##,###.##";
		decimalFormat = new DecimalFormat(pattern2);
		System.out.println("số sau khi đc format là: " + decimalFormat.format(x));
		
		String pattern3 = "000.##";
		decimalFormat = new DecimalFormat(pattern3);
		System.out.println("số sau khi format là: " + decimalFormat.format(diemTb));
	}

}
