package ChelLong.javaoop.sevice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Vector;

import ChelLong.javaoop.model.KhachHang;

public class DocGhiFileKhachHangService implements DocGhiFileService<KhachHang> {

	@Override
	public boolean luuFile(ArrayList<KhachHang> list, String path) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
			for(KhachHang kh : list) {
				bw.write(kh.getSoCMTND()+"");
				bw.newLine();
				bw.write(kh.getName());
				bw.newLine();
				bw.write(kh.getAddress());
				bw.newLine();
				bw.write(kh.getCodeCustomer());
				bw.newLine();
				bw.write(kh.getTypeCustomer());
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

	@Override
	public ArrayList<KhachHang> docFile(String path) {
		// TODO Auto-generated method stub
		ArrayList<KhachHang>list = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			String line = br.readLine();
			while(line!=null) {
				
				Vector<String>vec = new Vector<>(); //cho các thuộc tính vào 1 vector
				for(int i=0; i<5; i++) {
					vec.add(line);
					line = br.readLine();
				}
				if(vec.contains("")) { //nếu có 1 khách hàng có thông tin trống thì bỏ khách hàng đó đi
					continue;
				}
				KhachHang kh = new KhachHang();
					kh.setSoCMTND(Integer.parseInt(vec.get(0)));
					kh.setName(vec.get(1));
					kh.setAddress(vec.get(2));
					kh.setCodeCustomer(vec.get(3));
					kh.setTypeCustomer(vec.get(4));
				list.add(kh);
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

}
