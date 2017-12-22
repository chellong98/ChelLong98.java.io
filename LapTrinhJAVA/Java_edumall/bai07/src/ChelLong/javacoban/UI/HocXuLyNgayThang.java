package ChelLong.javacoban.UI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HocXuLyNgayThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance(); //lấy ra thời gian và vị trí hiện tại
		int nam = cal.get(Calendar.YEAR); //lấy ra năm hiện tại
		System.out.println("năm nay là: " + nam);
		System.out.println("hôm nay là ngày " + cal.get(Calendar.DATE));
		System.out.println("bây giờ là " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
		
		Date t =cal.getTime(); //đối tượng thời gian hiện tại
		System.out.println(t);
		
		//d(day) 
		//M (month)
		//y (year)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("hôm nay là: " + sdf.format(t));
	}

}
