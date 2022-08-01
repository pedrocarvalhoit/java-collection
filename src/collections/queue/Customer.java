package collections.queue;

public class Customer {
	
	private String customerID;
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String customerID, String name) {
		this.customerID = customerID;
		this.name = name;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name = " + name ;
	}
	
	
	
	

}
