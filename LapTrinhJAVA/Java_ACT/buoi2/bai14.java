import java.util.Scanner;

public class bai14 {
	static int row, col;
	static int a[][] = null;
	static Scanner sc = new Scanner (System.in);

	public static void nhapMang() {
		System.out.println("nhap mang: ");
		for (int i = 0 ; i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {				
				do {
					System.out.println("nhap vao phan tu a[" + i + "]" + "[" + j + "]");
					a[i][j] = sc.nextInt();
				}while(a[i][j] > 100 || a[i][j] < 0);
			}
		}
	}

	public static void inMang() {
		System.out.println("in mang: ");
		for(int i = 0 ;i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {
				System.out.print(a[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public static void timMaxVaChiSo () {
		int max = a[0][0];
		int vitrihang = 0, vitricot = 0;
		for(int i = 0 ;i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {
				if (a[i][j] > max) {
					max = a[i][j];
					vitrihang = i;
					vitricot = j;
				} 
			}
		}
		System.out.println("phan tu lon nhat trong ma tran la: " + max + " nam o vi tri a[" + vitrihang + "]" + "[" + vitricot + "]");
	}

	public static int check (int var) {
		int dem = 0;
		for (int i = 1 ; i <= var ; i++ ) {
			if (var % i == 0) {
				dem ++;
			}
		}
		if (dem == 2) {
			return 1;
		}
		return -1;
	}

	public static void inSoNguyenTo () {
		System.out.println("mang so nguyen to la: ");
		for(int i = 0 ;i < row ; i++ ) {
			for (int j = 0 ; j < col ; j++ ) {
				if (check(a[i][j]) > 0) {
					System.out.print(a[i][j] + " | ");
				} else {
					System.out.print(0 + " | ");
				}
			}
			System.out.println();
		}

	}

	public static void sapXepCot () {
		int tangcot = 0;
		while (tangcot < col) {
			for (int i = 0 ; i < row ; i++ ) {
				for (int j = row - 1 ; j > i ; j-- ) {
					if (a[j][tangcot] < a[j-1][tangcot]) {
						int temp = a[j][tangcot];
						a[j][tangcot] = a[j-1][tangcot];
						a[j-1][tangcot] = temp;
					}
				}
			}
			tangcot++;
		}
	}

	// static public void sapXepCotTangDan(){
	// 	for(int i=0;i<col;i++){
	// 		for(int j=0;j<row;j++){
	// 			for(int k=j+1;k<row;k++){
	// 				if(a[i][j]>a[i][k]){
	// 					int bien;
	// 					bien = a[i][j];
	// 					a[i][j] = a[i][k];
	// 					a[i][k] = bien;
	// 				}
	// 			}
	// 		}
	// 	}
	// }

	public static void main (String[] args) {
		System.out.println("nhap vao so dong: ");
		row = sc.nextInt();
		System.out.println("nhap vao so cot: ");
		col = sc.nextInt();
		a = new int[row][col];
		nhapMang();
		inMang();
		timMaxVaChiSo();
		inSoNguyenTo();
		sapXepCot();
		inMang();
	}
}