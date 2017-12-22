package ChelLong.javacoban.QLKH;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeFileFactory {
	public static boolean luuFile (List<KhachHang>dskh, String path) {
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dskh);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
	public static List<KhachHang>docFile(String path) {
		List<KhachHang>dskh = new ArrayList<KhachHang>();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dskh = (List<KhachHang>)data;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return dskh;
	}
}
