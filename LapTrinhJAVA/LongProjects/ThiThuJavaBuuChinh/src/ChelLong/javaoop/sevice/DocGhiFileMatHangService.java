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
import ChelLong.javaoop.model.MatHang;

public class DocGhiFileMatHangService implements DocGhiFileService<MatHang> {

	@Override
	public boolean luuFile(ArrayList<MatHang> list, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
			for (MatHang mh : list) {
				bw.write(mh.getCode());
				bw.newLine();
				bw.write(mh.getName());
				bw.newLine();
				bw.write(mh.getQuantity() + "");
				bw.newLine();
				bw.write(mh.getPrice() + "");
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
	public ArrayList<MatHang> docFile(String path) {
		// TODO Auto-generated method stub
		ArrayList<MatHang> list = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			String line = br.readLine();
			while (line != null) {
				Vector<String> vec = new Vector<>();
				for (int i = 0; i < 4; i++) {
					vec.add(line);
					line = br.readLine();
				}
				if (vec.contains("")) {
					continue;
				}
				MatHang mh = new MatHang();
				mh.setCode(vec.get(0));
				mh.setName(vec.get(1));
				mh.setQuantity(Integer.parseInt(vec.get(2)));
				mh.setPrice(Double.parseDouble(vec.get(3)));
				list.add(mh);
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

}
