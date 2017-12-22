import java.util.Scanner;
public class tinhToan {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b;
		System.out.println("nhap so nguyen a: ");
		a = sc.nextInt();
		System.out.println("nhap so nguyen b: ");
		b = sc.nextInt();

		int tong = a + b;
		System.out.println("tong = " + tong);
		int hieu = a - b;
		System.out.println("hieu = " + hieu);
		int tich = a * b;
		System.out.println("tich = " + tich);
		if (b != 0) {
			double thuong = (double) a / b;
			System.out.println("thuong = " + thuong);
		}
	}
}