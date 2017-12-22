import java.util.Scanner;
public class Tong10SoDauTien {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		for (int i = 0; i<10; i++) {
			sum = sum + i;
		}
		System.out.println("tong 10 so dau tien la: " + sum);
	}
}