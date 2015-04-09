package bean;

public class Customer {
	private int customerId;
	private String customerName;
	private String address;
	private char email;
	private int number;
	private char password;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customer(int customerId, String customerName, String address,
			char email, int number, char password) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.number = number;
		this.password = password;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getEmail() {
		return email;
	}

	public void setEmail(char email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public char getPassword() {
		return password;
	}

	public void setPassword(char password) {
		this.password = password;
	}

}
