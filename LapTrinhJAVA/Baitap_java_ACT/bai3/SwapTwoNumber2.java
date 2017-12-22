//Bài 3: Chương trình tráo đổi hai số nguyên sử dụng biến thứ ba
import java.util.Scanner;

public class SwapTwoNumber2 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("nhap vao so b: ");
		b = sc.nextInt();

		int temp = a;
		a = b;
		b = temp;

		System.out.println("so a sau khi hoan doi la: " + a);
		System.out.println("so b sau khi hoan doi la: " + b);
	}
}