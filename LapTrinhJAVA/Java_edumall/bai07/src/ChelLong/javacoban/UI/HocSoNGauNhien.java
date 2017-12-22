package ChelLong.javacoban.UI;

import java.util.Random;

public class HocSoNGauNhien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -50+rd.nextInt(101); //khoảng từ -50 đến 100
		}
		System.out.println("mảng sau khi chọn số ngẫu nhiên là: ");
		for (int  i= 0;  i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
