import java.util.Scanner;
public class Tong10SoChanDauTien {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		int dem = 0;
		int i = 0;
		while (dem <= 10) {
			sum = sum + i;
			dem++;
			i = i + 2;
		}
		System.out.println("tong 10 chan so dau tien la: " + sum);
	}
}