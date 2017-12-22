import java.util.Scanner;
public class bai8 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen: ");
		int n = sc.nextInt();
		int giaithua = 1;
		float sum = 0;
		for (int i = 1 ; i <= n ; i++ ) {
			giaithua = giaithua * i;
			sum = sum + (float)1/(giaithua);
		}
		System.out.println("tong day la: " + sum);
	}
}