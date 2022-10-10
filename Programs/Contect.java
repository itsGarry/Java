package pojo;

public class Contect {

	private String mobile;
	private String Email;
	private Address address;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contect(String mobile, String email, Address address) {
		super();
		this.mobile = mobile;
		Email = email;
		this.address = address;
	}
	public Contect() {
		super();
	}
	
	
	
}
