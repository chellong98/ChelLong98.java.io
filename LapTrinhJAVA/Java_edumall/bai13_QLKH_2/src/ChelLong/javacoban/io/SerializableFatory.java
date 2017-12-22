package ChelLong.javacoban.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ChelLong.javacoban.model.KhachHang;

public class SerializableFatory {
	public static boolean LuuFile(ArrayList<KhachHang> list, String path) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(list);
			oos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<KhachHang> DocFile(String path) {
		ArrayList<KhachHang>list = new ArrayList<>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			Object readObject = ois.readObject();
			list = (ArrayList<KhachHang>)readObject;
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
