package ChelLong.javaSwing.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class SerilizeFileFactory {
	public static boolean luuFile(Vector<NhanVien>NhanViens, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(NhanViens);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public static Vector<NhanVien> docFile(String path) {
		Vector<NhanVien>NhanViens = new Vector<NhanVien>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			NhanViens = (Vector<NhanVien>)data;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return NhanViens;
	}
}
