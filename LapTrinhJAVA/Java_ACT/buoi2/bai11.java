import java.util.Scanner;

public class bai11 {

	public static int checkSoNguyenTo (int number) {
		int dem = 0;
		for (int i = 1 ; i <= number ; i++ ) {
			if (number % i == 0 ) {
				dem++;
			}
		}
		if (dem == 2) {
			return 1;
		}
		return -1;
	}

	public static void main (String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao 1 so nguyen: ");
		number = sc.nextInt();
		if (checkSoNguyenTo(number) > 0) {
			System.out.println(number + " la so nguyen to ");
		} else {
			System.out.println(number + " khong la so nguyen to ");
		}
	}
}