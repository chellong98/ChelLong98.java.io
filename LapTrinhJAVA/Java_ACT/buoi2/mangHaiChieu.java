
import java.util.Scanner;
import java.util.Random;

public class mangHaiChieu {
	static int a[][] = null;
	static int row, col;
	static Scanner sc = new Scanner (System.in);

	public static void nhapMang () {
		System.out.println("nhap mang: ");
		for (int i = 0 ; i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {
				System.out.println("nhap phan tu a[" + i + "]" + "[" + j + "]");
				a[i][j] = sc.nextInt();
			}
		}
	}

	public static void inMang() {
		System.out.println("in mang: ");
		for (int i =0 ; i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {
				System.out.print(a[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public static int timMin () {
		int min = a[0][0];
		for (int i = 0 ; i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		return min;
	}

	public static int timPhanTuLeLonNhat () {
		int mangLe[] = new int[row + col];
		int vitri = 0;
		for (int i = 0 ; i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {
				if (a[i][j] % 2 != 0) {
					mangLe[vitri++] = a[i][j];
				}
			}
		}
		int max = mangLe[0];
		for (int i = 0 ; i < vitri ; i++ ) {
			if (mangLe[i] > max) {
				max = mangLe[i];
			}
		}
		return max;
	}

	public static int dongCoTongLonNhat () {
		int tongDong[] = new int[row];
		int vitri = 0;
		for (int i = 0 ; i < row ; i++ ) {
			int sum = 0;
			for (int j = 0 ; j < col ; j++ ) {
				sum += a[i][j];
			}
			tongDong[vitri++] = sum;
		}
		int max = tongDong[0];
		int dong = 0;
		for (int i = 0 ; i < vitri ; i++ ) {
			if (tongDong[i] > max) {
				max = tongDong[i];
				dong = i;
			}
		}
		return (dong + 1);
	}
	public static void main (String[]args) {

		System.out.println ("nhap vao so hang: ");
		row = sc.nextInt();
		System.out.println ("nhap vao so cot: ");
		col = sc.nextInt();
		a = new int[row][col];
		nhapMang();
		inMang();
		int min = timMin();
		System.out.println("phan tu nho nhat la: " + min);
		int maxLe = timPhanTuLeLonNhat();
		System.out.println("phan tu le lon nhat trong mang la: " + maxLe);
		System.out.println("dong co tong lon nhat la: " + dongCoTongLonNhat());
	}
}