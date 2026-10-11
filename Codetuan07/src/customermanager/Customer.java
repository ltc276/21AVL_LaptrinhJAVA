package customermanager;

public class Customer {
    private int customer_ID;
    private String customer_Name;
    private String customer_Gender;
    private int customer_Age;
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCustomer_Gender() {
		return customer_Gender;
	}
	public void setCustomer_Gender(String customer_Gender) {
		this.customer_Gender = customer_Gender;
	}
	public int getCustomer_Age() {
		return customer_Age;
	}
	public void setCustomer_Age(int customer_Age) {
		this.customer_Age = customer_Age;
	}
	public Customer(int customer_ID, String customer_Name, String customer_Gender, int customer_Age) {
		super();
		this.customer_ID = customer_ID;
		this.customer_Name = customer_Name;
		this.customer_Gender = customer_Gender;
		this.customer_Age = customer_Age;
	}
	@Override
	public String toString() {
		return "Customer [customer_ID=" + customer_ID + ", customer_Name=" + customer_Name + ", customer_Gender="
				+ customer_Gender + ", customer_Age=" + customer_Age + "]";
	}

}