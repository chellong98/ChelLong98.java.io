//Bài 5: Chương trình giải phương trình bậc hai
import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {

	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		//ax^2 + bx + c = 0
		int a, b, c;
		System.out.println("nhap vao a: ");
		a = sc.nextInt();
		System.out.println("nhap vao so b: ");
		b = sc.nextInt();
		System.out.println("nhap vao so c: ");
		c = sc.nextInt();

		if (a == 0) {
			//bx + c = 0
			if (b == 0) {
				if (c == 0) {
					System.out.println("phuong trinh vo so nghiem!");
				} else {
					System.out.println("phuong trinh vo nghiem!");
				}
			} else {
					System.out.println("phuong trinh co nghiem duy nhat: " + (float)-c / b);
			}
		} else {
			int denta = b * b - 4 * a * c;
			if (denta < 0) {
				System.out.println("phuong ttrinh co vo nghiem!");
			} else if (denta == 0) {
				System.out.println("phuog trinh co nghiem duy nhat: " + (float)-b / (2*a));
			} else {
				System.out.println("phuong trinh co 2 nghiem phan biet");
				float canDenta = (float)Math.sqrt(denta);
				System.out.println("x1 = " + (float)(-b + canDenta) / (2 * a));
				System.out.println("x2 = " + (float)(-b - canDenta) / (2 * a));
			}
		}

	}
}