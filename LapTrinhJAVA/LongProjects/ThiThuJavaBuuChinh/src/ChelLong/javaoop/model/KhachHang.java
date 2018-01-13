package ChelLong.javaoop.model;

public class KhachHang extends Nguoi {
	private String codeCustomer;
	private String typeCustomer;
	
	
	public KhachHang() {
		super();
	}
	
	public KhachHang(int soCMTND, String name, String address, String codeCustomer, String typeCustomer) {
		super(soCMTND, name, address);
		this.codeCustomer = codeCustomer;
		this.typeCustomer = typeCustomer;
	}

	public String getCodeCustomer() {
		return codeCustomer;
	}
	public void setCodeCustomer(String codeCustomer) {
		this.codeCustomer = codeCustomer;
	}
	public String getTypeCustomer() {
		return typeCustomer;
	}
	public void setTypeCustomer(String typeCustomer) {
		this.typeCustomer = typeCustomer;
	}

	@Override
	public String toString() {
		return this.codeCustomer;
	}

//	@Override
//	public String toString() {
//		return "KhachHang [codeCustomer=" + codeCustomer + ", typeCustomer=" + typeCustomer + ", getSoCMTND()="
//				+ getSoCMTND() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
//	}
	
	
}
