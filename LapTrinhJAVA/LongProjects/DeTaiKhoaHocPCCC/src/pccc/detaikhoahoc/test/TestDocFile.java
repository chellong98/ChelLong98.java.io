package pccc.detaikhoahoc.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Vector;

import pccc.detaikhoahoc.model.ThuatNgu;
import pccc.detaikhoahoc.service.ThuatNguService;

public class TestDocFile {
	public static int i=1;
	public static Vector<ThuatNgu> docFile(String path) {
		Vector<ThuatNgu>vec = new Vector<>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			String line = br.readLine();
			while(line!=null) {
				ThuatNgu tt = new ThuatNgu();
				String[] arr = line.split("[|]");
				if(arr.length==3) {
					tt.setSoThuTu(i++);
					tt.setTenThuatNgu(arr[1].trim());
					tt.setDinhNghiaThuatNgu(arr[2].trim());
				}
				line = br.readLine();
				arr = line.split("[|]");
				if(arr.length==3) {
					tt.setTaiLieuThuatNgu(arr[2].trim());
					tt.setIsImportant(0);
				}
//				System.out.println(tt);
				vec.add(tt);
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vec;
	}
	
	public static boolean luuFile(Vector<ThuatNgu>vec, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
			for(ThuatNgu tt : vec) {
				String line = tt.getSoThuTu()+";"+tt.getTenThuatNgu()+";"+tt.getDinhNghiaThuatNgu()+";"+tt.getTaiLieuThuatNgu();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public static Vector<ThuatNgu> docFile1(String path) {
		Vector<ThuatNgu>vec = new Vector<>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			String line = br.readLine();
			while (line!=null) {
				ThuatNgu tt = new ThuatNgu();
				String[] arr = line.split("[;]");
				for(String str : arr) {
					System.out.println(str);
				}
				System.out.println();
				if(arr.length==4) {
					tt.setSoThuTu(Integer.parseInt(arr[0]));
					tt.setTenThuatNgu(arr[1]);
					tt.setDinhNghiaThuatNgu(arr[2]);
					tt.setTaiLieuThuatNgu(arr[3]);
					tt.setIsImportant(0);
					
					
				}
				vec.add(tt);
//				System.out.println(tt);
				line=br.readLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return vec;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<ThuatNgu>vec = docFile("STT1.txt");
		
		for(ThuatNgu tt : vec) {
			System.out.println(tt);
		}
		System.out.println(vec.size());
//		if(luuFile(vec, "STT1.txt")) {
//			System.out.println("lưu file thành công");
//		}
		ThuatNguService service = new ThuatNguService();
		int ret = service.themThuatNgu(vec);
		if(ret>0) {
			System.out.println(ret);
			System.out.println("thêm vào database thành công");
		}
	}

}
