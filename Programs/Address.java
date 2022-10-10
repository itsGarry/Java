package pojo;

public class Address {

	
	private String Address1;
	private String Address2;
	private String city;
	private String state;
	private String pin;
	
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Address(String name, String address1, String address2, String city, String state, String pin) {
		super();
	
		Address1 = address1;
		Address2 = address2;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [Address1=" + Address1 + ", Address2=" + Address2 + ", city=" + city
				+ ", state=" + state + ", pin=" + pin + "]";
	}
	
	
}
