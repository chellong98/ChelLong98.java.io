package ChelLong.javacoban;

public class HocOverLoading {

	public static int fn (int x, int y) {
		return x*y;
	}
	public static double fn (double x, double y) {
		return x+y+100;
	}
	//parameter list
	public static int fn4 (int...arr) {
		int sum = 0;
		for (int x : arr) {
			sum += x;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fn(1, 1));
		System.out.println(fn(1.0, 1.0));
		
		System.out.println(fn4(1,2,3,4));
	}

}
