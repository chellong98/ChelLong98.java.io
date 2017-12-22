package ChelLong.javacoban.HocFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TextFileFactory {
	public static boolean luuFile (ArrayList<KhachHang>dskh, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path); // luồng từ ngoài 
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); //luồng ghi file
			BufferedWriter bw = new BufferedWriter(osw); //bộ nhớ đệm ghi file
			
			for(KhachHang kh : dskh) {
				String line = kh.getMa() + " ; " + kh.getTen();
				bw.write(line); //ghi từ bộ đệm vào file
				bw.newLine(); //dòng mới
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<KhachHang>docFile(String path) {
		ArrayList<KhachHang>dskh = new ArrayList<KhachHang>();
		
		try {
			FileInputStream fis = new FileInputStream(path); //luồng đọc ra ngoài
			InputStreamReader isr = new InputStreamReader(fis); //luồng đọc file
			BufferedReader br = new BufferedReader(isr); //bộ nhớ đệm đọc  file
			
			String line = br.readLine(); //đọc 1 dòng
			while (line!=null) {
				String [] arr= line.split("[;]"); //ngắt chuỗi theo dấu ;
				if (arr.length == 2) {//lấy ra mã và tên
					KhachHang kh = new KhachHang(arr[1], arr[0]);
					dskh.add(kh);
				}
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dskh;
	}
}
