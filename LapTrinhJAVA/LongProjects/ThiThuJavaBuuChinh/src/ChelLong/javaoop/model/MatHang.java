package ChelLong.javaoop.model;

public class MatHang {
	private String code;
	private String name;
	private int quantity;
	private double price;
	
	
	
	public MatHang() {
		super();
	}
	public MatHang(String code, String name, int quantity, int price) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
