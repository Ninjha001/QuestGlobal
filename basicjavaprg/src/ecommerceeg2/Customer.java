package ecommerceeg2;

public abstract class Customer extends Product {
    private String customerId;
    private String customerName;
    private String email;
    private String shippingAddress;

    public Customer(Product p,String customerId, String customerName, String email,String shippingAddress) {
        super(p.getProductId(),p.getProductName(),p.getPrice(),p.getQuantity());
    	this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.setShippingAddress(shippingAddress);
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
