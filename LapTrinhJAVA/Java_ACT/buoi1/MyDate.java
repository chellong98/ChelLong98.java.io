public class MyDate {

	public MyDate (){
		System.out.println("toi la phuong thuc khoi tao!");
	}
	private int day, month, year;

	public void setDay (int day) {
		this.day = day;
	}

	public int getDay () {
		return day;
	}
	public static void main (String[] args) {
	MyDate d = new MyDate();
	System.out.println("dia chi cua d la: " + d);
	}
}


