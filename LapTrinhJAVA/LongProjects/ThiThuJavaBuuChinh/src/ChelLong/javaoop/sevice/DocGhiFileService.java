package ChelLong.javaoop.sevice;

import java.util.ArrayList;

public interface DocGhiFileService<T> {
	public boolean luuFile(ArrayList<T>list, String path);
	public ArrayList<T> docFile(String path);
}
