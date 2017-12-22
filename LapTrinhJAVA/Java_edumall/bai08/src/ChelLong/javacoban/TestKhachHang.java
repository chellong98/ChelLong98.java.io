package ChelLong.javacoban;

public class TestKhachHang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KhachHang teo = new KhachHang();
		teo.setMa("NV1");
		teo.setTuoi(30);
		teo.setTen("Trần văn tèo");
		teo.setDiaChi("cà mau");
		System.out.println(teo);
		
		System.out.println("tui chỉ muốn lấy địa chỉ: " + teo.getDiaChi());
		
		KhachHang ty = new KhachHang();
		ty.setTen("Hồ thị tý");
		
		System.out.println("Tên của tèo: " + teo.getTen());
		System.out.println("tên của tý: " + ty.getTen());
		
		teo = ty; //đối tượng tèo tham chiếu đến vùng nhớ của tý
		teo.setTen("hồ văn đồ"); //tham chiếu thay đổi giá trị tên
		
		System.out.println("tên của tý: " + ty.getTen());
	}

}
