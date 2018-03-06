package ChelLong.javaswing.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ChelLong.javaswing.ui.myWordUI;

public class DocFileService {
	public static boolean luuFile(ArrayList<myWordUI>listWord, String path) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(listWord);
			oos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<myWordUI> docFile(String path) {
		ArrayList<myWordUI>list = new ArrayList<>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			list = (ArrayList<myWordUI>)ois.readObject();
			ois.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
