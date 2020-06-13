package logic;

public class HomeFuelingOrder {
	private String orderID;
	private String address;
	private String status;
	private float delivery_price;
	private float toltal;
	private String saleID;
	private String date;
	private float quantity;
	private int priority;
	private String expected_date;
	
	
	public void change_address(String adrss) {}
	public void change_expected_delivery_date(String dte) {}
	public void change_quantity() {}
	public HomeFuelingOrder(String orderID, String address, String status, float delivery_price, float toltal,
			String saleID, String date, float quantity, int priority, String expected_date) {
		super();
		this.orderID = orderID;
		this.address = address;
		this.status = status;
		this.delivery_price = delivery_price;
		this.toltal = toltal;
		this.saleID = saleID;
		this.date = date;
		this.quantity = quantity;
		this.priority = priority;
		this.expected_date = expected_date;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getDelivery_price() {
		return delivery_price;
	}
	public void setDelivery_price(float delivery_price) {
		this.delivery_price = delivery_price;
	}
	public float getToltal() {
		return toltal;
	}
	public void setToltal(float toltal) {
		this.toltal = toltal;
	}
	public String getSaleID() {
		return saleID;
	}
	public void setSaleID(String saleID) {
		this.saleID = saleID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getExpected_date() {
		return expected_date;
	}
	public void setExpected_date(String expected_date) {
		this.expected_date = expected_date;
	}
	

}
