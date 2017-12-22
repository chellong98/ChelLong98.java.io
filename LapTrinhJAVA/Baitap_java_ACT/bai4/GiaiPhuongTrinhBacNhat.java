//Bài 5: Chương trình giải phương trình bậc nhất

import java.util.Scanner;
public class GiaiPhuongTrinhBacNhat {

	public static void main (String[]args) {
		// ax + b = 0
		int a , b;
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap vao a: ");
		a = sc.nextInt();
		System.out.println("nhap vao so b: ");
		b = sc.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("phuong trinh vo so nghiem!");
			} else {
				System.out.println("phuong trinh vo nghiem!");
			}
		} else {
			System.out.println("phuong trinh co nghiem: " + (float)-b/a);
		}
	}
}