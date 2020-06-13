package logic;

public class Product {
	private int product_id;
	private String name;
	private String description;
	private Employee supplier;
	private float price;
	private float low_quantity;
	private float min_quantity;
	public Gas_Station gas_station;
	public Product( int product_id,String name,String description, Employee supplier, float price, float low_quantity, float min_quantity, Gas_Station gas_station) {
		setDescription(description);
		setGas_station(gas_station);
		setLow_quantity(low_quantity);
		setLow_quantity(low_quantity);
		setName(name);
		setPrice(price);
		setProduct_id(product_id);
		setSupplier(supplier);
		
	}
	public Gas_Station getGas_station() {
		return gas_station;
	}
	public void setGas_station(Gas_Station gas_station) {
		this.gas_station = gas_station;
	}
	//public Report _unnamed_Report_;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Employee getSupplier() {
		return supplier;
	}
	public void setSupplier(Employee supplier) {
		this.supplier = supplier;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getLow_quantity() {
		return low_quantity;
	}
	public void setLow_quantity(float low_quantity) {
		this.low_quantity = low_quantity;
	}
	public float getMin_quantity() {
		return min_quantity;
	}
	public void setMin_quantity(float min_quantity) {
		this.min_quantity = min_quantity;
	}
}
