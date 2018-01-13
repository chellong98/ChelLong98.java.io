package thihocki.cau2.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import thihocki.cau2.model.SinhVien;

public class DocGhiFileSinhVienService {
	public static boolean luuFile(ArrayList<SinhVien>list, String path) {
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
	
	public static ArrayList<SinhVien>docFile(String path) {
		ArrayList<SinhVien>list = new ArrayList<>();
		try {
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream(path));
			list = (ArrayList<SinhVien>)ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
