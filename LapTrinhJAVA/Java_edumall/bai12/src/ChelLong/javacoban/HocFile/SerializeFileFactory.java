package ChelLong.javacoban.HocFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeFileFactory {
	public static boolean luuFile(ArrayList<KhachHang> dskh, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path); //luồng từ ngoài vào file
			ObjectOutputStream oos = new ObjectOutputStream(fos);//luồng ghi object
			oos.writeObject(dskh); //method ghi ob
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<KhachHang> docFile(String path) {
		ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dskh = (ArrayList<KhachHang>)data;
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dskh;
	}
}
