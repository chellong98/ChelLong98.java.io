package thihocki.cau1;

import java.util.Scanner;

public class BaiTapMang {
	public static int N;
	public static Scanner sc = new Scanner(System.in);
	
	public static void nhapMang(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("nhập phần tử " + (i+1));
			arr[i] = Integer.parseInt(sc.nextLine());
		}
	}
	
	public static void xuatMang(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	public static void sapXep(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j > 0; j--) {
				if(arr[j-1] < arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void cacPhanTuChiaHetCho3(int[]arr, int num) {
		System.out.println("các phần tử chia hết cho " + num + " là: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i] + "\t");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("nhập vào số phần tử của mảng: ");
		N = Integer.parseInt(sc.nextLine());
		int[] arr = new int[N];
		nhapMang(arr);
		System.out.println("danh sách các phần tử: ");
		xuatMang(arr);
		sapXep(arr);
		System.out.println("mảng sau khi sắp xếp: ");
		xuatMang(arr);
		cacPhanTuChiaHetCho3(arr, 3);
	}

}
