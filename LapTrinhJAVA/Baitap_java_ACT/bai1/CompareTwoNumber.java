//bài 1: Chương trình kiểm tra so sánh hai số nguyên

import java.util.Scanner;

public class CompareTwoNumber {
	public static void main (String[]args) {
		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao so b: ");
		b = sc.nextInt();

		boolean KiemTra = (a == b);
		System.out.println(a + " co bang " + b + " hay khong? " + KiemTra);
		KiemTra = (a > b);
		System.out.println(a + " co lon hon "+ b + " hay khong? " + KiemTra);
		KiemTra = (a < b);
		System.out.println(b + " co lon hon" + a + " hay khong? " + KiemTra);
	}
}