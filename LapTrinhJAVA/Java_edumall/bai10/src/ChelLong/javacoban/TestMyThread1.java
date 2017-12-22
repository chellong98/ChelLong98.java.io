package ChelLong.javacoban;

public class TestMyThread1 {
	public static void main (String[] args) {
		MyThread1 th1 = new MyThread1();
		th1.setName("Tiến trình 1"); // đặt tên
		th1.start(); //kích hoạt tiến trình
		
		MyThread1 th2 = new MyThread1();
		th2.setName("Tiến trình 2");
		th2.start();
	}
}
