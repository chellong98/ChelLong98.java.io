import java.util.Scanner;
public class bai10 {
	public static void main (String[]args) {
		Scanner sc =new Scanner (System.in);
		int number;
		System.out.println("nhap vao 1 so nguyen: ");
		number = sc.nextInt();
		int sum = 0;
		while (number > 0) {
			int du = number % 10;
			sum += du;
			number = number/10;
		}
		System.out.println("tong cac chu so  cua " + number + "la: " + sum);
	}
} 