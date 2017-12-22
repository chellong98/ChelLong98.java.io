

import java.util.Scanner;
public class mangSoNguyen {


	public static void nhapMang(int a[], int n) {
		Scanner sc = new Scanner (System.in);
		for (int i = 0 ; i < n ; i++ ) {
			System.out.println("nhap vao so thu " + (i + 1));
			a[i] = sc.nextInt();
		}
	}

	public static void inMang(int a[], int n) {
		System.out.println("in mang: ");
		for (int element : a ) {
			System.out.print(element + " | ");
		}
		System.out.println();
	}

	public static void timMaxMin (int a[], int n) {
		int max = a[0];
		int min = a[0];
		for (int i = 0 ; i < n ; i++ ) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("max = " + max) ;
		System.out.println("min =  " + min);
	}

	public static int demSoChan (int a[], int n) {
		int dem = 0;
		for (int i = 0 ; i < n ; i++ ) {
			if (a[i] %2 == 0) {
				dem ++;
			}
		}
		return dem;
	}

	public static boolean kiemTraSoNguyenTo (int mau) {
		int dem = 0;
		for (int i = 1 ; i <= mau ; i++ ) {
			if (mau % i == 0) {
				dem ++;
			}
		}
		return dem == 2;
	}
	public static void timSoNguyento (int a[], int n ) {
		System.out.println("cac so nguyen to la: ");
		for (int i = 0 ; i < n ; i++ ) {
			if (kiemTraSoNguyenTo(a[i])) {
				System.out.print(a[i] + " | ");
			}
		}
		System.out.println();
	}

	public static void sapXepMang(int a[], int n) {
		for (int i = 0; i < n - 1 ; i++ ) {
			for (int j = n - 1; j > i; j-- ) {
				if (a[j] > a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}

	public static void timPhanTu (int a[], int n) {
		int phantu;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao phan tu can tim kiem: ");
		phantu = sc.nextInt();
		for (int i = 0; i < n; i++ ) {
			if (a[i] == phantu) {
				System.out.println("tim thay phan tu " + phantu + "o vi tri thu " + (i+1));
				return;
			} else {
				System.out.println("")
			}
		}
	}
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("nhap vao n so nguyen: ");
		n = sc.nextInt();
		int a[] = new int[n];
		nhapMang(a , n);
		inMang(a , n);
		timMaxMin(a,n);
		int sochan = demSoChan(a,n);
		System.out.println("so so chan la: " + sochan);
		timSoNguyento(a,n);
		sapXepMang(a,n);
		inMang(a,n);
		timPhanTu(a,n);

	}
}