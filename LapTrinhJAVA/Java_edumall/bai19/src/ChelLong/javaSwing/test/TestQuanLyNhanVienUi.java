package ChelLong.javaSwing.test;

import java.io.File;
import java.util.Scanner;

import ChelLong.javaSwing.Ui.QuanLyNhanVienUi;

public class TestQuanLyNhanVienUi {
	public static void main(String[] args) {
		QuanLyNhanVienUi ui = new QuanLyNhanVienUi("QUẢN LÝ HỌC VIÊN");
		ui.showWindow();
//		String fileName = new Scanner(System.in).nextLine();
//		File file = new File (fileName);
//		System.out.println("separator: "+file.separator);
//		System.out.println("pathseparator: "+file.pathSeparator);
	}
}
