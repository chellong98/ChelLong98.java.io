package com.java.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerilizeFatory {
	public static boolean luuFile(ArrayList<KhachHang>list, String path) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(list);
			oos.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return false;
	}
	
	public static ArrayList<KhachHang> docFile(String path) {
		ArrayList<KhachHang>dsKh = new ArrayList<>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			Object data = ois.readObject();
			dsKh.addAll((ArrayList<KhachHang>)data);
//			dsKh = (ArrayList<KhachHang>)data;
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return dsKh;
	}
}
