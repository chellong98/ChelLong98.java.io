//Bài 2: Chương trình tráo đổi hai số nguyên

import java.util.Scanner;

public class SwapTwoNumber1 {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("nhap vao so b: ");
		b = sc.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("so a sau khi hoan doi la: " + a);
		System.out.println("so b sau khi hoan doi la: " + b);
	}
}