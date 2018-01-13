package ChelLong.javaoop.model;

public class Nguoi {
	private int soCMTND;
	private String name;
	private String address;
	
	
	public Nguoi() {
		super();
	}
	public Nguoi(int soCMTND, String name, String address) {
		super();
		this.soCMTND = soCMTND;
		this.name = name;
		this.address = address;
	}
	public int getSoCMTND() {
		return soCMTND;
	}
	public void setSoCMTND(int soCMTND) {
		this.soCMTND = soCMTND;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
